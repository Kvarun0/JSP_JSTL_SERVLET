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
	
		response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");
		
		if(session.getAttribute("uname")==null || session.getAttribute("password")==null){
			response.sendRedirect("login.jsp");
		}
	%>
	
	Videos ....
	
	<iframe src="https://www.youtube.com/embed/MCLkRSy9XM8" width="560" height="315" title="Heer _ full song ( slowed+ reverb) #slowedreverb #youtube" frameborder="0" allowfullscreen></iframe>
</body>
</html>