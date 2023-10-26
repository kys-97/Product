package com.example.furniture.service;

import com.example.furniture.data.dto.ProductDto;
import com.example.furniture.data.entity.ProductEntity;
import com.example.furniture.data.mapper.ProductMapper;
import com.example.furniture.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    private final ProductRepository pr;
    private final ProductMapper pm;

    public ProductServiceImpl(ProductRepository pr, ProductMapper pm) {
        this.pr = pr;
        this.pm = pm;
    }

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
    public List<ProductEntity> getProductByCategory(String category) {
        return null;
    }

    @Override
    public ProductEntity getProductById(int productId) {
        return null;
    }

    @Override
    public List<ProductEntity> getProductByName(String productName) {
        return null;
    }

    @Override
    public List<ProductEntity> getProductByPriceMoreThan(int productPrice) {
        return null;
    }

    @Override
    public List<ProductEntity> getProductByPriceLessThan(int productPrice) {
        return null;
    }

    @Override
    public List<ProductEntity> getProductByPriceBetween(int productPrice1, int productPrice2) {
        return null;
    }
}
