<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table {
    margin: 0 auto;
  }
h2{
text-align:center;
}
.center{
width:00px;
margin:auto;
}
</style>
</head>
<body>
<h2>List of Customers</h2>
<div class="center">
        <table border="1" cellpadding="5">
            <tr>
            	<th>photo</th>
                <th>name</th>
                <th>age</th>
                <th>ciy</th>
            </tr>
            <c:forEach var="student" items="${students}">
                <tr>
                    <td><c:out value="${student.getComilerDesign()}" /></td>
                    <td><c:out value="${student.getAutomataTheory()}" /></td>
                    <td><c:out value="${student.getAge()}" /></td>
                    <td><c:out value="${student.getCity()}" /></td>
                </tr>
            </c:forEach>
        </table>
</div>

</body>
</html>