package com.example.spring34demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.spring34demo.student.Student;

public interface StudentRepository extends CrudRepository<Student,Integer>{

}
