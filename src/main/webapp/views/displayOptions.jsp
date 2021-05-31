<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@500&display=swap" rel="stylesheet"> 
<title>Welcome Teacher</title>
    <style>
        body
        {
            font-family:font-family: 'Poppins', sans-serif;;
            background-image: url(https://eskipaper.com/images/blurred-background-1.jpg);

        }
        h1
        {
            font-family: Arial, Helvetica, sans-serif;
            text-align: center;
            padding: 50px 0;
        }
        .btn-group button 
        {
            background-color: grey;
            border: 1px solid black;
            color: white; 
            padding: 15px 24px; 
            cursor: pointer;
            width: 50%;
            display: block;
            margin-left: auto;
            margin-right: auto;
        }

        .btn-group button:hover 
        {
            background-color: #000000;
        }
    </style>
</head>
<body>
    <h1>Welcome ${sex}${name}</h1>
    <div class="btn-group">
        <form action="/create" method="post">
            <button type="submit"><b>Add Student</b></button>
        </form><br/>
        <form action="/viewGeneral" method="post">
            <button type="submit"><b>View Student General Details</b></button>
        </form><br/>
         <form action="/viewAcademic" method="post">
          <button type="submit"><b>View Student Academic Details</b></button>
        </form><br/>
        <form action="/update" method="post">
            <button type="submit"><b>Update Student</b></button>
        </form><br/>
        <form action="/delete" method="post">
            <button type="submit"><b>Delete Student</b></button>
        </form><br/>
         <form action="/updateAttendence" method="post">
            <button type="submit"><b>View And Update Attendence </b></button>
        </form>
    </div>
</body>
</html>