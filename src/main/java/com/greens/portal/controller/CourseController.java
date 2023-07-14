package com.greens.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.greens.portal.model.Course;
import com.greens.portal.service.CourseService;

@Controller
@RequestMapping("/courses")
public class CourseController {
	
	@Autowired
	public CourseService courseService;

	@GetMapping("/")
	public String loadAddCoursePg() {
		return "addCourse";
	}
	
	@PostMapping("/addCourse")
	public Course addCourseDetails(@RequestParam("courseSyllabus") MultipartFile syllabus ,Course course) {
		return courseService.addCourseDetails(syllabus, course);
	}
	
}
