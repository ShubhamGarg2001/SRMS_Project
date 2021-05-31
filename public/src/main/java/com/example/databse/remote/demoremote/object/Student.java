package com.example.databse.remote.demoremote.object;

public class Student {
	 private String rollno;
	 private String name;  
	 private String age;  
	 private String city;
	 private String gender;
	 private String path;
	 private Result result;
	 public Student(){
		 
	 }
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public Result getResult() {
		return result;
	}
	public void setResult(Result result) {
		this.result = result;
	}
	public Student(String rollno, String name, String age, String city, String gender, String path, Result result) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.city = city;
		this.gender = gender;
		this.path = path;
		this.result = result;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + ", city=" + city + ", gender=" + gender
				+ ", path=" + path + ", result=" + result + "]";
	}
	
}
