package com.clone.microsvc.categories.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name= "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "name", unique = true)
    private String name;

    @Column(name= "enable")
    private Boolean enable= false;

    @Column(name= "icon", nullable = false)
    private String icon;
}
