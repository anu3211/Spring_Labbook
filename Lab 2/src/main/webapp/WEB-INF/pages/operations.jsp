<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Trainee Management System</title>
</head>
<body>
<h2>Trainee Management System</h2>
	<table border="1">
		<tr>
			<th>Pick Your Operation</th>
		</tr>
		<tr>
			<td><a href="registerhere">Add a Trainee</a></td>
		</tr>
		<tr>
			<td><a href="delete">Delete a Trainee</a></td>
		</tr>
		<tr>
			<td><a href="modify">Modify a Trainee</a></td>
		</tr>
		<tr>
			<td><a href="retrieve">Retrieve a Trainee</a></td>
		</tr>
		<tr>
			<td><a href="retrieveall">Retrieve All Trainee</a></td>
		</tr>
	</table>
	<br><br>
	<c:if test="${!empty update}">
		<h3>${update}</h3>
	</c:if>
	<c:if test="${!empty register}">
		<h3>${register}</h3>
	</c:if>
	<c:if test="${!empty delete}">
		<h3>${delete}</h3>
	</c:if>
</body>
</html>