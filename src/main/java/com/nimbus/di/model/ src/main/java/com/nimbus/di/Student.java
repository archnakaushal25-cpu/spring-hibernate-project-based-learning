package com.nimbus.crud.entity;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column private String name;
    @Column private String course;
    // Getters and setters
}
