package com.clone.microsvc.comments.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "commments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "commment", nullable = false)
    private String comment;

    @Column(name = "post")              //Mientras hago la relación la dejo así para no tener problemas
    private Long post_id;
}
