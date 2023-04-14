package com.crudtest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudtest.model.Student;
import com.crudtest.serviceimpl.StudentServiceImpl;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
// This file is under git testing 
	private StudentServiceImpl studentServiceImpl;

	@PostMapping("/")
	public Student addStudent(@RequestBody Student student) {

		return studentServiceImpl.addStudent(student);

	}

	@GetMapping("/")
	public List<Student> getStudent() {
		return studentServiceImpl.getStudents();
	}

	@GetMapping("/{id}")
	public Optional<Student> getUser(@PathVariable("id") Long id) {
		return studentServiceImpl.getStudent(id);
	}

	@DeleteMapping("/{id}")
	public void deleteStudent(@PathVariable("id") Long id) {
		studentServiceImpl.deleteStudent(id);
	}

	@PutMapping("/")
	public Student updateStudent(@RequestBody Student student) {
		return studentServiceImpl.updateStudent(student);
	}
}
