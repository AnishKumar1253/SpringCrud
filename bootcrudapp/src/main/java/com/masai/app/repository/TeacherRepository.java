package com.masai.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.app.entity.Teacher;


public interface TeacherRepository extends JpaRepository<Teacher,Integer>
{
	public List<Teacher> findBymail_id(int t_id);
	
}

