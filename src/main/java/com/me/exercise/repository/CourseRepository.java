package com.me.exercise.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.me.exercise.model.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {

}
