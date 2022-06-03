



<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%
String[] ciudades = { "Bilbao", "Madrid", "Londres", "Zamora", "Lisboa", "Munich", "Vitoria", "Paris" };
pageContext.setAttribute("ciudades", ciudades);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link href="${pageContext.request.contextPath}/resources/css/css2.css"
	rel="stylesheet" type="text/css" />

<link
	href="${pageContext.request.contextPath}/resources/css/estilos.css"
	rel="stylesheet" type="text/css" />

<link rel="icon" type="image/x-icon"
	href="${pageContext.request.contextPath}/resources/img/favicon.ico" />

</head>
<body>

	<%-- Tienes que realizar las acciones siguientes: Crear un arraylist de
ciudades en el controlador e imprimirlo en una hoja JSP con un bucle.

Crear una variable booleana llamada verif en el controlador,
inicializarla a TRUE e imprimir un texto LOREM IPSUM en el JSP si el
valor de la variable verif es TRUE. 

Crear una variable numFloresVendidas
en el controlador. Inicializarla a 50. Y en el JSP, indicar un mensaje
en función del número de flores vendidas: 
Si la variable es inferior a
30, debe imprimir que “No se ha vendido muchas flores” 
Si la variable es
comprendida entre 30 y 50(incluidos), debe imprimir que “El número de
ventas es importante pero que podría ser mejor”. 
Si la variable es
superior a 50, debe imprimir que “Se han vendido muchas flores”. 
Captar la hora actual y imprimirla en pantalla en formato DD/MM/YYYY--%>

<p>Lista con datos obtenidos en JSP</p>
	<table style="width: 40%; text: align:right;" id="customers">
		<c:forEach var="ciudades" items="${ciudades}">
			<tr>
				<td><c:out value="${ciudades}" /></td>
			</tr>
		</c:forEach>
	</table>
<p>Lista con datos obtenidos en Controlador</p>
<table style="width: 40%; text: align:right;" id="customers">
		<c:forEach var="coches" items="${coches}">
			<tr>
				<td><c:out value="${coches}" /></td>
			</tr>
		</c:forEach>
	</table>
	
	<p>Boolean pedido por controlador</p>
	<c:choose>
		<c:when test="${verif == true}">
			<h3>LOREM IPSUM</h3>;
		</c:when>
		<c:otherwise>
			<h3>NADA</h3></c:otherwise>
	</c:choose>

<p>If pedido por Controlador</p>
	<c:choose>
		<c:when test="${numfloresvendidas < 30}">
			<h3>No se ha vendido muchas flores</h3>
		</c:when>
		<c:when test="${numfloresvendidas > 30 && numfloresvendidas < 50}">
			<h3>El número de ventas es importante pero que podría ser mejor</h3>
		</c:when>
		<c:otherwise>
			<h3>Se han vendido muchas flores!!</h3>
		</c:otherwise>
	</c:choose>

<p>Hora actual</p>
	<c:set var="now" value="<%=new java.util.Date()%>" />

	<p>
		
		<fmt:formatDate type="time" value="${now }" />
	</p>
<p>Fecha actual</p>
	<p>
	
		<fmt:formatDate type="both" value="${now }" />
	</p>
</body>
</html>