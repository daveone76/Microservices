package com.daveone.MSshopping.client;

import com.daveone.MSshopping.model.Customer;
import com.daveone.MSshopping.model.Product;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient(name = "customer-service")
@CircuitBreaker(name = "customer-service")
public interface CustomerClient {

    @GetMapping(value = "api/customers/{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable("id") long id);

    default ResponseEntity<Customer> fallbackMethod(Long id, Double quantity, Exception e) {

        return new ResponseEntity<>(Customer.builder().build(), HttpStatus.OK);
    }

}


