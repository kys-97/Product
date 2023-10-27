package com.example.product.data.mapper;

import com.example.product.data.Category;
import com.example.product.data.dto.ProductDto;
import com.example.product.data.entity.ProductEntity;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper implements EntityMapper<ProductDto, ProductEntity> {


    @Override
    public ProductEntity toEntity(ProductDto productDto) {
        ProductEntity pe = new ProductEntity();
        pe.setProductName(productDto.getProductName());
        pe.setProductPrice(productDto.getProductPrice());
        pe.setCategory(Category.valueOf(productDto.getCategory()));
        return pe;
    }
}
