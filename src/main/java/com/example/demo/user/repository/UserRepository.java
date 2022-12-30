package com.example.demo.user.repository;

import com.example.demo.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    @Transactional
    @Modifying
    @Query("delete from User u where u.userId = ?1")
    void deleteUserByUserId(Integer id);


    @Query("select u from User u")
    List<User> findAll();


    @Query("select u from User u where u.userId = ?1")
    Optional<User> findByUserId(Integer id);

    @Query("delete from User u where u.userId = ?1")
    @Transactional
    @Modifying
    void deleteByUserId(Integer integer);
}
