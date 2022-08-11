<html>
<body>
<h2>player details</h2>
<form action="" method="post">
 
  Enter name: <input type="text" name="name" /><br/>
        Enter teamName: <input type="text" name="teamName"/><br/>
        Enter age: <input type="text" name="age"/><br/>
         <input type="submit" name="register" value="Player Details">
         </form>
         <%
  if(request.getParameter("register")!=null){%>
	 <jsp:useBean id="user" class="com.player.Player" scope="request"></jsp:useBean> 
	 

 <jsp:setProperty property="*" name="user"/>
	 <jsp:forward page="PlayerDAOServlet"></jsp:forward>
	 
<%  }
%> 
<a href=display.jsp></a>
</body>
</html>
