package com.clone.microsvc.users.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "user_name", unique = true)
    private String user_name;

    @Column(name = "password")
    private String password;

    @Column(name = "photo", nullable = false)
    private String photo;
}
