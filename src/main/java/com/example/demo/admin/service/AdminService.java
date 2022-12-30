package com.example.demo.admin.service;

import com.example.demo.admin.entity.Admin;

import java.util.List;

public interface AdminService {
    Admin foundAdmin(Integer id);

   List<Admin> fetchAllAdmins();

    void deleteAdminById(Integer id);

    Admin createNewAdmin(Admin newAdmin);
}
