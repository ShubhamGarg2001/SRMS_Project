package com.example.databse.remote.demoremote.object;

public class Sem2 {
	String daa;
	String maths;
	String dsa;
	String operatingSystem;
	public Sem2(){
		
	}
	public Sem2(String daa, String maths, String dsa, String operatingSystem) {
		super();
		this.daa = daa;
		this.maths = maths;
		this.dsa = dsa;
		this.operatingSystem = operatingSystem;
	}
	@Override
	public String toString() {
		return "Sem2 [daa=" + daa + ", maths=" + maths + ", dsa=" + dsa + ", operatingSystem=" + operatingSystem + "]";
	}
	public String getDaa() {
		return daa;
	}
	public void setDaa(String daa) {
		this.daa = daa;
	}
	public String getMaths() {
		return maths;
	}
	public void setMaths(String maths) {
		this.maths = maths;
	}
	public String getDsa() {
		return dsa;
	}
	public void setDsa(String dsa) {
		this.dsa = dsa;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
}
