<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="user" class="com.player.Player" scope="session" />
	 <table  >
	 
<tr><jsp:getProperty property="name" name="ply"/></tr>
<tr><jsp:getProperty property="teamName" name="ply"/></tr>
<tr> <jsp:getProperty property="age" name="ply"/></tr>
 </table>

</body>
</html>