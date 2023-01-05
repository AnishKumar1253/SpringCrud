package com.masai.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.masai.app.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>
{
	public List<Student> findBymail_id(int id);
	
}
