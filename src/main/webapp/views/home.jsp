<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<meta charset="ISO-8859-1">
<title>Student Information</title>
        <style>
            body{
                font-family: Arial, Helvetica, sans-serif;
               	 background: url("https://st3.depositphotos.com/1393014/12821/v/950/depositphotos_128213204-stock-illustration-simple-light-vector-background.jpg") no-repeat center center fixed; 
				  height: 100%;
				  background-position: center;
				  background-repeat: no-repeat;
				  background-size: cover;
            }
            img{
            border-radius: 50%;
            width: 210px;
            height: 210px;
            }
            .tbl{
            margin-left: auto;
            margin-right: auto;
            padding-bottom: 25px;
            }
            .card{
            max-width: 100%;
            height: 100%;
            margin: auto;
            text-align: center;
            font-family: arial;
            }
            .td4{
                height: 50px;
                font-weight: 600;
            }
        </style>
</head>
<body>
        <div class="card">
            <h1 style="padding-top: 50px;">${greet}${onlyName}</h1>
            <img src="${student.getPath()}" />
            <table class="tbl">
                <tr>
                    <td class="td4">RollNo: ${student.getRollno()}</td>
                </tr>
                <tr>
                    <td class="td4">Name: ${student.getName()}</td>
                </tr>
                <tr>
                    <td class="td4">Age: ${student.getAge()}</td>
                </tr>
                <tr>
                    <td class="td4">City: ${student.getCity()}</td>
                </tr>
            </table>
</body>
</html>