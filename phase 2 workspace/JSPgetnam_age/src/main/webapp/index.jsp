<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>login</h1>
	<form method="get" action="index.jsp">
		Enter U name:<input type="text" name="user" required><br />
		Enter d o b:<input type="text" name="date" required><br />
		<input type="submit" value="check">
	</form>
	
	<%
	String uname = request.getParameter("user");
	String date=request.getParameter("date");
	if (uname != null && date != null) {
	
			out.println("welcome" + uname);
			out.println("welcome" + date);
	}
	%>
</body>
</html>