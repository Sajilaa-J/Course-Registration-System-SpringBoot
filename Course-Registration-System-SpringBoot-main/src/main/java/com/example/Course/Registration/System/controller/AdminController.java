package com.example.Course.Registration.System.controller;

import com.example.Course.Registration.System.model.CourseRegistry;
import com.example.Course.Registration.System.model.Users;
import com.example.Course.Registration.System.service.CourseService;
import com.example.Course.Registration.System.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
@Autowired
CourseService courseService;


    @Autowired
    UserService service;


    @GetMapping("courses-enrolled")
    public List<CourseRegistry> enrolledStudents(){
        return courseService.enrolledStudents();
    }

    @PostMapping("/add-user")
    public void addUser(@RequestBody Users user){

        service.addUser(user);
    }
}
