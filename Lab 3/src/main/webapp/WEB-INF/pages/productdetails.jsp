<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<body>
<h2>

	<c:if test="${not empty lists}">

		<ul>
			<c:forEach var="product" items="${lists}">
				Id   <c:out value="${product.productId}"/>
				Name  <c:out value="${product.productName}"/>
				Price  <c:out value="${product.productPrice}"/>
				<br>
			</c:forEach>
		</ul>

	</c:if>

</h2>
</body>
</html>