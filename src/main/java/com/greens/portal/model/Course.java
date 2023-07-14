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
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long courseId;
	
	@Column(nullable = false)
	private String courseName;
	
	@Column(nullable = false)
	private Long courseFees;
	
	@Column(nullable = false)
	private String courseDuration;
	
	@Column(nullable = false)
	private String syllabusFileName;
	
	@Column(nullable = false)
	private String syllabusContent;
	
	@Column(nullable = false)
	private String syllabusFileType;
	
}
