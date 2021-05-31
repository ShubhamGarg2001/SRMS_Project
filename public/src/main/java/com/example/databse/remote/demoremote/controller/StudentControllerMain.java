package com.example.databse.remote.demoremote.controller;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.databse.remote.demoremote.object.Student;
import com.example.databse.remote.demoremote.service.PdfTestService;
import com.example.databse.remote.demoremote.service.StudentService;

@Controller
@ComponentScan()
public class StudentControllerMain {
	@Autowired
	StudentService studentService;
	@Autowired
	PdfTestService pdfTestService;

@GetMapping("/enterRoll")
	public String enterRoll()
	{
		return "enterRoll";
	}
@PostMapping("/showButton")
	public  String displayButton(@RequestParam String rollNo, @RequestParam String password, Model model) throws InterruptedException, ExecutionException, ServletException, IOException
	{
		if(studentService.getRollnoList().contains(rollNo))
		{
			String name=studentService.getStudentDetails(rollNo).getName();
			String passwordCheck=name+"@"+rollNo;
			if(password.equals(passwordCheck))
			{
				//File file=pdfTestService.createService(studentService.getStudentDetails(rollNo));
				model.addAttribute("name",name);
				model.addAttribute("rollNo",rollNo);
				//model.addAttribute("file",file);
				return "displayName";
			}
			else
			{
				model.addAttribute("error","Enter Valid Username and Passsword..");
				return "enterRoll";
				
			}
			
			
		}
		else
		{
			model.addAttribute("error","No Record Found");
			return "enterRoll";
		}
	}
@GetMapping("/test/{rollNo}")
public String hello(@PathVariable String rollNo, Model model) throws InterruptedException, ExecutionException
{
	Student s=studentService.getStudentDetails(rollNo);
	model.addAttribute("onlyName",s.getName());
	model.addAttribute("student",s);
	model.addAttribute("greet", "Welcome ");
	return "home";
}
@GetMapping("/studentAcademics/{rollNo}")
public String showAcademic(@PathVariable String rollNo, Model model) throws InterruptedException, ExecutionException
{
	model.addAttribute("student", studentService.getStudentDetails(rollNo));
	return "viewFinalResult";
}
}
