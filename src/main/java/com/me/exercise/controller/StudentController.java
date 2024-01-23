package com.me.exercise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.me.exercise.service.StudentService;

@Controller
public class StudentController {

	private final StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	@RequestMapping("students")
	private String getStudents(Model model) {
		model.addAttribute("courses", studentService.findAll());
		return "students";
	}

}
