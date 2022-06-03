<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:if test="${verif}">
		<h1>LOREM IPSUM</h1>
	</c:if>
	
	<table style="width: 40%; text-align: right;">
		<c:forEach var="ciudad" items="${ciudades}">
			<tr>
				<td><c:out value="${ciudad}" /></td>
			</tr>
		</c:forEach>
	</table>
	
	
	<c:choose>
		<c:when test="${numFloresVendidas < 30}">
			<h3>No se ha vendido muchas flores</h3>
		</c:when>
		<c:when test="${numFloresVendidas < 50}">
			<h3>El número de ventas es importante pero...</h3>
		</c:when>
		<c:otherwise>
			<h3>Se han vendido muchas flores</h3>
		</c:otherwise>
	</c:choose>
	
	



</body>
</html>