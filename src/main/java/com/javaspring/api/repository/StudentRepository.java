package com.javaspring.api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaspring.api.entity.Student;

public interface StudentRepository extends JpaRepository<Student, String> {

}
