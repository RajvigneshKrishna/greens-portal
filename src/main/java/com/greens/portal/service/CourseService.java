package com.greens.portal.service;

import org.springframework.web.multipart.MultipartFile;

import com.greens.portal.model.Course;

public interface CourseService {

	public Course addCourseDetails(MultipartFile syllabus, Course course);

}
