<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Teacher Login</title>
</head>
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
            h2{
            text-align:center;
            color:black;
            }
            h4{
            text-align:center;
            color:blue;
            }
        </style>
<body>
        <h2>Teacher Login</h2>
        <form action="/checkGender" method="post" >
            <div class="imgcontainer">
                <img style="height: 150px; width: 150px;" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTDK98jIdnfchJ5DwTcTFvO0XfxT__R8fCVC49DSE9uGnZB5niqYqH__lUhQzhwXqA_r18&usqp=CAU"
                    alt="Avatar" class="avatar"/>
            </div>
            <div class="container">
                <label><b>Enter Username :</b></label>
                <input type="text" placeholder="username" name="username" required/>

                <label><b>Enter Password :</b></label>
                <input type="password" placeholder="password" name="password" required/>

                <label><b>Gender :</b></label>

                <input type="radio" name="gender" value="male" required/>Male
                <input type="radio" name="gender" value="female" required/>Female<br><br>

                <button type="submit">Login</button>
            </div>
        </form>
        <h4>${error}</h4>
</body>
</html>