<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Student</title>
    <style>
    html{
    height:100%;
    }
        body
        {
            font-family: Arial, Helvetica, sans-serif;
             height:100%;
		 	 background-position: center;
		 	 background-repeat: no-repeat;
		  	background-size: cover;
            background-image: url("https://wallpaperaccess.com/full/1216255.jpg");
        }
        h1
        {
            text-align: center;
            margin-top: 50px;
            padding-bottom: 15px;
        }
        .btn-group button {
            background-color: grey;
            border: 1px solid black;
            color: white;
            padding: 15px 20px;
            cursor: pointer;
            width: 50%;
            margin: 40px auto;
            display: block;
        }

        .btn-group button:not(:last-child) {
            border-bottom: none;
        }

       
        .btn-group button:hover {
            background-color: black;
        }
    </style>
</head>
<body>
<div class="btn-group">
        <form action="/test/${rollNo}" method="get"><br/>
            <h1>Welcome ${name}!!</h1><br/>
            <button type="submit"><b>See Your General Details</b></button>
        </form>
        <form action="/studentAcademics/${rollNo}" method="get">
            <button type="submit"><b>See Your Academic Details</b></button>
        </form>
        <form action="/showPdf/${rollNo}" method="post">
            <button type="submit"><b>Download Detailed Pdf</b></button>
        </form>
    </div>
</body>
</html>