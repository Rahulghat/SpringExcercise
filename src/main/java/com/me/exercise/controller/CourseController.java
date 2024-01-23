package com.me.exercise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.me.exercise.service.CourseService;

@Controller
public class CourseController {

	private final CourseService courseService;

	public CourseController(CourseService courseService) {
		super();
		this.courseService = courseService;
	}

	@RequestMapping("courses")
	private String getCourse(Model model) {
		model.addAttribute("courses", courseService.findAll());
		return "courses";
	}

}
