<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Data</title>
</head>
<body>
<h2>Trainees Details</h2>
<table border="1">
<tr> <th>Trainee ID</th>
<th>Trainee Name</th>
<th>Trainee Domain</th>
<th>Trainee Location</th></tr>
	<c:forEach items="${traineelist}" var="trainee">
		<tr>
			<td>${trainee.traineeId}</td>
			<td>${trainee.traineeName}</td>
			<td>${trainee.traineeDomain}</td>
			<td>${trainee.traineeLocation}</td>
		</tr>
	</c:forEach>
	</table>
<a href="logged">Back To MainPage</a>
</body>
</html>