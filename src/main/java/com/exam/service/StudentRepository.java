package com.exam.service;

import org.springframework.data.repository.CrudRepository;

import com.exam.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{
	
	
}
