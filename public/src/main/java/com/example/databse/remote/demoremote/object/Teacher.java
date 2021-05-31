package com.example.databse.remote.demoremote.object;

public class Teacher {
String name;
String id;
@Override
public String toString() {
	return "Teacher [name=" + name + ", id=" + id + "]";
}
public Teacher()
{
	
}
public Teacher(String name, String id) {
	super();
	this.name = name;
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
}
