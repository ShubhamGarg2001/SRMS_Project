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
            input[type=number],
            input[type=password] {
                width: 100%;
                padding: 12px 20px;
                margin: 8px 0;
               
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
            .container1 {
                padding: 16px;
            }
            h4{
            color:blue;
            text-align:center;
            }
input::-webkit-outer-spin-button,
input::-webkit-inner-spin-button {
  -webkit-appearance: none;
  margin: 0;
}
        </style>
</head>
<body>
        <h2>Update Student Details</h2>
        <h4>${message}</h4>
        <form action="/updateLast/${student.getRollno()}" method="post" enctype="multipart/form-data">
            <div class="container1">
                <label><b>Update Name :</b></label>
                <input type="text" name="name" value="${student.getName()}"/><br/>
                <label><b>Update Age :</b></label>
                <input type="number" name="age" value="${student.getAge()}"/></br>
                <label><b>Update City :</b></label>
                <input type="text" name="city" value="${student.getCity()}"/></br>
                <label><b>Update Photo :</b></label></br></br>
                <input type="file" name="file"><br/><br/>
                
                <p><b>Update Sessional 1 marks:</b></p>
				
				 <label><b>Advanced Computer Architecture:</b></label>
                <input type="number" placeholder="marks" name="ca" value="${student.getResult().getSem1().getCa()}" required/>
                 <label><b>Unix-Linux Programming:</b></label>
                <input type="number" placeholder="marks" name="aca" value="${student.getResult().getSem1().getAca()}" required/>
                
                 <label><b>Computer Network:</b></label>
                <input type="number" placeholder="marks" name="edg" value="${student.getResult().getSem1().getEdg()}" required/>
                
                 <label><b>Compiler Design :</b></label>
                <input type="number" placeholder="marks" name="c" value="${student.getResult().getSem1().getC()}" required/><br/><br/>
              
                <p><b>Update Sessional 2 marks:</b></p>
                
                 <label><b>Advanced Computer Architecture :</b></label>
                <input type="number" placeholder="marks" name="daa" value="${student.getResult().getSem2().getDaa()}" required/>
                
                 <label><b>Unix-Linux Programming :</b></label>
                <input type="number" placeholder="marks" name="maths" value="${student.getResult().getSem2().getMaths()}" required/>
                
                 <label><b>Computer Network :</b></label>
                <input type="number" placeholder="marks" name="dsa" value="${student.getResult().getSem2().getDsa()}" required/>
                
                 <label><b>Compiler Design :</b></label>
                <input type="number" placeholder="marks" name="os" value="${student.getResult().getSem2().getOperatingSystem()}" required/><br/><br/>
                				<p><b>Update Sessional 3 marks:</b></p>
                
                 <label><b>Advanced Computer Architecture :</b></label>
                <input type="number" placeholder="marks" name="cd" value="${student.getResult().getSem3().getCompilerDesign()}" required/>
                
                 <label><b>Unix-Linux Programming :</b></label>
                <input type="number" placeholder="marks" name="at" value="${student.getResult().getSem3().getAutomataTheory()}" required/>
                
                 <label><b>Computer Network :</b></label>
                <input type="number" placeholder="marks" name="java" value="${student.getResult().getSem3().getJava()}" required/>
                
                 <label><b>Compiler Design :</b></label>
                <input type="number" placeholder="marks" name="python" value="${student.getResult().getSem3().getPython()}" required/><br/><br/>
                <Button type="submit"><b>Update Now</b></Button>
            </div>
            </form>
        
</body>
</html>