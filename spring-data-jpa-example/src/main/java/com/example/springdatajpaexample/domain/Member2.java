package com.example.springdatajpaexample.domain;

import jakarta.persistence.*;

@Entity
public class Member2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MEMBER2_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "CLASS_ID")
    private Classes classes;

    private Integer age;

    private String name;

    private String address;
}
