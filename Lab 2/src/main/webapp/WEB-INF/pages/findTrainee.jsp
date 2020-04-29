<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Retrieve Trainee</title>
</head>
<body>
<h2>Retrieve Operation</h2>
<form action="findTraineeprocess" method="get">
	<table border="1">
	<c:if test="${empty trainee.traineeId}">
		<tr>
			<td>Please Enter the trainee ID</td>
			<td><input type="number" name="tid"></td>
			<td><input type="submit" value="retrieve"></td>
		</tr>
		</table>
		
		</form>
		
		</c:if>
	<c:if test="${!empty trainee.traineeId}">
	<form>
		<tr>
			<td>Please Enter the trainee ID</td>
			<td><input type="number" name="tid" value="${trainee.traineeId}"></td>
			<td><input type="submit" value="retrieve"></td>
		</tr></table></form>
		<br><br><br><br><br><br><br><br>
		<h2>Trainee Info</h2>
		<form>
		
		<table border="1">
		<tr><th>Trainee Id</th><th>Trainee Name</th><th>Trainee Domain</th><th>Trainee Location</th></tr>
		<tr><td>${trainee.traineeId}</td><td>${trainee.traineeName}</td><td>${trainee.traineeDomain}</td><td>${trainee.traineeLocation}</td></tr>
		
	</table>
</form>
<br><br>
<a href="logged">Back To Main Page</a>
</c:if>
</body>
</html>