package com.example.demo.product.api;

import com.example.demo.product.entity.Product;
import com.example.demo.product.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProductResource {
    private final ProductService productService;

    @GetMapping("/products")
    List<Product> fetchAllProducts(){
        return productService.fetchAllProducts();
    }
    @DeleteMapping("/products/{id}")
    void deleteProductById(@PathVariable("id") int id){
        productService.deleteProductById(id);
    }
    @PostMapping("/products")
    Product createNewProduct(@RequestBody Product newProduct){
        return productService.createProduct(newProduct);
    }
    @GetMapping("/products/pattern")
    List<Product> fetchAllProductMathPattern(@RequestParam String pattern){
        System.out.println(pattern);
     return productService.fetchAllProductMathPattern(pattern);
    }
}
