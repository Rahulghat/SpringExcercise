package com.me.exercise.service.impl;

import org.springframework.stereotype.Service;

import com.me.exercise.model.Student;
import com.me.exercise.repository.StudentRepository;
import com.me.exercise.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private final StudentRepository studentRepository;

	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public Iterable<Student> findAll() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

}
