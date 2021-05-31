package com.example.databse.remote.demoremote.service;


import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;

import org.springframework.stereotype.Service;

import com.example.databse.remote.demoremote.object.Student;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

@Service
public class PdfTestService {
	public File createService(Student student)
	{
	String FILE_NAME = "myFile.pdf";
	File file=new File(FILE_NAME);
    Document document = new Document();
    try {
        PdfWriter pdfWriter=PdfWriter.getInstance(document, new FileOutputStream(file));
        document.open();
        
        Image background = Image.getInstance("https://media.istockphoto.com/photos/abstract-blurred-simple-beige-and-tan-color-background-with-white-picture-id1046544350?k=6&m=1046544350&s=612x612&w=0&h=WQ8A-i0qxFJIuPM_4SNoodftAj1K_axuwMlxLEu0ogI=");
        // This scales the image to the page,
        // use the image's width & height if you don't want to scale.
        float width = document.getPageSize().getWidth();
        float height = document.getPageSize().getHeight();
      pdfWriter.getDirectContentUnder()
                .addImage(background, width, 0, 0, height, 0, 0);



        Font f = new Font();
        f.setStyle(Font.BOLD);
        f.setSize(12);
        f.setColor(BaseColor.DARK_GRAY);
        
        Font f4 = new Font(FontFamily.HELVETICA, 18, Font.BOLD, BaseColor.BLUE);
        Font f2 = new Font();
        f2.setSize(12);
        f2.setColor(BaseColor.BLUE);
        Image image = Image.getInstance(new URL(student.getPath()));
        image.setAlignment(Element.ALIGN_CENTER);
        image.scaleAbsolute(100, 100);
        document.add(image);
        document.add(Chunk.NEWLINE);


        Paragraph p4=new Paragraph("Name: "+student.getName(),f);
       p4.setAlignment(Paragraph.ALIGN_CENTER);
        Paragraph p5=new Paragraph("Age: "+student.getAge(),f);
        p5.setAlignment(Paragraph.ALIGN_CENTER);
        Paragraph p6=new Paragraph("City: "+student.getCity(),f);
        p6.setAlignment(Paragraph.ALIGN_CENTER);
         Paragraph p7=new Paragraph("RollNo: "+student.getRollno(),f);
        p7.setAlignment(Paragraph.ALIGN_CENTER);
        document.add(p4);
        document.add(p5);
        document.add(p6);
        document.add(p7);       
        PdfPTable table = new PdfPTable(4); // Create 2 columns in table.
        
        // Create cells
        Paragraph p8=new Paragraph("Your Result: ",f4);
        p8.setAlignment(Paragraph.ALIGN_CENTER);
        Paragraph p9=new Paragraph("Sem 1 Result..",f);
        p9.setAlignment(Paragraph.ALIGN_CENTER);
        PdfPCell cell1 = new PdfPCell(new Paragraph("Computer Architecture",f));
        PdfPCell cell2 = new PdfPCell(new Paragraph("Advanced Computer Architecture",f));
        PdfPCell cell3 = new PdfPCell(new Paragraph("EDG",f));
        PdfPCell cell4 = new PdfPCell(new Paragraph("C Language",f));
        
        PdfPCell cell5 = new PdfPCell(new Paragraph(student.getResult().getSem1().getCa(),f2));
        PdfPCell cell6 = new PdfPCell(new Paragraph(student.getResult().getSem1().getAca(),f2));
        PdfPCell cell7 = new PdfPCell(new Paragraph(student.getResult().getSem1().getEdg(),f2));
        PdfPCell cell8 = new PdfPCell(new Paragraph(student.getResult().getSem1().getC(),f2));
        
        Paragraph p10=new Paragraph("Sem 2 Result..",f);
        p10.setAlignment(Paragraph.ALIGN_CENTER);
        PdfPCell cell9 = new PdfPCell(new Paragraph("DAA",f));
        PdfPCell cell10 = new PdfPCell(new Paragraph("Maths",f));
        PdfPCell cell11= new PdfPCell(new Paragraph("DSA",f));
        PdfPCell cell12 = new PdfPCell(new Paragraph("OS",f));
        
        PdfPCell cell13 = new PdfPCell(new Paragraph(student.getResult().getSem2().getDaa(),f2));
        PdfPCell cell14= new PdfPCell(new Paragraph(student.getResult().getSem2().getMaths(),f2));
        PdfPCell cell15= new PdfPCell(new Paragraph(student.getResult().getSem2().getDsa(),f2));
        PdfPCell cell16 = new PdfPCell(new Paragraph(student.getResult().getSem2().getOperatingSystem(),f2));
        Paragraph p11=new Paragraph("Sem 3 Result..",f);
        p11.setAlignment(Paragraph.ALIGN_CENTER);
        PdfPCell cell17 = new PdfPCell(new Paragraph("Comiler Design",f));
        PdfPCell cell18 = new PdfPCell(new Paragraph("Automata Theory",f));
        PdfPCell cell19 = new PdfPCell(new Paragraph("Java ",f));
        PdfPCell cell20 = new PdfPCell(new Paragraph("Python",f));
        
        PdfPCell cell21 = new PdfPCell(new Paragraph(student.getResult().getSem3().getCompilerDesign(),f2));
        PdfPCell cell22 = new PdfPCell(new Paragraph(student.getResult().getSem3().getAutomataTheory(),f2));
        PdfPCell cell23 = new PdfPCell(new Paragraph(student.getResult().getSem3().getJava(),f2));
        PdfPCell cell24 = new PdfPCell(new Paragraph(student.getResult().getSem3().getPython(),f2));
        
        Paragraph p12=new Paragraph("Sem 4 Result..",f);
        p12.setAlignment(Paragraph.ALIGN_CENTER);
        PdfPCell cell25 = new PdfPCell(new Paragraph("Data Structure",f));
        PdfPCell cell26 = new PdfPCell(new Paragraph("Comppuer Network",f));
        PdfPCell cell27 = new PdfPCell(new Paragraph("DBMS",f));
        PdfPCell cell28 = new PdfPCell(new Paragraph("English",f));
        
        PdfPCell cell29 = new PdfPCell(new Paragraph(student.getResult().getSem4().getDataStructure(),f2));
        PdfPCell cell30 = new PdfPCell(new Paragraph(student.getResult().getSem4().getComputerNetwork(),f2));
        PdfPCell cell31 = new PdfPCell(new Paragraph(student.getResult().getSem4().getDbms(),f2));
        PdfPCell cell32 = new PdfPCell(new Paragraph(student.getResult().getSem4().getEnglish(),f2));
        document.add(Chunk.NEWLINE);
        document.add(Chunk.NEWLINE);
        document.add(p8);
        document.add(Chunk.NEWLINE);

        table.addCell(cell1);
        table.addCell(cell2);
        table.addCell(cell3);
        table.addCell(cell4);
        table.addCell(cell5);
        table.addCell(cell6);
        table.addCell(cell7);
        table.addCell(cell8);
        document.add(table);
        document.add(p9);
        document.add(Chunk.NEWLINE);
        PdfPTable table1 = new PdfPTable(4); // Create 2 columns in table.

        table1.addCell(cell9);
        table1.addCell(cell10);
        table1.addCell(cell11);
        table1.addCell(cell12);
        table1.addCell(cell13);
        table1.addCell(cell14);
        table1.addCell(cell15);
        table1.addCell(cell16);
        document.add(table1);
        document.add(p10);
        document.add(Chunk.NEWLINE);

        PdfPTable table2 = new PdfPTable(4); // Create 2 columns in table.


        table2.addCell(cell17);
        table2.addCell(cell18);
        table2.addCell(cell19);
        table2.addCell(cell20);
        table2.addCell(cell21);
        table2.addCell(cell22);
        table2.addCell(cell23);
        table2.addCell(cell24);
        document.add(table2);
        document.add(p11);
        document.add(Chunk.NEWLINE);

        PdfPTable table3 = new PdfPTable(4); // Create 2 columns in table.
        table3.addCell(cell25);
        table3.addCell(cell26);
        table3.addCell(cell27);
        table3.addCell(cell28);
        table3.addCell(cell29);
        table3.addCell(cell30);
        table3.addCell(cell31);
        table3.addCell(cell32);

        // Add table in document
        document.add(table3);
        document.add(p12);
        document.add(Chunk.NEWLINE);
        document.close();             
    } catch (Exception e) {
        e.printStackTrace();
  
    }
    return file;
	}
}
