package com.example.demo.student.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1/student")
public class StudentController {

    private final StudentService studentService;

    private StudentController(StudentService studentService) {
        this.studentService = studentService;

    }

    @GetMapping
    public Student Student() {
        return studentService.getStudents();
    }

    @GetMapping(path="/hannah/{id}")
    public Optional<Student> studentHannah(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }
}
