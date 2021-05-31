package com.example.databse.remote.demoremote.object;

public class Attendence {
int acaA;
int ulpA;
int cnA;
int cdA;

public Attendence()
{
	
}
@Override
public String toString() {
	return "Attendence [acaA=" + acaA + ", ulpA=" + ulpA + ", cnA=" + cnA + ", cdA=" + cdA + "]";
}
public Attendence(int acaA, int ulpA, int cnA, int cdA) {
	super();
	this.acaA = acaA;
	this.ulpA = ulpA;
	this.cnA = cnA;
	this.cdA = cdA;
}
public int getAcaA() {
	return acaA;
}
public void setAcaA(int acaA) {
	this.acaA = acaA;
}
public int getUlpA() {
	return ulpA;
}
public void setUlpA(int ulpA) {
	this.ulpA = ulpA;
}
public int getCnA() {
	return cnA;
}
public void setCnA(int cnA) {
	this.cnA = cnA;
}
public int getCdA() {
	return cdA;
}
public void setCdA(int cdA) {
	this.cdA = cdA;
}

}
