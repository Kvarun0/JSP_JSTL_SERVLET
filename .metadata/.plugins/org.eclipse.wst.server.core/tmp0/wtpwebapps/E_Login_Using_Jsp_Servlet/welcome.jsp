<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<%
		//for browser
		response.setHeader("Cache-Control","no-cache, no-store, must-revalidate"); //HTTP 1.1
				
		response.setHeader("Pragma", "no-cache");	//HTTP 1.0 and Older
				
		response.setHeader("Expires", "0");	//For Proxie server
	
		if(session.getAttribute("uname")==null || session.getAttribute("password")==null ){
			response.sendRedirect("login.jsp");
		}
	%>
	
	
	Welcome .... ${uname}
	
	<a href="videos.jsp">Videos</a>

	<form action="Logout">
		<input type="submit" value="Logout">
	</form>	
	
	
</body>
</html>