package com.example.databse.remote.demoremote.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import com.google.auth.Credentials;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.storage.BlobId;
import com.google.cloud.storage.BlobInfo;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
@Service
public class FileService {
	public static String DOWNLOAD_URL="https://firebasestorage.googleapis.com/v0/b/first-e876e.appspot.com/o/%s?alt=media";
	public static String TEMP_URL ;
	private String uploadFile(File file, String fileName) throws IOException {
        BlobId blobId = BlobId.of("first-e876e.appspot.com", fileName);
        BlobInfo blobInfo = BlobInfo.newBuilder(blobId).setContentType("media").build();
        Credentials credentials = GoogleCredentials.fromStream(new FileInputStream("./service.json"));
        Storage storage = StorageOptions.newBuilder().setCredentials(credentials).build().getService();
        storage.create(blobInfo, Files.readAllBytes(file.toPath()));
        return String.format(DOWNLOAD_URL, URLEncoder.encode(fileName));
    }

    private File convertToFile(MultipartFile multipartFile, String fileName) throws IOException {
        File tempFile = new File(fileName);
        try (FileOutputStream fos = new FileOutputStream(tempFile)) {
            fos.write(multipartFile.getBytes());
            fos.close();
        }
        return tempFile;
    }

    private String getExtension(String fileName) {
        return fileName.substring(fileName.lastIndexOf("."));
    }
    public String upload(MultipartFile multipartFile) {

        try {
            String fileName = multipartFile.getOriginalFilename();                        
            fileName = UUID.randomUUID().toString().concat(this.getExtension(fileName));  

            File file = this.convertToFile(multipartFile, fileName);                    
            TEMP_URL = this.uploadFile(file, fileName);                                   
            file.delete();                                                              
            return TEMP_URL;       
        } catch (Exception e) {
            e.printStackTrace();
            return"Unsuccessfully Uploaded!";
        }

    }
}
