package com.example.demo.admin.repository;

import com.example.demo.admin.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface AdminRepository extends JpaRepository<Admin,Integer> {

    @Query("select a from Admin a where a.id = ?1")
    Admin findById(int id);

    @Query("select a from Admin a")
    List<Admin> findAll();

    @Transactional
    @Modifying
    @Query("delete from Admin a where a.id = ?1")
    void deleteById(int id);




}
