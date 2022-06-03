<!--  Importo las librerias -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<!--  Creo el código sobre el que van a actuar las etiquetas.
Esta información normalmente la pediremos por controlador-->

<%
int visitas1 = 80;
pageContext.setAttribute("visitas1", visitas1);

String[] paises = { "España", "Francia", "Afganistan", "Portugal", "Inglaterra", "Alemania", "Bélgica", "Méjico" };
pageContext.setAttribute("paises", paises);
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pruebas con JSP</title>

<style>


#customers {
	font-family: Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

#customers td, #customers th {
	border: 1px solid #ddd;
	padding: 8px;
}

#customers tr:nth-child(even) {
	background-color: #f2f2f2;
}

#customers tr:hover {
	background-color: #ddd;
}

#customers th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #04AA6D;
	color: white;
}
</style>
</head>
<body>

	<!--  Creo el código que va a ejecutar el código anterior 
	-->
	<p p style="color: #FF0000">IF creado a partir de datos de JSP</p>
	<%
	if (visitas1 > 50) {
		out.print("<div style='color:blue'>La web tiene muchas visitas<br/></div>");
	} else {
		out.print("La web no tiene muchas visitas<br/>");
	}
	if (visitas1 > 50) {
		out.print("Son visitas de ");
		for (String pais : paises) {
			out.print(pais + ", ");
		}
	}
	out.print("Tenemos mucha suerte!!<br/>");
	%>

	<h2  style="color: #FF0000">Uso con la TAG c</h2>
	<c:set var="foo" value="2" />
	<c:out value="${foo}" />
<p>
	<h3 style="color: #FF0000">IF</h3>

	<c:if test="${visitas1 > 50 }">
		<h1>Más de 50 visitas!</h1>
	</c:if>
	<p>
	<h3 style="color: #FF0000">FOREACH</h3>

	<table style="width: 40%; text: align:right;" id="customers">
		<c:forEach var="pais" items="${paises}">
			<tr>
				<td><c:out value="${pais}" /></td>
			</tr>
		</c:forEach>

	</table>

	<h3  style="color: #FF0000">FORTOKENS</h3>

	<c:forTokens items="un, deux, trois, quatre, cinq" delims=","
		var="compter">
		<c:out value="${compter }"></c:out>

	</c:forTokens>
	<p>
	<h3 style="color: #FF0000">CHOOSE</h3>
	<%-- SWITCH --%>
	<c:choose>
		<c:when test="${visitas1 > 50 }">
			<h3>Mas de 50 visitas</h3>
		</c:when>

		<c:when test="${visitas1 < 50 }">
			<h3>Menos de 50 visitas</h3>
		</c:when>

		<c:otherwise>

			<h3>50 visitas justas</h3>

		</c:otherwise>

	</c:choose>


	<h3 p style="color: #FF0000">FORMATEANDO CIFRAS</h3>

	<fmt:formatNumber value="${foo }" maxFractionDigits="3"
		minFractionDigits="3" />

	<h3 p style="color: #FF0000">NUMBER FORMAT</h3>
	<c:set var="balance" value="120000.2309" />

	<p>
		solo parte del numero (1):
		<fmt:formatNumber type="number" maxIntegerDigits="3"
			value="${balance}"></fmt:formatNumber>

	</p>


	<h3 p style="color: #FF0000">REMOVE</h3>
	<c:set var="salary" scope="session" value="${4000}" />

	<p>
		Antes de quitar la variable salary
		<c:out value="${salary }" />

		<c:remove var="salary" />
	</p>

	<p>
		Despu�s de haber quitado la variable salary
		<c:out value="${salary }" />
	</p>


	<h3 p style="color: #FF0000">FORMATEANDO FECHAS</h3>

	<c:set var="now" value="<%=new java.util.Date()%>" />

	<p>
		HH:MM:SS ->
		<fmt:formatDate type="time" value="${now }" />
	</p>
	<p>
		DD-MES-YYYY HH:MM:SS ->
		<fmt:formatDate type="both" value="${now }" />
	</p>

	<p>
		FEC-MES-A�O HH:MM:SS ->
		<fmt:formatDate type="both" dateStyle="medium" timeStyle="medium"
			value="${now }" />
	</p>


	<h3 p style="color: #FF0000">FUNCIONES DE JAVA</h3>

	<c:set var="string" value="First this is first String" />

	<c:if test="${fn:startsWith(string, 'First') }">
		<p>La cadena empieza por First</p>
	</c:if>

	<c:if test="${fn:startsWith(string, 'second') }">
		<p>La cadena empieza por Second</p>
	</c:if>
	
	<%-- 	<c:if test="${edad > 40}"> --%>
	<%-- 		<c:out value="Tienes mucha experiencia!!" /> --%>
	<%-- 	</c:if> --%>
	<p>
	<c:choose>
		<c:when test="${edad > 40}">
			<h3>Tienes mucha experiencia!!</h3>
		</c:when>

		<c:otherwise>

			<h3>Seguro que tu sabes aprender rapido!!</h3>

		</c:otherwise>

	</c:choose>



</body>
</html>