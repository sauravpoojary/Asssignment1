package com.javaspring.api.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaspring.api.entity.Student;
import com.javaspring.api.repository.StudentRepository;

@Service
public class studentService {
	
	@Autowired
	private StudentRepository repo;
	
	public Student newadd(Student stud)
	{
		UUID uuid = UUID.randomUUID();
		System.out.println(uuid.toString());
		stud.setId(uuid.toString());
		System.out.println("Student id is..." +stud.getId());
		
		return repo.save(stud);               
	}                                          
	
	public List<Student> every()
	{
		return repo.findAll();                    	}

}
