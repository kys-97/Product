package com.example.furniture.repository;

import com.example.furniture.data.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository <ProductEntity, Integer> {

    List<ProductEntity> findByProductPriceGreaterThan(int productPriceMore);

    List<ProductEntity> findByProductPriceLessThan(int productPriceLess);

    List<ProductEntity> findByProductPriceBetween(int productPrice1, int productPrice2);

    List<ProductEntity> findByCategory(String category);

    List<ProductEntity> findByProductName(String productName);

}
