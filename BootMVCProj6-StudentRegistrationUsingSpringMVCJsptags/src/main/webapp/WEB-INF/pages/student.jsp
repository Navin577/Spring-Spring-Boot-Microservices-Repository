<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<h1 style="color:red;text-align=center">Student Registration Form</h1>
<frm:form action="register" method="POST" modeattribute="stud">
<table align="center" bgcolor="pink">
<tr>
<td>Student Rollno:</td>
<td><input path="sno"></td>
</tr>
<tr>
<td>Student Name:</td>
<td><frm:input path="sname"/></td>
</tr>
<tr>
<td>Student Addrs:</td>
<td><frm:input path="addrs"/></td>
</tr>
<tr>
<td>Student Avg:</td>
<td><frm:input path="savg"/></td>
</tr>
<tr>
<td><input type="submit" value="Register"></td>
<td><input type="reset" value="cancel"></td>
</tr>
</table>
</frm:form>
