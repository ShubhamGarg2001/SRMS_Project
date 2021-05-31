package com.example.databse.remote.demoremote.object;

public class Result {
 Sem1 sem1;
 Sem2 sem2;
 Sem3 sem3;
@Override
public String toString() {
	return "Result [sem1=" + sem1 + ", sem2=" + sem2 + ", sem3=" + sem3 + "]";
}
public Sem1 getSem1() {
	return sem1;
}
public void setSem1(Sem1 sem1) {
	this.sem1 = sem1;
}
public Sem2 getSem2() {
	return sem2;
}
public void setSem2(Sem2 sem2) {
	this.sem2 = sem2;
}
public Sem3 getSem3() {
	return sem3;
}
public void setSem3(Sem3 sem3) {
	this.sem3 = sem3;
}
public Result(Sem1 sem1, Sem2 sem2, Sem3 sem3) {
	super();
	this.sem1 = sem1;
	this.sem2 = sem2;
	this.sem3 = sem3;
}
public Result()
{
	
}

}
