package com.example.sql_20240702.repository;

import com.example.sql_20240702.domain.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentJdbcTemplateRepository implements StudentRepository {
    JdbcTemplate jdbcTemplate;

    public StudentJdbcTemplateRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Student> findAll() {
        return jdbcTemplate.query("select * from students", (rs, rowNum) ->
                new Student(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("address")));
    }

    @Override
    public int insertStudent(Student student) {
        return jdbcTemplate.update("INSERT INTO students (name, age, address) VALUES (?, ?, ?)",
                student.getName(), student.getAge(), student.getAddress());
    }
}
