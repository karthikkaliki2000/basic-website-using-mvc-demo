package com.example.website.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.website.domain.Student;
import com.example.website.domain.User;
import com.example.website.service.UserService;

@Controller
public class SignUpController {

	@Autowired
	UserService userService;
	
	@RequestMapping("/signup")
	public String getSignUpPage(Model uiModel) {
		User user=userService.getUser();
		uiModel.addAttribute("user", user);
		return "signup";
	}
	
	
	@RequestMapping("/registerUser")
	public String userCreated(@ModelAttribute(value = "user") Student studentUser) {
		if(userService.signUp(studentUser.getName(), studentUser.getGender(), studentUser.getLocation(), 20, studentUser.getPhoneNo())) {
			return "welcome";
		}
		return "signup";
	}
	
	
	
}
