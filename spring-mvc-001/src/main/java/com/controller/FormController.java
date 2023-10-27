package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.Student;

@Controller
public class FormController {

	
	@RequestMapping("/processForm")
	public String formHandle(@ModelAttribute("student") Student student) {
		 
		return "success.jsp";
	}
	
	@ExceptionHandler(value = Exception.class)
	public String execptionHandle() {
		return "error.jsp";
	}
}
