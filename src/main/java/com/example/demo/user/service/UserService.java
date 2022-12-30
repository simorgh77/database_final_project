package com.example.demo.user.service;

import com.example.demo.user.entity.User;

import java.util.List;

public interface UserService {
    User fetchUserById(Integer userId);

    User createNewUser(User newUser);

    List<User> fetchAllUsers();

    void deleteUserById(Integer id);
}
