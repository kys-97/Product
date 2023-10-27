package com.example.product.service;

import com.example.product.data.dto.ProductDto;
import com.example.product.data.entity.ProductEntity;
import com.example.product.data.mapper.ProductMapper;
import com.example.product.repository.ProductRepository;
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
        ProductEntity productEntity = pm.toEntity(productDto);
        return pr.save(productEntity);
    }

    @Override
    public ProductEntity updateProduct(int productId, ProductDto productDto) {
        ProductEntity updateProduct = pr.findById(productId).orElse(null);
        if (updateProduct != null) {
            ProductEntity upProduct = pm.toEntity(productDto);
            upProduct.setProductId(productId);
            return pr.save(upProduct);
        }
        return null;
    }

    @Override
    public void deleteProduct(int productId) {
pr.deleteById(productId);
    }

    @Override
    public List<ProductEntity> getAllProduct() {
        return pr.findAll();
    }

    @Override
    public List<ProductEntity> getProductByCategory(String category) {
        return null;
    }

    @Override
    public ProductEntity getProductById(int productId) {
        return pr.findById(productId).orElse(null);
    }

    //상품명으로 제품 검색
    @Override
    public List<ProductEntity> findByProductNameContaining(String productName) {
        return pr.findByProductNameContaining(productName);
    }


    //사용자가 입력한 가격 이상의 제품 검색
    @Override
    public List<ProductEntity> getProductByPriceGreaterThan(int productPriceMore) {
        return pr.findByProductPriceGreaterThan(productPriceMore);
    }


    //사용자가 입력한 가격 이하의 제품 검색
    @Override
    public List<ProductEntity> getProductByPriceLessThan(int productPriceLess) {
        return pr.findByProductPriceLessThan(productPriceLess);
    }

    //사용자가 입력한 두 개의 가격 사이의 제품 검색
    @Override
    public List<ProductEntity> getProductByPriceBetween(int productPrice1, int productPrice2) {
        return pr.findByProductPriceBetween(productPrice1, productPrice2);
    }
}
