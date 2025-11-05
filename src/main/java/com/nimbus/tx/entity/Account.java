package com.nimbus.tx.entity;

import javax.persistence.*;

@Entity
@Table(name = "account")
public class Account {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column private double balance;
    // Getters and setters
}
