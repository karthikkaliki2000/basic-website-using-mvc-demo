package com.example.website.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.example.website.repository.StudentUserDAO;

@Component
@Scope("prototype")
public class Student implements User{
	
	@Autowired
	StudentUserDAO studentUserDAO;
	
	String name;
	String gender;
	String location;
	int age;
	long phoneNo;
	int Id;
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

	@Override
	public boolean createUser(String name, String gender, String location, int age, long phoneNo) {
		// TODO Auto-generated method stub
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.location=location;
		this.phoneNo=phoneNo;
		return true;
	}

	@Override
	public Integer saveUser() {
		// TODO Auto-generated method stub
		System.out.println(this.name);
		
		return studentUserDAO.save(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

}
