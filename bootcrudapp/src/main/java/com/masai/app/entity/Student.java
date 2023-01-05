package com.masai.app.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student")
public class Student 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	private String stu_name;
	
	@OneToMany(cascade = CascadeType.ALL)
    private Set<Course> courses;

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Icard cardid;
	
	public Student() {}

	public Student(int id, String stu_name, Set<Course> courses, Icard cardid) {
		super();
		this.id = id;
		this.stu_name = stu_name;
		this.courses = courses;
		this.cardid = cardid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStu_name() {
		return stu_name;
	}

	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	public Icard getCardid() {
		return cardid;
	}

	public void setCardid(Icard cardid) {
		this.cardid = cardid;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", stu_name=" + stu_name + ", courses=" + courses + ", cardid=" + cardid + "]";
	};
	
	
	
}
