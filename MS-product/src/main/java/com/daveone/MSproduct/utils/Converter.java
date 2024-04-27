package com.daveone.MSproduct.utils;

import com.daveone.MSproduct.entity.Category;
import com.daveone.MSproduct.entity.Product;
import com.daveone.MSproduct.model.CategoryModel;
import com.daveone.MSproduct.model.ProductModel;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * This Class gives some methods for converting DTOs objects to entities and vice versa
 */
@Component
public class Converter {


    @Autowired
    private ModelMapper modelMapper;
    public Product productModelToEntity(ProductModel productModel){
    Product product = modelMapper.map(productModel, Product.class);
    product.setCategory(categoryModelToEntity(productModel.getCategory()));
    return product;
    }



    public ProductModel productEntityToModel(Product product){

        ProductModel productModel = modelMapper.map(product, ProductModel.class);
        productModel.setCategory(categoryEntityToModel(product.getCategory()));
        return productModel;
    }

    public CategoryModel categoryEntityToModel(Category category){
        return modelMapper.map(category, CategoryModel.class);
    }

    public Category categoryModelToEntity(CategoryModel categoryModel){
        return modelMapper.map(categoryModel, Category.class);
    }


}
