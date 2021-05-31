package com.example.databse.remote.demoremote.object;

public class Sem3 {
String compilerDesign;
String automataTheory;
String java;
String python;
public Sem3()
{
	
}
public Sem3(String compilerDesign, String automataTheory, String java, String python) {
	super();
	this.compilerDesign = compilerDesign;
	this.automataTheory = automataTheory;
	this.java = java;
	this.python = python;
}
public String getCompilerDesign() {
	return compilerDesign;
}
public void setCompilerDesign(String compilerDesign) {
	this.compilerDesign = compilerDesign;
}
public String getAutomataTheory() {
	return automataTheory;
}
public void setAutomataTheory(String automataTheory) {
	this.automataTheory = automataTheory;
}
public String getJava() {
	return java;
}
public void setJava(String java) {
	this.java = java;
}
public String getPython() {
	return python;
}
public void setPython(String python) {
	this.python = python;
}
@Override
public String toString() {
	return "Sem3 [compilerDesign=" + compilerDesign + ", automataTheory=" + automataTheory + ", java=" + java
			+ ", python=" + python + "]";
}
}
