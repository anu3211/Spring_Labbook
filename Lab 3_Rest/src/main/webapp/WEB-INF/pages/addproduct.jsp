<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<body>
<form method="get" action="addprocess">

<label>Enter Product id</label>
<div>
<input type="text" name="productid">
</div>

<label>Enter Product name</label>
<div>
<input type="text" name="productname">
</div>

<label>Enter Product price</label>
<div>
<input type="text" name="productprice">
</div>

<input type="submit" value="Register">

</form>
</body>
</html>
