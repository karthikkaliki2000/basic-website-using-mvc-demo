package com.example.website.domain;

public interface User {
	public boolean createUser(String name,String gender,String location,int age,long phoneNo);
	public Integer saveUser();
}
