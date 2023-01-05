package com.masai.app.service;

import java.util.List;

import com.masai.app.entity.Course;
import com.masai.app.entity.Syllabus;
import com.masai.app.entity.Teacher;

public abstract class CourseService 
{
	public abstract Course create(Course course);
	public abstract Course getOne(int c_id);
	public abstract List<Course> getAll();
	public abstract void delete(int c_id);
	
	public abstract Syllabus createsyl(Syllabus syllabus);
	public abstract Syllabus getsyl(int s_id);
	
	public abstract Teacher createteach(Teacher teacher);
	public abstract Teacher getteach(int t_id);

}
