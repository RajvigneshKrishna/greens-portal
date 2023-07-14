package com.greens.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.greens.portal.model.Student;
import com.greens.portal.service.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@GetMapping("/")
	public String loadStdntRgstrtnPg() {
		return "studentRegistration";
	}

	@PostMapping("/register")
	public Student studentRegistration(Student student) {
		return studentService.studentRegistration(student);
	}
}
