package com.ironhack.proxyorderservice.repository.interfaces;

import com.ironhack.proxyorderservice.controller.dto.OrderDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderDTO, Integer> {

    OrderDTO findByNumberOrder(Integer numberOrder);
}
