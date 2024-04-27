package com.daveone.MSproduct.service;


import com.daveone.MSproduct.entity.Category;
import com.daveone.MSproduct.entity.Product;
import com.daveone.MSproduct.model.ProductModel;

import java.util.List;

public interface ProductService {
    public List<Product> listAllProduct();
    public Product getProduct(Long id);
    public ProductModel getProductMapper(Long id);
    public Product createProduct(Product product);
    public Product updateProduct(Product product);
    public  Product deleteProduct(Long id);
    public List<Product> findByCategory(Category category);
    public Product updateStock(Long id, Double quantity);
}
