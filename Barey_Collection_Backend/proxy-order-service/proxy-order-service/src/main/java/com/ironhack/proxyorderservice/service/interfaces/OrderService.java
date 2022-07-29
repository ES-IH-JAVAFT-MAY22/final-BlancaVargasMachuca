package com.ironhack.proxyorderservice.service.interfaces;

import com.ironhack.proxyorderservice.controller.dto.OrderDTO;

import java.util.List;

public interface OrderService {
    List<OrderDTO> findAll();

    void renovate(Integer numberOrder, OrderDTO orderDTO);
}
