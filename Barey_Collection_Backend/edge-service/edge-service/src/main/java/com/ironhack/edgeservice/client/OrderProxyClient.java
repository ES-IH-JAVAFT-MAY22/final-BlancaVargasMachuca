package com.ironhack.edgeservice.client;

import com.ironhack.edgeservice.model.Product;
import com.ironhack.edgeservice.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient("proxy-oder-service")
public interface OrderProxyClient {


}
