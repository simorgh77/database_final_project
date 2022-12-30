package com.example.demo.product.service;

import com.example.demo.product.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> fetchAllProducts();

    void deleteProductById(int id);

    Product createProduct(Product newProduct);

    List<Product> fetchAllProductMathPattern(String pattern);
}
