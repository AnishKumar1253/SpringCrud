package com.masai.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.app.entity.Icard;


public interface IcardRepository extends JpaRepository<Icard,Integer>
{
	public List<Icard> findBymail_id(int iid);
	
}

