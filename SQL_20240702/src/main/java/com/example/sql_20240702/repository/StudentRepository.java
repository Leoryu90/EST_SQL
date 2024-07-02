package com.example.sql_20240702.repository;

import com.example.sql_20240702.domain.Student;

import java.util.List;


public interface StudentRepository {
    List<Student> findAll();

    int insertStudent(Student student);
}
