package com.example.databse.remote.demoremote.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Service;

import com.example.databse.remote.demoremote.object.Student;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.firebase.cloud.FirestoreClient;

@Service  
public class StudentService {   
public String saveStudentDetails(Student student) throws InterruptedException, ExecutionException {  
Firestore dbFirestore = FirestoreClient.getFirestore();  
dbFirestore.collection("user").document(student.getRollno()).set(student);  
return "Succesfully Inserted!!";  
}  
public Student getStudentDetails(String rollNo) throws InterruptedException, ExecutionException {  
Firestore dbFirestore = FirestoreClient.getFirestore();  
return dbFirestore.collection("user").document(rollNo).get().get().toObject(Student.class);  
}  
public String deleteStudent(String rollNo) {  
Firestore dbFirestore = FirestoreClient.getFirestore();  
dbFirestore.collection("user").document(rollNo).delete();  
return "Student with rollno "+rollNo+" has been deleted";  
}

public List<Student> getAllStudentDetails() throws InterruptedException, ExecutionException {  
	List<Student>studentsList=new ArrayList<Student>();
Firestore dbFirestore = FirestoreClient.getFirestore();  
List<QueryDocumentSnapshot> students=dbFirestore.collection("user").get().get().getDocuments(); 
for(QueryDocumentSnapshot student:students)
{
	studentsList.add(student.toObject(Student.class));
	
}
return studentsList;
}
public List<String> getRollnoList() throws InterruptedException, ExecutionException
{
	List<String>rollnoList=new ArrayList<String>();
	Firestore dbFirestore = FirestoreClient.getFirestore();
	List<QueryDocumentSnapshot> students=dbFirestore.collection("user").get().get().getDocuments(); 
	for(QueryDocumentSnapshot student:students)
	{
		rollnoList.add(student.toObject(Student.class).getRollno());
		
	}
	return rollnoList;
}
public String updateStudentAttendence(int[] attendence) throws InterruptedException, ExecutionException
{
	List<String>rollList=new StudentService().getRollnoList();
	Firestore dbFirestore = FirestoreClient.getFirestore();
	int i=0;
	for(String rollNo:rollList)
	{
		dbFirestore.collection("user").document(rollNo).update("attendence.acaA",attendence[i]);i++;
		dbFirestore.collection("user").document(rollNo).update("attendence.ulpA",attendence[i]);i++;
		dbFirestore.collection("user").document(rollNo).update("attendence.cnA",attendence[i]);i++;
		dbFirestore.collection("user").document(rollNo).update("attendence.cdA",attendence[i]);i++;
	}
	return "Attendence Updated!!";
}
}