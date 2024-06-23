<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.pace.bean.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Session Page</title>
</head>
<body>
	<h3>Dynamic Data from Servlet</h3>
	<%
	session=request.getSession();
	User user=(User) session.getAttribute("user");
	out.println("Hello " + user.getUsername() + "<br>");
	out.println("Hello " + user.getEmailid() + "<br>");
	%>
	<h3>Dynamic Data in a table from session objects</h3>
	
	<table border="1">
	<tr>
		<th>User Name</th>
		<th>Email id</th>
	</tr>
	<tr>
		<td><%=user.getUsername()%></td>
		<td><%=user.getEmailid()%></td>
	</table>
</body>
</html>