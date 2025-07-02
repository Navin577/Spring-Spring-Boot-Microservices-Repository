<%@ page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<h1 style="color:red;text-align:center">Add Student</h1>
<frm:form modelAttribute="student">
<table align="center" bgcolor="cyan">
<tr>
<td>Student Name:</td>
<td><frm:input  path="sname"/></td>
</tr>
<tr>
<td>Student Course:</td>
<td><frm:input  path="scourse"/></td>
</tr>
<tr>
<td>Student Fee:</td>
<td><frm:input  path="sfee"/></td>
</tr>
<tr>
<td><input type="submit" value="Add"></td>
<td><input type="reset" value="cancel"> </td>
</tr>
</table>
</frm:form>
