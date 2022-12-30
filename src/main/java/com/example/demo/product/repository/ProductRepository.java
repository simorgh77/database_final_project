package com.example.demo.product.repository;

import com.example.demo.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
    @Query("select p from Product p where p.productName like %?1%")
    List<Product> findAllLikePattern(String pattern);

    @Query("select p from Product p")
    List<Product> findAll();

    @Transactional
    @Modifying
    @Query("delete from Product p where p.id = ?1")
    void deleteById(int id);
}
