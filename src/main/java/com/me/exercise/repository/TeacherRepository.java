package com.me.exercise.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.me.exercise.model.Teacher;

@Repository
public interface TeacherRepository extends CrudRepository<Teacher, Long> {

}
