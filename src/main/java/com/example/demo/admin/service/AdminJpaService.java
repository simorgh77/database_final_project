package com.example.demo.admin.service;

import com.example.demo.admin.entity.Admin;
import com.example.demo.admin.repository.AdminRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class AdminJpaService implements AdminService{
    private final AdminRepository adminRepository;
    @Override
    public Admin foundAdmin(Integer id) {
        var foundedAdmin=adminRepository.findById(id).get();
        return foundedAdmin;
    }

    @Override
    public List<Admin> fetchAllAdmins() {
        return adminRepository.findAll();
    }

    @Override
    public void deleteAdminById(Integer id) {
        adminRepository.deleteById(id);
    }

    @Override
    public Admin createNewAdmin(Admin newAdmin) {
        return adminRepository.save(newAdmin);
    }

}
