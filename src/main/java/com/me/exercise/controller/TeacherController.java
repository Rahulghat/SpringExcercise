package com.me.exercise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.me.exercise.service.TeacherService;

@Controller
public class TeacherController {

	private final TeacherService teacherService;

	public TeacherController(TeacherService teacherService) {
		super();
		this.teacherService = teacherService;
	}

	@RequestMapping("/teachers")
	public String getTeaher(Model model) {
		model.addAttribute("teachers", teacherService.findAll());
		return "teachers";
	}

}
