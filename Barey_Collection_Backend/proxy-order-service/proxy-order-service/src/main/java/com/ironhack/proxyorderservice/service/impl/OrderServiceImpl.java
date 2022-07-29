package com.ironhack.proxyorderservice.service.impl;

import com.ironhack.proxyorderservice.controller.dto.OrderDTO;
import com.ironhack.proxyorderservice.service.interfaces.OrderService;
import com.ironhack.proxyorderservice.repository.interfaces.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;
    @Override
    public List<OrderDTO> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public void renovate(Integer numberOrder, OrderDTO orderDTO) {

    }
}
