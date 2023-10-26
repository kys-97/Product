package com.example.furniture.data.dto;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
