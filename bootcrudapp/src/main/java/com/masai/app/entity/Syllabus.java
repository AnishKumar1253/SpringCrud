package com.masai.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Syllabus 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int s_id;
	private int lecture_no;
	private int duration;
	
	@OneToOne(mappedBy = "address")
    private Course course;

	public Syllabus() {}

	public Syllabus(int s_id, int lecture_no, int duration, Course course) {
		super();
		this.s_id = s_id;
		this.lecture_no = lecture_no;
		this.duration = duration;
		this.course = course;
	}

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public int getLecture_no() {
		return lecture_no;
	}

	public void setLecture_no(int lecture_no) {
		this.lecture_no = lecture_no;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Syllabus [s_id=" + s_id + ", lecture_no=" + lecture_no + ", duration=" + duration + ", course=" + course
				+ "]";
	}
	
	
}
