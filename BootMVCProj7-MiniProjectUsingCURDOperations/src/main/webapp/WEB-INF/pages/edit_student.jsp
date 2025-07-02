<%@ page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="frm"%>
<h1 style="color:red;text-align:center">Edit Student</h1>
<frm:form modelAttribute="student">
<table bgcolor="cyan" align="center">
<tr>
<td>Student No:</td>
<td><frm:input path="sno" readonly="true"/></td>
</tr>
<tr>
<td>Student Name:</td>
<td><frm:input path="sname" type="text"/></td>
</tr>
<tr>
<td>Student Course:</td>
<td><frm:input path="scourse" /></td>
</tr>
<tr>
<td>Student Fee</td>
<td><frm:input path="sfee"/></td>
</tr>
<tr>
<td><input type="submit" value="Edit Student"></td>
<td><input type="reset" value="cancel"></td>
</tr>
</table>
</frm:form>
