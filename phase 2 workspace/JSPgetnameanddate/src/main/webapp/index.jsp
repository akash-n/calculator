<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "java.io.*,java.util.*, javax.servlet.*" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form  action="index.jsp">
		Enter U name:<input type="text" name="user"><br />
		<input type="submit" >
	</form>
	<%
	String uname = request.getParameter("user");
	Date date = new Date(session.getCreationTime());
    if (uname != null )
    	session.setAttribute("username",uname);
    	session.setAttribute("date",date);
  
	%>  
	<a href="user.jsp">log in</a>
</body>
</html>