package com.me.exercise.bootStrapData;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.me.exercise.model.Course;
import com.me.exercise.model.Student;
import com.me.exercise.model.Teacher;
import com.me.exercise.repository.CourseRepository;
import com.me.exercise.repository.StudentRepository;
import com.me.exercise.repository.TeacherRepository;

@Component
public class BootStrapSetUp implements CommandLineRunner {

	private final CourseRepository courseRepository;
	private final StudentRepository studentRepository;
	private final TeacherRepository teacherRepository;

	public BootStrapSetUp(CourseRepository courseRepository, StudentRepository studentRepository,
			TeacherRepository teacherRepository) {
		super();
		this.courseRepository = courseRepository;
		this.studentRepository = studentRepository;
		this.teacherRepository = teacherRepository;
	}

	@Override
	public void run(String... args) throws Exception {

		Course javadeveloper = new Course();
		javadeveloper.setCourseName("Java Developer course ");
		Course javadeveCourseSaved = courseRepository.save(javadeveloper);

		Course pythonDeveloper = new Course();
		pythonDeveloper.setCourseName("Pthon Developer course ");
		Course pythonDeveloperSaved = courseRepository.save(pythonDeveloper);

		Student oneStudent = new Student();
		oneStudent.setFirstName("firstName1");
		oneStudent.setLastName("Lastname1");
		Student oneStudentSaved = studentRepository.save(oneStudent);

		Student twoStudent = new Student();
		twoStudent.setFirstName("firstName1");
		twoStudent.setLastName("Lastname1");
		Student twoStudentSaved = studentRepository.save(twoStudent);

		Teacher oneTeacher = new Teacher();
		oneTeacher.setTeacherName("Ram Prakash");
		Teacher oneTeacherSaved = teacherRepository.save(oneTeacher);

		oneTeacherSaved.getCourses().add(pythonDeveloperSaved);
		javadeveCourseSaved.setTeacher(oneTeacherSaved);
		pythonDeveloperSaved.setTeacher(oneTeacherSaved);
		teacherRepository.save(oneTeacherSaved);

		javadeveCourseSaved.getStudents().add(twoStudentSaved);
		twoStudentSaved.getCourses().add(javadeveCourseSaved);

		pythonDeveloperSaved.getStudents().add(oneStudentSaved);
		oneStudentSaved.getCourses().add(pythonDeveloperSaved);

		studentRepository.save(oneStudentSaved);
		courseRepository.save(javadeveCourseSaved);

		studentRepository.save(twoStudentSaved);
		courseRepository.save(pythonDeveloperSaved);

		teacherRepository.save(oneTeacherSaved);

		System.out.println("course :" + courseRepository.count());
		System.out.println("Students :" + studentRepository.count());
		System.out.println("Teacher : " + teacherRepository.count());

	}

}
