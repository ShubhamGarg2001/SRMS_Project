<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
  <style>
        body{
            font-family: Arial, Helvetica, sans-serif;
        }
        h1{
            text-align: center;
            color: white;
            background-color: #4CAF50;
        }
        h3{
            text-align: center;
        }
        .students {
            border-collapse: collapse;
            width: 100%;
        }
        .students td {
            border-bottom: 5px solid #4CAF50;
            padding: 8px;
            text-align: center;
        }
        .students tr:nth-child(even){background-color: #f2f2f2;}

        .students tr:hover {background-color: #ddd;}

        .students th {
            padding-top: 12px;
            padding-bottom: 12px;
            text-align: center;
            background-color: #4CAF50;
            color: white;
            border-bottom: 5px solid #4CAF50;
            padding: 12px;
            width: 25%;
        }
    </style>
</head>
<body>
<h1>View Student Result</h1>
<br/>
<h3>1st Sessional</h3>   
        <table class="students">
        
            <tr>
            	<th>Advanced Computer Architecture</th>
                <th>Unix-Linux Programming</th>
                <th>Computer Network</th>
                <th>Compiler Design</th>
            </tr>
                <tr>
                    <td><c:out value="${student.getResult().getSem1().getCa()}" /></td>
                    <td><c:out value="${student.getResult().getSem1().getAca()}" /></td>
                    <td><c:out value="${student.getResult().getSem1().getEdg()}" /></td>
                    <td><c:out value="${student.getResult().getSem1().getC()}" /></td>             
                </tr>
                </table><br/>
                
                        <h3>2nd Sessional</h3>  
                        <table class="students">
        <tr>
            	<th>Advanced Computer Architecture</th>
                <th>Unix-Linux Programming</th>
                <th>Computer Network</th>
                <th>Compiler Design</th>
            </tr>
                <tr>
                    <td><c:out value="${student.getResult().getSem2().getDaa()}" /></td>
                    <td><c:out value="${student.getResult().getSem2().getMaths()}" /></td>
                    <td><c:out value="${student.getResult().getSem2().getDsa()}" /></td>
                    <td><c:out value="${student.getResult().getSem2().getOperatingSystem()}" /></td>             
                </tr>
                </table><br/>
                
                        <h3>3rd Sessional</h3>  
                        <table class="students">
              <tr>
            	<th>Advanced Computer Architecture</th>
                <th>Unix-Linux Programming</th>
                <th>Computer Network</th>
                <th>Compiler Design</th>
            </tr>
                <tr>
                    <td><c:out value="${student.getResult().getSem3().getCompilerDesign()}" /></td>
                    <td><c:out value="${student.getResult().getSem3().getAutomataTheory()}" /></td>
                    <td><c:out value="${student.getResult().getSem3().getJava()}" /></td>
                    <td><c:out value="${student.getResult().getSem3().getPython()}" /></td>             
                </tr>
</body>
</html>