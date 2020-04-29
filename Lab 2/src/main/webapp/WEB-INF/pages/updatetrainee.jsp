<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Trainee</title>
</head>
<body>
<h2>Modify Operation</h2>
<c:if test="${empty trainee.traineeId}">
<form action="getupdate" method="get">
	<table border="1">
	
		<tr>
			<td>Please Enter the trainee ID</td>
			<td><input type="number" name="tid"></td>
			<td><input type="submit" value="modify"></td>
		</tr>
		</table>
		
		</form>
		
		</c:if>
	<c:if test="${!empty trainee.traineeId}">
	<form>
		<tr>
			<td>Please Enter the trainee ID</td>
			<td><input type="number" name="tid" value="${trainee.traineeId}"></td>
			<td><input type="submit" value="modify"></td>
		</tr></table></form>
		<br><br><br><br><br><br><br>
		<h2>Trainee Info</h2>
		
		<form  action="updating" method="get">
		
		<table border="1">
		<tr>
		<td>Trainee ID</td>
		<td><input type="number" name="traineeid" value="${trainee.traineeId}"></td></tr>
		<tr>
		<td>Trainee Name</td>
		<td><input type="text" name="traineeName" value="${trainee.traineeName}"></td></tr>
		<tr>
		<td>Trainee Domain</td>
		<td><input type="text" name="traineeDomain" value="${trainee.traineeDomain}"></td></tr>
		<tr>
		<td>Trainee Location</td>
		<td><input type="text" name="traineeLocation" value="${trainee.traineeLocation}"></td></tr>
		<tr>
		<td><input type="submit" value="Update"></td></tr>
	</table>
</form>
<br><br>
<a href="logged">Back to main Page</a>
</c:if>
</body>
</html>