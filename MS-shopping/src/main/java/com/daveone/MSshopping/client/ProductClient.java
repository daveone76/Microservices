package com.daveone.MSshopping.client;

import com.daveone.MSshopping.model.Product;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@FeignClient(
        name = "product-service" )
public interface ProductClient {

    @GetMapping(value = "api/products/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable("id") Long id);

    @PutMapping(value = "api/products/{id}/stock")
    public ResponseEntity<Product> updateStockProduct(@PathVariable  Long id ,@RequestParam(name = "quantity", required = true) Double quantity);
}
