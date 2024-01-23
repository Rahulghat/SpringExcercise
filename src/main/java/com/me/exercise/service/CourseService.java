package com.me.exercise.service;

import org.springframework.stereotype.Service;

import com.me.exercise.model.Course;


public interface CourseService {

	public Iterable<Course> findAll();

}
