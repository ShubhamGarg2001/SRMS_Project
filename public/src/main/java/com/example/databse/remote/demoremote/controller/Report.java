package com.example.databse.remote.demoremote.controller;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.ExecutionException;

import javax.activation.MimetypesFileTypeMap;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.databse.remote.demoremote.service.PdfTestService;
import com.example.databse.remote.demoremote.service.StudentService;

@Controller
public class Report extends HttpServlet {
	@Autowired
PdfTestService pdfTestService;
	@Autowired
	StudentService studentService;
    private static final long serialVersionUID = 1L;
    @PostMapping("/showPdf/{rollNo}")
    protected void doPost(HttpServletRequest request, HttpServletResponse response,@PathVariable String rollNo) throws IOException, InterruptedException, ExecutionException {
        String filePath ="myFile.pdf";
        String fileName = rollNo+".pdf";
		File file=pdfTestService.createService(studentService.getStudentDetails(rollNo));
        MimetypesFileTypeMap mimeTypesMap = new MimetypesFileTypeMap();
        String mimeType = mimeTypesMap.getContentType(fileName);

        response.setContentType(mimeType);
        response.setHeader("Content-disposition", "attachment; filename=" + fileName);

        OutputStream out = response.getOutputStream();
        FileInputStream in = new FileInputStream(filePath);
        byte[] buffer = new byte[4096];
        int length;
        while ((length = in.read(buffer)) > 0) {
            out.write(buffer, 0, length);
        }
        in.close();
        file.delete();
        out.flush();

    }
}