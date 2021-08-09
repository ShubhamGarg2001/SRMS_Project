package com.example.databse.remote.demoremote.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.example.databse.remote.demoremote.object.Attendence;
import com.example.databse.remote.demoremote.object.Result;
import com.example.databse.remote.demoremote.object.Sem1;
import com.example.databse.remote.demoremote.object.Sem2;
import com.example.databse.remote.demoremote.object.Sem3;
import com.example.databse.remote.demoremote.object.Student;
import com.example.databse.remote.demoremote.service.FileService;
import com.example.databse.remote.demoremote.service.StudentService;
import com.example.databse.remote.demoremote.service.TeacherService;

@Controller
public class TeacherController {
	@Autowired
	FileService fileService;
	@Autowired
	StudentService studentService;
	@Autowired
	TeacherService teacherService;
@GetMapping("/teacherLogin")
public String teacherLogin()
{
	return "login";
}
@PostMapping("/checkGender")
public String checkGender(@RequestParam String username, @RequestParam String password, @RequestParam String gender, Model model) throws InterruptedException, ExecutionException
{
	if(teacherService.getIdList().contains(username))
	{
		String passwordCheck=teacherService.getTeacherDetails(username).getName()+"@"+username;
		if(password.equals(passwordCheck))
		{
			String sex;
			if(gender.equals("male"))
				sex="Mr.";
			else
				sex="Ms.";
			model.addAttribute("name",teacherService.getTeacherDetails(username).getName());
			model.addAttribute("sex",sex+" ");
			return "displayOptions";
			
		}
		else 
		{
			model.addAttribute("error", "Invalid Username or password!!");
		}
	}
	
	else 
	{
		model.addAttribute("error", "No Record Found!!");
	}
	return "login";

}
@PostMapping("/createStudent")  
public String createstudent(@RequestParam String rollNo, @RequestParam String name,@RequestParam String age, @RequestParam String city, @RequestParam String gender, @RequestParam MultipartFile file,@RequestParam String ca ,@RequestParam String aca,@RequestParam String edg,@RequestParam String c,@RequestParam String daa,@RequestParam String maths, @RequestParam String dsa, @RequestParam String os,@RequestParam String cd, @RequestParam String at, @RequestParam String java, @RequestParam String python, Model model) throws InterruptedException, ExecutionException{  
	if(studentService.getRollnoList().contains(rollNo))
	{
		model.addAttribute("message","Student with rollno "+rollNo+" already exists..");
	}
	else
	{
	String path;
	 if(file.isEmpty() && gender.equals("male"))
		 path="http://www.galaxyskills.org/wp-content/uploads/2019/02/dummy-350x350.png";
	 else if(file.isEmpty() && gender.equals("female"))
	 {
		 path="https://www.w3schools.com/howto/img_avatar2.png";
	 }
	 else
	 {
		 path=fileService.upload(file);
	 }
	 Result result=new Result(new Sem1(ca, aca, edg, c), new Sem2(daa, maths, dsa, os), new Sem3(cd, at, java, python));
	 Student s=new Student(rollNo,name,age,city,gender,path,result,new Attendence());
	 String message=studentService.saveStudentDetails(s);
	 model.addAttribute("message",message);
	}
	return "createFront";
} 
@PostMapping("/updateStudent")
public String updateStudent(@RequestParam String rollNo,Model model) throws InterruptedException, ExecutionException
{
	if(studentService.getRollnoList().contains(rollNo))
	{
		model.addAttribute("student",studentService.getStudentDetails(rollNo));
		//model.addAttribute("rollNo",rollNo);
		return "updateFinal";
	}
	else {
		model.addAttribute("message","Student with rollNo "+rollNo+" do not exists.. ");
		return "updateFront";
	}
}
@PostMapping("/deleteStudent")
public String deleteStudent(@RequestParam String rollNo,Model model) throws InterruptedException, ExecutionException
{
	if(studentService.getRollnoList().contains(rollNo))
	{
		model.addAttribute("message",studentService.deleteStudent(rollNo));
	}
	else {
		model.addAttribute("message", "No student with rollno "+rollNo+" exists");
	}
	return "deleteFront";	
}
@PostMapping("/updateLast/{rollNo}")
public String updateLast(@PathVariable String rollNo,@RequestParam String name, @RequestParam String age,@RequestParam String city,@RequestParam MultipartFile file,Model model,@RequestParam String ca ,@RequestParam String aca,@RequestParam String edg,@RequestParam String c,@RequestParam String daa,@RequestParam String maths, @RequestParam String dsa, @RequestParam String os,@RequestParam String cd, @RequestParam String at, @RequestParam String java, @RequestParam String python) throws InterruptedException, ExecutionException 
{
	String path;
	if(file.isEmpty())
		path=studentService.getStudentDetails(rollNo).getPath();

	else 
		path=fileService.upload(file);		

	String gender=studentService.getStudentDetails(rollNo).getGender();
	studentService.getStudentDetails(rollNo).getAttendence();
	Student s=new Student(rollNo, name, age, city, gender, path,new Result(new Sem1(ca, aca, edg, c), new Sem2(daa, maths, dsa, os), new Sem3(cd, at, java, python)),studentService.getStudentDetails(rollNo).getAttendence());
	studentService.saveStudentDetails(s);
	model.addAttribute("message","Student with rollno "+rollNo +" is updated!!");
	model.addAttribute("student",s);

	return "updateFinal";
}
@PostMapping("/viewStudent")
public String viewStudent(@RequestParam String rollNo, Model model) throws InterruptedException, ExecutionException
{
	if(studentService.getRollnoList().contains(rollNo))
	{
	Student s=studentService.getStudentDetails(rollNo);
	model.addAttribute("student",s);
	model.addAttribute("onlyName", "Student Details");
	return "home";
	}
	else {
		model.addAttribute("message","Student with rollno "+rollNo+" donot exists..");
		
		return "viewFront";
	}
}
@PostMapping("/viewStudentResult")
public String viewStudentResult(@RequestParam String rollNo,Model model) throws InterruptedException, ExecutionException
{
	if(studentService.getRollnoList().contains(rollNo))
	{
	Student s=studentService.getStudentDetails(rollNo);
	model.addAttribute("student",s);
	return "viewFinalResult";
	}
	else {
		model.addAttribute("message","Student with rollno "+rollNo+" donot exists..");
		
		return "viewResult";
	}
}
@PostMapping("/create")
public String create()
{
	return "createFront";
}

@PostMapping("/delete")
public String delete()
{
	return "deleteFront";
}
@PostMapping("/update")
public String update()
{
	return "updateFront";
}
@PostMapping("/viewGeneral")
public String view()
{
	return "viewFront";
}
@PostMapping("/viewAcademic")
public String viewResult()
{
	return "viewResult";
}

@PostMapping("/studentAttendenceFinal")
public String updateNameFinal(@RequestParam int[] attendence,Model model) throws InterruptedException, ExecutionException
{
	//updating student attendace by teacher
	List<Student>students=studentService.getAllStudentDetails();
	List<Student>studentsDisplay=new ArrayList<>();
	int i=0;
	for(Student student:students)
	{
		student.setAttendence(new Attendence(attendence[i],attendence[i+1],attendence[i+2], attendence[i+3]));
		studentService.saveStudentDetails(student);
		studentsDisplay.add(student);
		i=i+4;
	}
	model.addAttribute("students", studentsDisplay);
	model.addAttribute("message","Attendance Updated!!");
	return "updateRollnoView";
}
@PostMapping("/updateAttendence")
public String updateNames(Model model) throws InterruptedException, ExecutionException
{
	model.addAttribute("students", studentService.getAllStudentDetails());
	return "updateRollnoView";
}

}
