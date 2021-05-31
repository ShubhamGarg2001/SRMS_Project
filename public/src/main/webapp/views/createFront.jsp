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
                <input type="text" placeholder="age" name="age" required/>

                <label><b>Enter city :</b></label>
                <input type="text" placeholder="city" name="city" required/>

                <label><b>Gender :</b></label>
                <input type="radio" name="gender" value="male" required/>Male
                <input type="radio" name="gender" value="female" required/>Female
                <br/>
                <label><b>Photo :</b></label>
                <input type="file" name="file"><br/><br/>
				<p><b>Enter Sem 1 marks:</b></p>
				
				 <label><b>Computer Architecture:</b></label>
                <input type="text" placeholder="marks" name="ca" required/>
                 <label><b>Advance Computer Architecture :</b></label>
                <input type="text" placeholder="marks" name="aca" required/>
                
                 <label><b>EDG :</b></label>
                <input type="text" placeholder="marks" name="edg" required/>
                
                 <label><b>C :</b></label>
                <input type="text" placeholder="marks" name="c" required/><br/></br>
                <p><b>Enter Sem2 marks:</b></p>
                
                 <label><b>DAA :</b></label>
                <input type="text" placeholder="marks" name="daa" required/>
                
                 <label><b>Maths :</b></label>
                <input type="text" placeholder="marks" name="maths" required/>
                
                 <label><b>DSA :</b></label>
                <input type="text" placeholder="marks" name="dsa" required/>
                
                 <label><b>Operating System :</b></label>
                <input type="text" placeholder="marks" name="os" required/><br/><br/>
                				<p><b>Enter Sem 3 marks:</b></p>
                
                 <label><b>Compiler Design :</b></label>
                <input type="text" placeholder="marks" name="cd" required/>
                
                 <label><b>Automata Theory :</b></label>
                <input type="text" placeholder="marks" name="at" required/>
                
                 <label><b>Java :</b></label>
                <input type="text" placeholder="marks" name="java" required/>
                
                 <label><b>Python :</b></label>
                <input type="text" placeholder="marks" name="python" required/><br/><br/>
                
								<p><b>Enter Sem 4 marks:</b></p>
				 
                 <label><b>Data Structure :</b></label>
                <input type="text" placeholder="mrks" name="ds" required/>
                 
                 <label><b>Computer Network:</b></label>
                <input type="text" placeholder="marks" name="cn" required/>
                 
                 <label><b>DBMS :</b></label>
                <input type="text" placeholder="marks" name="dbms" required/>
                 
                 <label><b>English :</b></label>
                <input type="text" placeholder="marks" name="english" required/>
                
                <button type="submit"><b>Add Student</b></button>
            </div>
        </form>
</body>
</html>