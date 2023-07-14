package com.greens.portal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greens.portal.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	
	Optional<Student> findByStudentEmailId(String emailId);
	
	Optional<Student> findByStudentPhone(String phone);
	
	Optional<Student> findByStudentName(String name);

}
