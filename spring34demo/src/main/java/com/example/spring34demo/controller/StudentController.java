package com.example.spring34demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring34demo.service.StudentService;
import com.example.spring34demo.student.Student;

@RestController
@CrossOrigin(allowedHeaders="*",origins="*")
public class StudentController 
{
	@Autowired
	private StudentService std1;
	@PostMapping("/registerStudent")
	public Student registerStudent(@RequestBody Student student)
	{
		return std1.registerStudent(student);
	}
	@GetMapping("/getStudents")
	public List<Student> getStudents()
	{
		return std1.getStudents();
	}
	@DeleteMapping("/deleteStudent/{id}")
	public void deleteStudent(@PathVariable Integer id)
	{
		std1.deleteStudent(id);
	}
    @PutMapping("/updateStudents")
    public Student updateStudent(@RequestBody Student student)
    {
    	return std1.updateStudent(student);
    }
}
