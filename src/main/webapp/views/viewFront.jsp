<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Information</title>
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
            h4{
            text-align:center;
            }
        </style>
</head>
<body>
        <h2>View Student General Details</h2>
        <form action="/viewStudent" method="post">
            <div class="imgcontainer">
                <img src="https://e7.pngegg.com/pngimages/23/896/png-clipart-tutor-login-computer-icons-student-student-child-face.png"
                    alt="Avatar" class="avatar"/>
            </div>
            <div class="container">
                <label><b>Enter RollNo :</b></label>
                <input type="text" placeholder="rollno" name="rollNo" required/>

                <button type="submit">View General Details</button>
            </div>
        </form>
        <h4>${message}</h4>
</body>
</html>