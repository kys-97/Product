package com.example.furniture.service;

import com.example.furniture.data.dto.ProductDto;
import com.example.furniture.data.entity.ProductEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    @Override
    public ProductEntity createProduct(ProductDto productDto) {
        return null;
    }

    @Override
    public ProductEntity updateProduct(int productId, ProductDto productDto) {
        return null;
    }

    @Override
    public void deleteProduct(int productId) {

    }

    @Override
    public List<ProductEntity> getAllProduct() {
        return null;
    }

    @Override
    public ProductEntity getProductByCategory(String category) {
        return null;
    }

    @Override
    public ProductEntity getProductById(int productId) {
        return null;
    }

    @Override
    public ProductEntity getProductByName(String productName) {
        return null;
    }

    @Override
    public ProductEntity getProductByPriceHigh(int productPrice) {
        return null;
    }

    @Override
    public ProductEntity getProductByPriceLow(int productPrice) {
        return null;
    }

    @Override
    public ProductEntity getProductByPriceBetween(int productPrice1, int productPrice2) {
        return null;
    }
}
