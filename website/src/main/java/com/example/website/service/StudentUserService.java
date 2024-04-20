package com.example.website.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.website.domain.User;

@Service
public class StudentUserService implements UserService {

	@Autowired
	User studentUser;
	@Override
	public User getUser() {
		// TODO Auto-generated method stub
		return studentUser;
	}

	@Override
	public boolean signUp(String name, String gender, String location, int age, long phoneNo) {
		// TODO Auto-generated method stub
		boolean isStudentCreated=studentUser.createUser(name, gender, location, age, phoneNo);
		studentUser.saveUser();
		return isStudentCreated;
	}

}
