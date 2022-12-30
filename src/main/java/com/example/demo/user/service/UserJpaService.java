package com.example.demo.user.service;
import com.example.demo.user.entity.User;
import com.example.demo.user.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserJpaService implements UserService{
    private final UserRepository userRepository;
    @Override
    public User fetchUserById(Integer userId) {
        return userRepository.findById(userId).get();
    }

    @Override
    public User createNewUser(User newUser) {
        return userRepository.save(newUser);
    }

    @Override
    public List<User> fetchAllUsers() {
       return userRepository.findAll();
    }

    @Override
    public void deleteUserById(Integer id) {
        userRepository.deleteById(id);
    }
}
