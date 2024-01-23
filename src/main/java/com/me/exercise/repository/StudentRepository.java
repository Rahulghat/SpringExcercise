package com.me.exercise.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.me.exercise.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

}
