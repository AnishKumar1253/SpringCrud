package com.masai.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.app.entity.Course;


public interface CourseRepository extends JpaRepository<Course,Integer>
{
	public List<Course> findBymail_id(int c_id);
	
}
