package com.example.databse.remote.demoremote.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Service;

import com.example.databse.remote.demoremote.object.Teacher;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.firebase.cloud.FirestoreClient;
@Service
public class TeacherService {

	public String saveTeacherDetails(Teacher teacher) throws InterruptedException, ExecutionException {  
		Firestore dbFirestore = FirestoreClient.getFirestore();  
		dbFirestore.collection("teacher").document(teacher.getId()).set(teacher);  
		return "Succesfully Added!!";  
		}
	public Teacher getTeacherDetails(String id) throws InterruptedException, ExecutionException {  
		Firestore dbFirestore = FirestoreClient.getFirestore();  
		return dbFirestore.collection("teacher").document(id).get().get().toObject(Teacher.class);  
		}  
	public String deleteTeacher(String id) {  
		Firestore dbFirestore = FirestoreClient.getFirestore();  
		dbFirestore.collection("teacher").document(id).delete();  
		return "Student with id "+id+" has been removed";  
		}
	public List<String> getIdList() throws InterruptedException, ExecutionException
	{
		List<String>idList=new ArrayList<String>();
		Firestore dbFirestore = FirestoreClient.getFirestore();
		List<QueryDocumentSnapshot> teachers=dbFirestore.collection("teacher").get().get().getDocuments(); 
		for(QueryDocumentSnapshot teacher:teachers)
		{
			idList.add(teacher.toObject(Teacher.class).getId());
			
		}
		return idList;
	}
}

