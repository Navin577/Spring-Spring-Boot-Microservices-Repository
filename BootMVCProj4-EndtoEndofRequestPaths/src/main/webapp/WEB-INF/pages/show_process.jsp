<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> --%>
 <%@ page isELIgnored="false" %>
<%@ page import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
 <h1 style="color:Green,text-align:center">Welcome Spring Boot MVC</h1>
<%-- Model Attributes::Name:${Name},age:{age} --%>
<%-- <h1 style="color:red">Model Attributes::</h1>
<br>favColors::<%=Arrays.toString(((String[])request.getAttribute("favColors"))) %><br>
<br>nickNames::${nickNames}<br>
<br>phoneNumbers::${phoneNumbers}<br>
<br>idValues::${idValues} --%>
<!--  code in jstl and El -->

<br>favColors::<br><c:forEach var="fv" import="${favColors}">${fv}</c:forEach>
<br>nickName::<br><c:forEach var="nn" import="${nickNames}">${nn}</c:forEach>
<br>phoneNumber::<br><c:forEach var="ph" import="${phonrNumbers}">${ph}</c:forEach>
<br>idValues::<br><c:forEach var="iv" import="${idValues}">${iv}</c:forEach>