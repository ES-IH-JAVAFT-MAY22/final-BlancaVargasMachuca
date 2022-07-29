package com.ironhack.edgeservice.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("proxy-product-service")
public interface ProductProxyClient {
}
