<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Admin</title>
    <style>
        body
        {
            font-family: Arial, Helvetica, sans-serif;
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
<body><br/>
 <h1>Welcome Admin</h1>
    <div class="btn-group">
        <form action="/addTeacher" method="post">
            <button type="submit"><b>Add Teacher</b></button>
        </form><br/><br/>
        <form action="/removeTeacher" method="post">
            <button type="submit"><b>Remove Teacher</b></button>
        </form>
    </div>
</body>
</html>