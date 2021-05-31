package com.example.databse.remote.demoremote.controller;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.databse.remote.demoremote.object.Teacher;
import com.example.databse.remote.demoremote.service.TeacherService;

@Controller
public class AdminLogin {
	@Autowired
	TeacherService teacherService;
	@GetMapping("/adminLogin")
	public String adminLogin()
	{
		return "loginIt";
	}
	@PostMapping("/checkAdmin")
	public String checkAdmin(@RequestParam String name, @RequestParam String password,Model model)
	{
		if(name.equals("Shubham")&&password.equals("2818194"))
		{
			return "displayNow";
		}
		else {
			model.addAttribute("message", "Invalid Username or password!!");
			return "loginIt";
		}
	}
	@PostMapping("/addTeacher")
	public String addTeacher()
	{
		return "addIt";
	}
	@PostMapping("/finalAdd")
	public String finalAdd(@ModelAttribute Teacher teacher,@RequestParam String id, Model model) throws InterruptedException, ExecutionException
	{
		if(teacherService.getIdList().contains(id))
		{
			model.addAttribute("message","Teacher with id "+id +" already exists!!");
		}
		else
		{
		teacherService.saveTeacherDetails(teacher);
		model.addAttribute("message","Teacher Added!!");
		}
		return "addIt";		
	}
	@PostMapping("/removeTeacher")
	public String removeTeacher()
	{
		return "removeIt";
	}
	@PostMapping("/finalRemove")
	public String finalRemove(@RequestParam String id,Model model) throws InterruptedException, ExecutionException
	{
		if(teacherService.getIdList().contains(id))
		{
			teacherService.deleteTeacher(id);
			model.addAttribute("message","Teacher with id "+id +" is removed!!");
		}
		else
		{
			model.addAttribute("message","No teacher with id "+id +" is present!!");
		}
		return "removeIt";
		
	}
}
