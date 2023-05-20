package com.example.registrationlogindemo.service.impl;


import com.example.registrationlogindemo.entity.Student;
import com.example.registrationlogindemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    public void save(Student student) {
        repository.save(student);
    }
}