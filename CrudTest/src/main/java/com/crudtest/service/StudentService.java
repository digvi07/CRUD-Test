package com.crudtest.service;

import java.util.List;
import java.util.Optional;

import com.crudtest.model.Student;

public interface StudentService {

	public Student addStudent(Student student);

	public List<Student> getStudents();

	public Optional<Student> getStudent(Long id);

	public void deleteStudent(Long id);

	public Student updateStudent(Student student);
}
