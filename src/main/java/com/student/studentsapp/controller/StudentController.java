package com.student.studentsapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.studentsapp.entity.Student;
import com.student.studentsapp.repository.StudentRepository;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;
	
	@PostMapping("/addStudent")
	public String saveStudent(@RequestBody Student student) {
		studentRepository.save(student);
		return "Student added successfully::"+student.getId();
		
	}
	
	@GetMapping("/students")
	public List<Student> getStudents() {
		return studentRepository.findAll();
	}
	
	@GetMapping("/hello")
	public String getHelloWorld() {
		return "Hello World";
	}	

}
