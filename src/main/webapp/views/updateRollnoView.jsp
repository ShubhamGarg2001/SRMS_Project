<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "java.sql.*,java.util.*" %>
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
        #students {
            border-collapse: collapse;
            width: 100%;
        }
        h1{
            text-align: center;
            color: #4CAF50;
        }
        h3{
            text-align: center;
        }
        #students td {
            border-bottom: 5px solid #4CAF50;
            padding: 8px;
            text-align: center;
        }
        #students tr:nth-child(even){background-color: #f2f2f2;}

        #students tr:hover {background-color: #ddd;}

        #students th {
            padding-top: 12px;
            padding-bottom: 12px;
            text-align: center;
            background-color: #4CAF50;
            color: white;
            border-bottom: 5px solid #4CAF50;
            padding: 12px;
        }
        button {
            background-color: #4CAF50;
            color: white;
            padding: 16px;
            margin: 8px 0;
            border: none;
            cursor: pointer;
            width: 100%;
        }
        .sty{
            text-align: center;
        }
        .size{
        font-size:21px;
        }
    </style>
</head>
<body>
<form action="/studentAttendenceFinal" method="get">
<h1>View And Update Attendence</h1>
<h3>${message}</h3>
<table id="students">
		 <tr>
            <th class="size">RollNo</th>
            <th class="size">Name</th>
            <th class="size" colspan="4">Attendence</th>
        </tr>
                <tr>
            <th></th>
            <th></th>
            <th>ACA </th>
            <th>ULP </th>
            <th>CN </th>
            <th>CD </th>
        </tr>
            <c:forEach items="${students}" var="student" varStatus="loop" >
                <tr>
                    <td>${student.getRollno()}</td>
                    <td>${student.getName()}</td>
                    <td><input class="sty" type="number" value="${student.getAttendence().getAcaA()}" name="attendence"/></td>
                    <td><input class="sty" type="number" value="${student.getAttendence().getUlpA()}" name="attendence"/></td>
                    <td><input class="sty" type="number" value="${student.getAttendence().getCnA()}" name="attendence"/></td>
                    <td><input class="sty" type="number" value="${student.getAttendence().getCdA()}" name="attendence"/></td>
                </tr>
            </c:forEach>
</table><br/><br/>
<button type="submit">Update</button>
</form>
</body>
</html>