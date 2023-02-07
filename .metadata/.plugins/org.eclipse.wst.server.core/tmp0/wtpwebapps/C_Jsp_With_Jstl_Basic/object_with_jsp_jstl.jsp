<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
 <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h3>Student List </h3> ${student}
	<br>
	<br>
	
	<h3>Using ForEach</h3>
	<c:forEach items="${student}" var="s">
		${s}
		<br/>
	</c:forEach>
	
	<h3>Name Using ForEach</h3>
	<c:forEach items="${student}" var="s">
		${s.name}
		<br/>
	</c:forEach>
	
	<h3>Roll No. Using ForEach</h3>
	<c:forEach items="${student}" var="s">
		${s.rollNo}
		<br/>
	</c:forEach>
	
	 
</body>
</html>