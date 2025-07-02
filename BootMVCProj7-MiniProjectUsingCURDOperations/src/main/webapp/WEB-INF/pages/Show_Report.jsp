<%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1 style="color:red;text-align:center">Student Report</h1>
<c:choose>
<c:when test="${!empty listStudents }">
<table border="1" bgcolor="pink" align="center"  >
<tr bgcolor="cyan">
<th>StudentNo</th><th>StudentName</th><th>StudentCourse</th><th>StudentFee</th><th>Operations</th>
</tr>
<c:forEach var="student" items="${listStudents}">
<tr>
<td>${student.sno}</td>
<td>${student.sname}</td>
<td>${student.scourse}</td>
<td>${student.sfee}</td>
<td><a href="edit?no=${student.sno}"><img src="images/Edit.jpeg" width="50px" height="50px"></a>
 &nbsp;&nbsp;&nbsp; <a href="edit?no=${student.sno}"><img src="images/delete.jpeg" width="50px" height="50px"></a></td>
</tr>
</c:forEach>
</table>

</c:when>
<c:otherwise>
<h1 style="color:red;text-align:center">No Record Found</h1>
</c:otherwise>

</c:choose><br>
<c:if test="${!empty resultMsg}">
<h1 style="color:gree;text-align:center">${resultMsg}</h1>
</c:if>
<br>
<form>
<h1 style="color:black;text-align:center"><a href="register"><img src="images/add.jpg" ><br><br>RegisterStudent</a></h1>
<h1 style="color:red;text-align:center"><a href="./"><img src="images/home.jpg" ><br><br>Home</a></h1>
</form>
