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

    //name
    @GetMapping("/{productName}")
    @Operation(summary = "product name 조회", description = "product name 조회")
    public  List<ProductEntity> getProductByPriceMore(@PathVariable String productName) {
        return ps.getProductByName(productName);
    }

    //기준가 이상
    @GetMapping("/{productPriceMore}")
    @Operation(summary = "data price(more than) 조회", description = "data price(more than) 조회")
    public  List<ProductEntity> getProductByPriceMore(@PathVariable int productPriceMore) {
        return ps.getProductByPriceGreaterThan(productPriceMore);
    }

    //기준가 이하
    @GetMapping("/{productPriceLess}")
    @Operation(summary = "data price(less than) 조회", description = "data price(less than) 조회")
    public  List<ProductEntity> getProductByPriceLess(@PathVariable int productPriceLess) {
        return ps.getProductByPriceLessThan(productPriceLess);
    }

    //기준가 1,2 사이
    @GetMapping("/{productPrice1},{productPrice2}")
    @Operation(summary = "data price(between) 조회", description = "data price(between) 조회")
    public  List<ProductEntity> getProductByPriceBetween(@PathVariable int productPrice1, @PathVariable int productPrice2) {
        return ps.getProductByPriceBetween(productPrice1,productPrice2);
    }

    //카테고리
    @GetMapping("/{category}")
    @Operation(summary = "data price(category) 조회", description = "data price(category) 조회")
    public  List<ProductEntity> getProductByPriceBetween(@PathVariable String category) {
        return ps.getProductByCategory(category);
    }

}
