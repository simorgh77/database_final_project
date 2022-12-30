package com.example.demo.admin.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Service;

@Entity
@Table(name = "admins")
@AllArgsConstructor
@Service
@Getter
@NoArgsConstructor
@ToString
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "admin_id")
    private Integer id;
    @Column(name = "access_level")
    private String accessLevel;
    @Column(name = "full_name")
    private String fullName;
}
