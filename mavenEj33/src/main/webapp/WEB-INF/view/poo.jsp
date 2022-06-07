<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="/WEB-INF/view/templates/head.jsp"></jsp:include>
</head>
<body>

	<h1>${titulo}</h1>
	<p>${mensaje}</p>

	<c:if test="${valid_poo == true }">
		<p>${coche}</p>
		<p>${coche.description}</p>
	</c:if>
	<c:if test="${valid_poo_herencia == true }">
		<p>${coche}</p>
		<p>${coche.description}</p>
		<p>${camion}</p>
		<p>${camion.carga}</p>
	</c:if>
	
	<c:if test="${valid_poo_ej33 == true }">
		<p>${estudiante}</p>
		<hr>
		<p>${trabajador}</p>
	</c:if>


</body>
</html>