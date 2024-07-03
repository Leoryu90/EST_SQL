package com.example.springmybatis.repository;

import com.example.springmybatis.domain.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository {
    private final StudentMapper studentMapper;

    public StudentRepository(StudentMapper studentMapper) {   // 생성자 주입
        this.studentMapper = studentMapper;
    }

    // @Autowired private StudentMapper studentMapper;  // 필드주입

    public int countStudents() {
        return studentMapper.countStudents();
    }

    public List<Students> findStudents(Long id) {
        return studentMapper.findStudents(id);
    }
}
