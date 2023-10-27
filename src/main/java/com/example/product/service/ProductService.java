package com.example.product.service;

import com.example.product.data.dto.ProductDto;
import com.example.product.data.entity.ProductEntity;

import java.util.List;

public interface ProductService {

    //새로운 상품 추가
    ProductEntity createProduct(ProductDto productDto);
    //상품 정보 수정
    ProductEntity updateProduct(int productId, ProductDto productDto);
    //상품 정보 삭제
    void deleteProduct(int productId);
    //상품리스트 조회
    List<ProductEntity> getAllProduct();
    //카테고리별 상품 검색
    List<ProductEntity> getProductByCategory(String category);
    //특정 상품 검색
    //id
    ProductEntity getProductById(int productId);
    //상품명
    List<ProductEntity> findByProductNameContaining(String productName);
    //상품가격
    //기준가 이상
    List<ProductEntity> getProductByPriceGreaterThan(int productPriceMore);
    //기준가 이하
    List<ProductEntity> getProductByPriceLessThan(int productPriceLess);
    //기준가1~기준가2
    List<ProductEntity> getProductByPriceBetween(int productPrice1, int productPrice2);
}
