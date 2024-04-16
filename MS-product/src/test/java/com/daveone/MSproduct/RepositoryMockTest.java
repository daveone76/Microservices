package com.daveone.MSproduct;


import com.daveone.MSproduct.entity.Category;
import com.daveone.MSproduct.entity.Product;
import com.daveone.MSproduct.repository.ProductRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Date;
import java.util.List;

@DataJpaTest
public class RepositoryMockTest {


    @Autowired
    private ProductRepository productRepository;



    @Test
    public void whenFindByCategory_thenReturnListProduct(){
        Product product01 =  Product.builder()
                .name("Computer")
                .category(Category.builder().id(1L).build())
                .description("")
                .stock(Double.parseDouble("10"))
                .price(Double.parseDouble("1240.90"))
                .createAt(new Date())
                .build();

        productRepository.save(product01);

        List<Product> founds = productRepository.findByCategory(product01.getCategory());


        Assertions.assertEquals(3L, founds.size());
    }



}
