package com.example.springdatajpaexample.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Classes {
    @Id
    @GeneratedValue
    @Column(name = "CLASS_ID")
    private Long id;

    private String name;


    @Column(name = "STUDENT_ID")
    private String student_id;
}

