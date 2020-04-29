<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
<h2>Enter Trainee Details</h2>
<form method="get" action="processregister">
<table>
<tr>
<td> Trainee Id </td>
<td>
<input type="number" name="traineeid">
</td>
</tr>
<tr>
<td>Trainee Name</td>
<td>
<input type="text" name="traineename">
</td>
</tr>
<tr>
<td>Trainee Location</td>
<td>
<input type="radio" name="location" value="Chennai">Chennai<input type="radio" name="location" value="Banglore">Banglore
<input type="radio" name="location" value="Pune">Pune<input type="radio" name="location" value="Mumbai">Mumabi
</td>
</tr>
<tr>
<td>Trainee Domain</td>
<td>
<select name="domain">
	<option value="">Select Domain</option>
	<option value="Java">Java</option>
	<option value="Python">Python</option>
	<option value="Angular">Angular</option>
</select>
</td>
</tr>
<tr>
<td>
<input type="submit" value="Add Trainee">
</td>
<tr>
</table>
</form>
</body>
</html>