package com.example.databse.remote.demoremote.object;

public class Sem1 {
@Override
	public String toString() {
		return "Sem1 [ca=" + ca + ", aca=" + aca + ", edg=" + edg + ", c=" + c + "]";
	}
String ca;
String aca;
String edg;
String c;
public Sem1(){
	
}
public Sem1(String ca, String aca, String edg, String c) {
	super();
	this.ca = ca;
	this.aca = aca;
	this.edg = edg;
	this.c = c;
}
public String getCa() {
	return ca;
}
public void setCa(String daa) {
	this.ca = daa;
}
public String getAca() {
	return aca;
}
public void setAca(String aca) {
	this.aca = aca;
}
public String getEdg() {
	return edg;
}
public void setEdg(String edg) {
	this.edg = edg;
}
public String getC() {
	return c;
}
public void setC(String c) {
	this.c = c;
}
}
