package com.greens.portal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greens.portal.model.Student;
import com.greens.portal.repository.StudentRepository;
import com.greens.portal.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	public StudentRepository studentRepository;
	
	@Override
	public Student studentRegistration(Student student) {
		return studentRepository.save(student);
	}
}
