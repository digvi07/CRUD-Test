package com.crudtest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crudtest.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

}
