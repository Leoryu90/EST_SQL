package com.example.springmybatis.controller;

import com.example.springmybatis.domain.Students;
import com.example.springmybatis.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students/count")
    public int countStudents() {
        return studentService.countStudent();
    }

    @GetMapping("/students")
    public List<Students> getAllStudents(@RequestParam(required = false) Long id) {
        return studentService.getStudents(id);
    }
}
