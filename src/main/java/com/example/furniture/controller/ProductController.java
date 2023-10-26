package com.example.furniture.controller;

import com.example.furniture.data.dto.ProductDto;
import com.example.furniture.data.entity.ProductEntity;
import com.example.furniture.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private final ProductService ps;

    //create
    @PostMapping
    @Operation(summary = "data 생성", description = "data 생성")
    public ProductEntity createProduct(@Valid @RequestBody ProductDto productDto) {
        ProductEntity createProduct = ps.createProduct(productDto);
        return ps.createProduct(productDto);
    }

    //update
    @PutMapping("/{productId}")
    @Operation(summary = "data 수정", description = "data 수정")
    public ProductEntity updateProduct(@PathVariable int productId, @Valid @RequestBody ProductDto productDto){
        return ps.updateProduct(productId, productDto);
    }
    //delte
    @DeleteMapping("/{productId}")
    @Operation(summary = "data 삭제", description = "data 삭제")
    public void deleteProduct(@PathVariable int productId) {
        ps.deleteProduct(productId);
    }
    //read
    //list
    @GetMapping
    @Operation(summary = "data 전체 조회", description = "data 전체 조회")
    public List<ProductEntity> getAllProduct() {
        return ps.getAllProduct();
    }

    //id
    @GetMapping("/{productId}")
    @Operation(summary = "data id 조회", description = "data id 조회")
    public ProductEntity getProductById(@PathVariable int productId) {
        return ps.getProductById(productId);
    }

}
