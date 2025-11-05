package com.nimbus.tx.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "transaction")
public class Transaction {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column private int fromAccountId;
    @Column private int toAccountId;
    @Column private double amount;
    @Column private Date date;
    // Getters and setters
}
