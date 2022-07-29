package com.ironhack.proxyproductservice.controller.impl;

import com.ironhack.proxyproductservice.controller.interfaces.ProductController;
import com.ironhack.proxyproductservice.model.Product;
import com.ironhack.proxyproductservice.repository.interfaces.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ProductControllerImpl implements ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping ("/products/{reference}")
    @ResponseStatus(HttpStatus.OK)
    public Product findByReference(@PathVariable int reference){
        Optional<Product> products = productRepository.findByReference(reference);
        return products.get();
    }

}
