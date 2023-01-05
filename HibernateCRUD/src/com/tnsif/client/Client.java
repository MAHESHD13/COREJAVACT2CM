package com.tnsif.client;

import com.tnsif.entity.Student;
import com.tnsif.service.StudentService;
import com.tnsif.service.StudentServiceImpl;

public class Client 
{

	public static void main(String[] args)
	{
		StudentService service=new StudentServiceImpl();
		Student student=new Student();
		student.setSid(101);
		student.setSname("KUMAR");
		student.setCgpa(8.6f);
		service.addStudent(student);
		System.out.println("DATA INSERTED");
		
		

	}

}
