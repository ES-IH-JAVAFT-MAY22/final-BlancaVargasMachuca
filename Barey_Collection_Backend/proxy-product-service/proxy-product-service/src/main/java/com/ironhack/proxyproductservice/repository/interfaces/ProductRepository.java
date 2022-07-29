package com.ironhack.proxyproductservice.repository.interfaces;

import com.ironhack.proxyproductservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {


    Optional<Product> findByReference(int reference);
}
