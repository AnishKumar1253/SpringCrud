package com.masai.app.service;

import java.util.List;

import com.masai.app.entity.Course;
import com.masai.app.entity.Icard;
import com.masai.app.entity.Student;


public interface StudentService {
	public Student create(Student user);
	public Student getOne(int id);
	public List<Student> getAll();
	public void delete(int id);
	
	public Course createcourse(Course c);
	public Course get(int c_id);
	
	public Icard createicard(Icard i);
	public Icard geticard(int iid);
	

}
