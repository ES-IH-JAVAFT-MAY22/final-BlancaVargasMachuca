package com.ironhack.edgeservice.client;

import com.ironhack.edgeservice.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("proxy-user-service")
public interface UserProxyClient {

    @GetMapping("/users/{account}")
    User getUserByAccount(@PathVariable int account);


    @PostMapping("/users")
    User newUser(@RequestBody User user);
}
