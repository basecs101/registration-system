package com.example.registrationlogindemo.controller;


import com.example.registrationlogindemo.entity.Student;
import com.example.registrationlogindemo.service.impl.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService service;

    List<String> courses;

    @ModelAttribute
    public void preLoad() {
        courses = new ArrayList<String>();
        courses.add("C");
        courses.add("CPP");
        courses.add("Java");
    }
    @RequestMapping(value = "/student" , method = RequestMethod.GET)
    public String home(Model model, Student student) {
        model.addAttribute("courses", courses);
        return "student";
    }
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String register(@ModelAttribute("student") Student student, Model model) {
        System.out.println("get coursess:::"+student.getCourse());
        service.save(student);
        return "index";
    }
}

