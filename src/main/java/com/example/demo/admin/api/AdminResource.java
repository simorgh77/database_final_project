package com.example.demo.admin.api;

import com.example.demo.admin.entity.Admin;
import com.example.demo.admin.service.AdminService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class AdminResource {
    private final AdminService adminService;

    @GetMapping("admin/{id}")
    Admin foundAdmin(@PathVariable("id") Integer id){
        return adminService.foundAdmin(id);
    }

    @GetMapping("admins")
    List<Admin> foundAdmin(){
        return adminService.fetchAllAdmins();
    }
    @DeleteMapping("/admin/{id}")

    void deleteAdminById(@PathVariable ("id") Integer id){
        adminService.deleteAdminById(id);
    }
    @PostMapping("/admin")
    Admin saveNewAdmin(@RequestBody Admin newAdmin){
        return adminService.createNewAdmin(newAdmin);
    }
}
