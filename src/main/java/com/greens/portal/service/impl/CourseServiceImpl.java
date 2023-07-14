package com.greens.portal.service.impl;

import java.nio.charset.StandardCharsets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.greens.portal.model.Course;
import com.greens.portal.repository.CourseRepository;
import com.greens.portal.service.CourseService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CourseServiceImpl implements CourseService {

	@Autowired
	public CourseRepository courseRepository;
	
	@Override
	public Course addCourseDetails(MultipartFile syllabus, Course course) {
		course =  getCourseModelData(syllabus, course);
		log.debug(course.toString());
		courseRepository.save(course);
		return course;
	}
	
	private static Course getCourseModelData(MultipartFile syllabus, Course course) {
		try {
			String fileContentType = syllabus.getContentType();
			String sourceFileContent = new String(syllabus.getBytes(), StandardCharsets.UTF_8);
			String fileName = syllabus.getOriginalFilename();
			course.setSyllabusFileName(fileName);
			course.setSyllabusContent(sourceFileContent);
			course.setSyllabusFileType(fileContentType);
		} catch (Exception e) {
			log.debug("Exception in getting details for adding syllabus file");
		}
		return course;
	}

}
