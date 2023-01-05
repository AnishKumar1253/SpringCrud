package com.masai.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.app.entity.Course;
import com.masai.app.entity.Icard;
import com.masai.app.entity.Student;
import com.masai.app.repository.CourseRepository;
import com.masai.app.repository.IcardRepository;
import com.masai.app.repository.StudentRepository;

@Service
public abstract class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository StuRepo;
	
	@Autowired
	private CourseRepository CourseRepo;

	@Autowired
	private IcardRepository CardRepo;
	
	@Override
	public Student create(Student user) {
	
		return this.StuRepo.save(user);
	}

	@Override
	public Student getOne(int id) {
		return this.StuRepo.findById(id).get();
	}

	public List<Student> getAll() {
		return this.StuRepo.findAll();
	}

	@Override
	public void delete(int id) {
		this.StuRepo.deleteById(id);
		
	}

	public Course createCourse(Course c) {
		return this.CourseRepo.save(c);
	
	}

	public Course get(Course c) {
		Course course= this.getOne(id).get();
		return course;
	}

	
	@Override
	public Icard createicard(Icard i) {
		// TODO Auto-generated method stub
		return this.CardRepo.save(i);
	}

	@Override
	public Icard geticard(int iid) {
		Icard card= this.getOne(iid).getId();
		return card;
	}


}
