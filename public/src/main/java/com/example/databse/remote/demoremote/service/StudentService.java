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
public String updateStudentDetails(String rollNo,String name,String age,String city,String gender,String path,String ca,String edg,String aca,String c,String daa,String maths,String dsa,String os,String cd,String at,String java,String python,String ds,String cn,String dbms,String english) throws InterruptedException, ExecutionException {  
Firestore dbFirestore = FirestoreClient.getFirestore();  
dbFirestore.collection("user").document(rollNo).update("name",name);
dbFirestore.collection("user").document(rollNo).update("age",age);
dbFirestore.collection("user").document(rollNo).update("city",city);
dbFirestore.collection("user").document(rollNo).update("gender",gender);
dbFirestore.collection("user").document(rollNo).update("path",path);
dbFirestore.collection("user").document(rollNo).update("result.sem1.ca",ca);
dbFirestore.collection("user").document(rollNo).update("result.sem1.aca",aca);
dbFirestore.collection("user").document(rollNo).update("result.sem1.c",c);
dbFirestore.collection("user").document(rollNo).update("result.sem1.edg",edg);
dbFirestore.collection("user").document(rollNo).update("result.sem2.daa",daa);
dbFirestore.collection("user").document(rollNo).update("result.sem2.dsa",dsa);
dbFirestore.collection("user").document(rollNo).update("result.sem2.maths",maths);
dbFirestore.collection("user").document(rollNo).update("result.sem2.operatingSystem",os);
dbFirestore.collection("user").document(rollNo).update("result.sem3.automataTheory",at);
dbFirestore.collection("user").document(rollNo).update("result.sem3.compilerDesign",cd);
dbFirestore.collection("user").document(rollNo).update("result.sem3.java",java);
dbFirestore.collection("user").document(rollNo).update("result.sem3.python",python);

dbFirestore.collection("user").document(rollNo).update("result.sem4.computerNetwork",cn);

dbFirestore.collection("user").document(rollNo).update("result.sem4.dataStructure",ds);

dbFirestore.collection("user").document(rollNo).update("result.sem4.dbms",dbms);
dbFirestore.collection("user").document(rollNo).update("result.sem4.english",english);


return "Student with rollno "+rollNo+" is updated!!";


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
}