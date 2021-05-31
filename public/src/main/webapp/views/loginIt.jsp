<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
   <style>
        body{
            font-family: Arial, Helvetica, sans-serif;
        }
        h2{
            text-align: center;
        }
        form {
            border: 3px solid #f1f1f1;
        }
        input[type=text],
        input[type=password] {
            width: 100%;
            padding: 12px 20px;
            margin: 8px 0;
            display: inline-block;
            border: 1px solid #ccc;
            box-sizing: border-box;
        }
        button {
            background-color: #000000;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            cursor: pointer;
            width: 100%;
        }
        button:hover {
            opacity: 0.8;
        }
        .cancelbtn {
            width: auto;
            padding: 10px 18px;
            background-color: #f44336;
        }
        .imgcontainer {
            text-align: center;
            margin: 24px 0 12px 0;
        }
        img.avatar {
            width: 25%;
            border-radius: 50%;
        }
        .container {
            padding: 16px;
        }
        span.psw {
            float: right;
            padding-top: 16px;
        }
    </style>
</head>
<body>
    <h2>Admin Login</h2>
    <form action="/checkAdmin" method="post">
        <div class="imgcontainer">
            <img style="height: 150px; width: 150px;" src="http://nyvtc.org/sites/default/files/styles/profile_picture_192x192/public/pictures/dummy-user.png?itok=5bPsZuml"
                alt="Avatar" class="avatar"/>
        </div>
        <div class="container">
            <label><b>Enter Username:</b></label>
            <input type="text" placeholder="Username" name="name" required/>

            <label><b>Enter Password:</b></label>
            <input type="password" placeholder="Password" name="password" required/>

            <button type="submit">Login</button>
        </div>
    </form>
    <h2>${message}</h2>
</body>
</html>