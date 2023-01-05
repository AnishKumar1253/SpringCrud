package com.masai.app.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
@Table(name = "Course")
public class Course 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int c_id;
	private String courses;
	
	@ManyToOne
	@JoinColumn(name = "Student_id", referencedColumnName = "id")
	Student ob;
	 
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "syllabus_id", referencedColumnName = "id")
	private Syllabus syllabus;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "teacher_id", referencedColumnName = "id")
	private Teacher teacher;
	
	public Course() {}

	public Course(int c_id, String courses, Student ob, Syllabus syllabus, Teacher teacher) {
		super();
		this.c_id = c_id;
		this.courses = courses;
		this.ob = ob;
		this.syllabus = syllabus;
		this.teacher = teacher;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}

	public Student getOb() {
		return ob;
	}

	public void setOb(Student ob) {
		this.ob = ob;
	}

	public Syllabus getSyllabus() {
		return syllabus;
	}

	public void setSyllabus(Syllabus syllabus) {
		this.syllabus = syllabus;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Course [c_id=" + c_id + ", courses=" + courses + ", ob=" + ob + ", syllabus=" + syllabus + ", teacher="
				+ teacher + "]";
	}
	
	

}
