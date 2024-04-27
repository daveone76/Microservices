package com.daveone.MSproduct.model;

import com.daveone.MSproduct.entity.Category;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductModel {


    private Long id;

    @NotEmpty(message = "El nombre no debe ser vacío")
    private String name;

    private String description;
    @Positive(message = "El stock debe ser mayor que cero")
    private Double stock;

    private Double price;

    private String status;


    private Date createAt;

    @NotNull(message = "La categoria no puede ser vacia")
    @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
    private CategoryModel category;
}


