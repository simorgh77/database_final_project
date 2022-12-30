package com.example.demo.user.api;

import com.example.demo.user.entity.User;
import com.example.demo.user.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserResource {
    private final UserService userService;

    @GetMapping("/user/{id}")
    User fetchUserById(@PathVariable("id") Integer userId){
        return userService.fetchUserById(userId);
    }
    @PostMapping("/user")
    User createUser(@RequestBody User newUser ){
        return userService.createNewUser(newUser);
    }
    @GetMapping("/users")
    List<User> fetchAllUsers(){
        return userService.fetchAllUsers();
    }
    @DeleteMapping("user/{id}")
    void deleteUserById(@PathVariable("id") Integer id){
        userService.deleteUserById(id);
    }
}
