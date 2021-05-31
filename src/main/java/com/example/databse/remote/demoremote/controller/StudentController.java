/*package com.example.databse.remote.demoremote.controller;

import java.util.List;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.example.databse.remote.demoremote.object.Student;
import com.example.databse.remote.demoremote.service.FileService;
import com.example.databse.remote.demoremote.service.StudentService;
@Controller
public class StudentController {
	 @Autowired  
	 StudentService student;  
	 @Autowired
	 FileService fileService;
	 
	 @PostMapping("/getStudents")  
	 public String getStudent(Model model) throws InterruptedException, ExecutionException{  
	 List<Student> s=student.getAllStudentDetails();  
	 model.addAttribute("students", s);
	 return "displayAll.jsp";
	 }  
	 @ResponseBody
	 @PostMapping("/createStudent")  
	 public String createstudent(@RequestParam String rollNo, @RequestParam String name,@RequestParam String age, @RequestParam String city, @RequestParam MultipartFile file) throws InterruptedException, ExecutionException {  
		  String path=fileService.upload(file);
		 Student s=new Student(rollNo,name,age,city,path);
		 return student.saveStudentDetails(s);
		 
	 }  
	 @PostMapping("/updateStudent")  
	 public String updateStudent(@ModelAttribute Student s ) throws InterruptedException, ExecutionException {  
	 return student.updateStudentDetails(s);  
	 }  
	
	 @PostMapping("/deleteStudent")  
	 @ResponseBody
	 public String deleteStudent(@RequestParam String name){  
	 return student.deleteStudent(name);  
	 } 
	 

	 @ResponseBody
	 @PostMapping("/file")
	 public String uploadFile(@RequestParam MultipartFile file)
	 {
		 return fileService.upload(file);
	 }
	 @ResponseBody
	 @PostMapping("/app")
	 public String see()
	 {
		 System.out.println("Successful");
		 return "Successfull";
	 }
	 @PostMapping("/getStudent")  
	 public String getStudent(@RequestParam String name,Model model) throws InterruptedException, ExecutionException{  
	 Student s=student.getStudentDetails(name);
	 model.addAttribute("student", s);
	 return "display.jsp";
	 }  
	
}*/
