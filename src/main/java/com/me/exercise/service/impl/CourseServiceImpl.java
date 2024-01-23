package com.me.exercise.service.impl;

import org.springframework.stereotype.Service;

import com.me.exercise.model.Course;
import com.me.exercise.repository.CourseRepository;
import com.me.exercise.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

	private final CourseRepository courseRepository;

	public CourseServiceImpl(CourseRepository courseRepository) {
		super();
		this.courseRepository = courseRepository;
	}

	@Override
	public Iterable<Course> findAll() {
		// TODO Auto-generated method stub
		return courseRepository.findAll();
	}

}
