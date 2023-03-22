package com.crudtest.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.crudtest.model.Student;
import com.crudtest.repo.StudentRepo;
import com.crudtest.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public Student addStudent(@RequestBody Student student) {
		return studentRepo.save(student);
	}

	public List<Student> getStudents() {
		return studentRepo.findAll();
	}

	@Override
	public Optional<Student> getStudent(Long id) {
		return studentRepo.findById(id);
	}

	@Override
	public void deleteStudent(Long id) {
		studentRepo.deleteById(id);
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepo.save(student);
	}

}
