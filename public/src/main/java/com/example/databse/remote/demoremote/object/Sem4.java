package com.example.databse.remote.demoremote.object;

public class Sem4 {
	String dataStructure;
	String computerNetwork;
	String dbms;
	String english;
	public Sem4(){
		
	}
	public String getDataStructure() {
		return dataStructure;
	}
	public void setDataStructure(String dataStructure) {
		this.dataStructure = dataStructure;
	}
	public String getComputerNetwork() {
		return computerNetwork;
	}
	public void setComputerNetwork(String computerNetwork) {
		this.computerNetwork = computerNetwork;
	}
	public String getDbms() {
		return dbms;
	}
	public void setDbms(String dbms) {
		this.dbms = dbms;
	}
	public String getEnglish() {
		return english;
	}
	public void setEnglish(String english) {
		this.english = english;
	}
	@Override
	public String toString() {
		return "Sem1 [dataStructure=" + dataStructure + ", computerNetwork=" + computerNetwork + ", dbms=" + dbms
				+ ", physics=" + english + "]";
	}
	public Sem4(String dataStructure, String computerNetwork, String dbms, String english) {
		super();
		this.dataStructure = dataStructure;
		this.computerNetwork = computerNetwork;
		this.dbms = dbms;
		this.english=english;
	}
}
