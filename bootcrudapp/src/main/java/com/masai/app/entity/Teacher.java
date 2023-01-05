package com.masai.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

public class Teacher 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int t_id;
	
	@OneToOne(mappedBy = "address")
    private Course course;
	
	public Teacher() {}

	public Teacher(int t_id, Course course) {
		super();
		this.t_id = t_id;
		this.course = course;
	}

	public int getT_id() {
		return t_id;
	}

	public void setT_id(int t_id) {
		this.t_id = t_id;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Teacher [t_id=" + t_id + ", course=" + course + "]";
	}
	
	

}
