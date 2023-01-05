package com.masai.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.app.entity.Syllabus;


public interface SyllabusRepository extends JpaRepository<Syllabus,Integer>
{
	public List<Syllabus> findBymail_id(int s_id);
	
}

