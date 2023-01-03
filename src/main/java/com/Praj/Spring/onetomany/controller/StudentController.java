package com.Praj.Spring.onetomany.controller;

import com.Praj.Spring.onetomany.entity.Student;
import com.Praj.Spring.onetomany.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/student")
@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping
    public ResponseEntity<?> saveStudent(@RequestBody Student student){
        studentRepository.save(student);
        return ResponseEntity.ok("Student Saved");
    }
}