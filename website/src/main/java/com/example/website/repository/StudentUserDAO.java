package com.example.website.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.example.website.domain.Student;

@Repository
@Scope("singleton")
public class StudentUserDAO implements DAO<Student>{
	private List<Student> studentUserList=new ArrayList<Student>();
	@Override
	public Optional<Student> get(Integer id) {
		// TODO Auto-generated method stub
		if(!studentUserList.isEmpty()) {
			return Optional.of(studentUserList.get(id));
		}
		return Optional.empty();
	}

	@Override
	public int save(Student student) {
		// TODO Auto-generated method stub
		int userId=studentUserList.size();
		student.setId(userId);
		studentUserList.add(student);
		System.out.println("Student Saved with student id is "+userId);
		return userId;
	}

}
