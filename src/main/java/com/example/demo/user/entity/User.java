package com.example.demo.user.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
   private Integer userId;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "mobile")
    private String mobile;
    @Column(name = "email")
    private String email;
}
