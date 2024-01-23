package com.me.exercise.service.impl;

import org.springframework.stereotype.Service;

import com.me.exercise.model.Teacher;
import com.me.exercise.repository.TeacherRepository;
import com.me.exercise.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService {

	private final TeacherRepository teacherRepository;

	public TeacherServiceImpl(TeacherRepository teacherRepository) {
		super();
		this.teacherRepository = teacherRepository;
	}

	@Override
	public Iterable<Teacher> findAll() {
		// TODO Auto-generated method stub
		return teacherRepository.findAll();
	}

}
