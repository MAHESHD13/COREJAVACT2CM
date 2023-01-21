package com.example.spring34demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring34demo.repository.StudentRepository;
import com.example.spring34demo.student.Student;
import com.fasterxml.jackson.core.format.InputAccessor.Std;
@Service
public class StudentService 
{
	@Autowired
	private StudentRepository studentRepository;
	public Student registerStudent(Student student)
	{
		return studentRepository.save(student);
	}
	public List<Student>getStudents()
	{
		return (List<Student>) studentRepository.findAll();
	}
	public void deleteStudent(Integer id)
	{
		studentRepository.deleteById(id);
	}
	public Student updateStudent(Student student)
	{
		Integer rollNumber=student.getRollNumber();
		Student std=studentRepository.findById(rollNumber).get();
		std.setName(student.getName());
		std.setAddress(student.getAddress());
		std.setPercentage(student.getPercentage());
		return studentRepository.save(std);
	}

}
