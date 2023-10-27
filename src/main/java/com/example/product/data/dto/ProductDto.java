package com.example.product.data.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class ProductDto {

    @NotNull
    private String productName;
    @NotNull
    private int productPrice;
    @NotNull
    private String Category;
}
