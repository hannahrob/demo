package com.example.demo.student.controller;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student getStudents () {

        Student student = new Student("Mariam", "mariam.jamal@gmail.com", LocalDate.of(2000, Month.JANUARY, 5), 25);

        student = studentRepository.save(student);
        return student;
    }

    public Optional<Student> getStudentById (Long studentId) {

        Optional<Student> student = studentRepository.findById(studentId);
        return student;
    }
}
