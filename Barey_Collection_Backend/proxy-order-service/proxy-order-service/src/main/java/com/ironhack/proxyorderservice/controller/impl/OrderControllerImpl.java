package com.ironhack.proxyorderservice.controller.impl;

import com.ironhack.proxyorderservice.controller.interfaces.OrderController;
import com.ironhack.proxyorderservice.repository.interfaces.OrderRepository;
import com.ironhack.proxyorderservice.service.interfaces.OrderService;
import com.ironhack.proxyorderservice.controller.dto.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class OrderControllerImpl implements OrderController {

    @Autowired
    private OrderRepository orderRepository;

    private OrderService orderService;

    @GetMapping("/orders")
    @ResponseStatus(HttpStatus.OK)
    public List<OrderDTO> findAll() {
        List<OrderDTO> orderDTOList = orderService.findAll();
        return orderDTOList;
    }

    @GetMapping("/orders/{numberOrder}")
    @ResponseStatus(HttpStatus.OK)
    public OrderDTO findByNumberOrder(@PathVariable Integer numberOrder) {
        return orderRepository.findByNumberOrder(numberOrder);
    }


    //Creamos un PUT, para actualizar los pedidos

    @PutMapping("/orders/{numberOrder}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@PathVariable Integer numberOrder, @RequestBody @Valid OrderDTO orderDTO) {
        orderService.renovate(numberOrder, orderDTO);
    }


}
