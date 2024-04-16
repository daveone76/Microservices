package com.daveone.MSproduct.repository;

import com.daveone.MSproduct.entity.Category;
import com.daveone.MSproduct.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository  extends JpaRepository<Product, Long> {

    public List<Product> findByCategory(Category category);
}
