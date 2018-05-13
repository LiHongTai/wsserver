package com.roger.ws;

import java.util.List;

import com.roger.model.Student;

public interface StudentService {

	void save(Student student);
	
	List<Student> findAll();
}
