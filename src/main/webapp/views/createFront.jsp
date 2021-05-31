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
            input[type=number],
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
            color:blue;
            }
        </style>
</head>
<body>
 <h2>Add Student</h2>
 <h4>${message}</h4>
        <form action="/createStudent" method="post" enctype="multipart/form-data">
            <div class="imgcontainer">
                <img src="https://e7.pngegg.com/pngimages/23/896/png-clipart-tutor-login-computer-icons-student-student-child-face.png"
                    alt="Avatar" class="avatar"/>
            </div>
            <div class="container">
                <label><b>Enter Roll No :</b></label>
                <input type="text" placeholder="rollNo" name="rollNo" required/>

                <label><b>Enter Name :</b></label>
                <input type="text" placeholder="name" name="name" required/>

                <label><b>Enter Age :</b></label>
                <input type="number" placeholder="age" name="age" required/>

                <label><b>Enter city :</b></label>
                <input type="text" placeholder="city" name="city" required/>

                <label><b>Gender :</b></label>
                <input type="radio" name="gender" value="male" required/>Male
                <input type="radio" name="gender" value="female" required/>Female
                <br/><br/>
                <label><b>Photo :</b></label>
                <input type="file" name="file"><br/><br/>
				<p><b>Enter Sessional 1 marks:</b></p>
				
				 <label><b>Advanced Computer Architecture :</b></label>
                <input type="number" placeholder="marks" name="ca" required/>
                 <label><b>Unix-Linux Programming :</b></label>
                <input type="number" placeholder="marks" name="aca" required/>
                
                 <label><b>Computer Network :</b></label>
                <input type="number" placeholder="marks" name="edg" required/>
                
                 <label><b>Compiler Design :</b></label>
                <input type="number" placeholder="marks" name="c" required/><br/></br>
                
                <p><b>Enter Sessional 2 marks:</b></p>
                
                 <label><b>Advanced Computer Architecture:</b></label>
                <input type="number" placeholder="marks" name="daa" required/>
                
                 <label><b>Unix-Linux Programming :</b></label>
                <input type="number" placeholder="marks" name="maths" required/>
                
                 <label><b>Computer Network:</b></label>
                <input type="number" placeholder="marks" name="dsa" required/>
                
                 <label><b>Compiler Design :</b></label>
                <input type="number" placeholder="marks" name="os" required/><br/><br/>
                				<p><b>Enter Sessional 3 marks:</b></p>
                
                 <label><b>Advanced Computer Architecture :</b></label>
                <input type="number" placeholder="marks" name="cd" required/>
                
                 <label><b>Unix-Linux Programming :</b></label>
                <input type="number" placeholder="marks" name="at" required/>
                
                 <label><b>Computer Network :</b></label>
                <input type="number" placeholder="marks" name="java" required/>
                
                 <label><b>Compiler Design :</b></label>
                <input type="number" placeholder="marks" name="python" required/><br/><br/>
                
                
                <button type="submit"><b>Add Student</b></button>
            </div>
        </form>
</body>
</html>