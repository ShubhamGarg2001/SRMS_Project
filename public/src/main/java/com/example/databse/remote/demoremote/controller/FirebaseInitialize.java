package com.example.databse.remote.demoremote.controller;

import java.io.FileInputStream;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

@Controller 
public class FirebaseInitialize {  
@PostConstruct  
public void initialize() {  
try {  
FileInputStream serviceAccount =  
new FileInputStream("./service.json");  
FirebaseOptions options = new FirebaseOptions.Builder()  
.setCredentials(GoogleCredentials.fromStream(serviceAccount))  
.build();  
FirebaseApp.initializeApp(options);  
} 
catch (Exception e) 
{  
e.printStackTrace();  
}
}}  
