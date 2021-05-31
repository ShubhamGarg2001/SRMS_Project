<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Teacher</title>
    <style>
        body{
            font-family: Arial, Helvetica, sans-serif;
        }
        h2 , h4{
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
        .imgcontainer {
            text-align: center;
            margin: 24px 0 12px 0;
        }
        img.avatar {
            width: 20%;
            border-radius: 50%;
        }
        .container {
            padding: 16px;
        }
    </style>
</head>
<body>
  <h2>Add Teacher</h2>
    <form action="/finalAdd" method="post">
        <div class="imgcontainer">
            <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTDK98jIdnfchJ5DwTcTFvO0XfxT__R8fCVC49DSE9uGnZB5niqYqH__lUhQzhwXqA_r18&usqp=CAU"
                alt="Avatar" class="avatar">
        </div>
        <div class="container">
            <label><b>Enter Name:</b></label>
            <input type="text" placeholder="Name" name="name" required>

            <label><b>Enter Id:</b></label>
            <input type="text" placeholder="Id" name="id" required>

            <button type="submit"><b>Add</b></button>
        </div>
    </form>
    <h4>${message}</h4>
</body>
</html>