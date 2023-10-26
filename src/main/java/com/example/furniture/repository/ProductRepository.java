package com.example.furniture.repository;

import com.example.furniture.data.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <ProductEntity, Integer> {
}
