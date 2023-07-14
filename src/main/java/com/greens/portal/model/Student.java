package com.greens.portal.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long studentId;
	
	@Column(nullable = false)
	private String studentName;
	
	@Column(nullable = false, unique = true)
	private String studentEmailId;
	
	@Column(nullable = false)
	private String studentPassword;
	
	@Column(nullable = false, unique = true)
	private String studentPhone;
	
	@Column(nullable = false)
	private String studentDateOfBirth;
	
	@Column(nullable = false)
	private String studentAddress;
}
