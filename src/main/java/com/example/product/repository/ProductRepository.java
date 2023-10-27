package com.example.product.repository;

import com.example.product.data.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository <ProductEntity, Integer> {

    List<ProductEntity> findByProductPriceGreaterThan(int productPriceMore);

    List<ProductEntity> findByProductPriceLessThan(int productPriceLess);

    List<ProductEntity> findByProductPriceBetween(int productPrice1, int productPrice2);

    List<ProductEntity> findByCategory(String category);

    List<ProductEntity> findByProductNameContaining(String productName);

}
