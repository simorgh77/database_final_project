package com.example.demo.product.service;
import com.example.demo.product.entity.Product;
import com.example.demo.product.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class ProductJpaService implements ProductService{
    private final ProductRepository productRepository;
    @Override
    public List<Product> fetchAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public void deleteProductById(int id) {
        productRepository.deleteById(id);
    }

    @Override
    public Product createProduct(Product newProduct) {
        return productRepository.save(newProduct);
    }

    @Override
    public List<Product> fetchAllProductMathPattern(String pattern) {
        var findablePattern=pattern.toLowerCase();
        return productRepository.findAllLikePattern(findablePattern);
    }
}
