<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>



<%
int visitas1 = 100;
pageContext.setAttribute("visitas1", visitas1);

String[] paises = { "España", "Francia", "Afganistán", "Portugal", "Inglaterra", "Alemania", "Belgica", "Méjico" };
pageContext.setAttribute("paises", paises);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pruebas con los JSP tags</title>

<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>

<link
	href="${pageContext.request.contextPath}/resources/css/bootstrap.css"
	rel="stylesheet" type="text/css" />
<link rel="icon" type="image/x-icon"
	href="${pageContext.request.contextPath}/resources/img/favicon.ico" />

</head>
<body class="d-flex flex-column h-100 text-center">

	<jsp:include page="/WEB-INF/view/templates/nav.jsp"></jsp:include>

	<div class="flex-shrink-0">
		<div class="container">
			<div class="row">
				<div class="col-12">
					<h1>JSP TAGS</h1>
					<h2>Primer uso</h2>
					<%
					if (visitas1 > 50) {
						out.print("La web tiene muchas visitas<br/>");
					} else {
						out.print("La web no tiene muchas visitas<br/>");
					}
					if (visitas1 > 50) {
						out.print("Son visitas de ");
						for (String pais : paises) {

							out.print(pais + ", ");
						}
					}
					out.print("... Tenemos mucha suerte!!! <br/>");
					%>


					<h2>Uso con la TAG c</h2>
					<%-- DECLARACIÓN Y IMPRESIÓN VALOR --%>

					<h3>Declarando variables</h3>
					<c:set var="foo" value="2" />
					<c:out value="${foo}" />

					<%-- IF  --%>
					<h3>IF</h3>
					<c:if test="${visitas1 > 50}">
						<h1>¡Mas de 50 visitas!</h1>
					</c:if>
					<h3>FOREACH</h3>
					<%-- foreach --%>
					<table style="width: 40%; text-align: right;">
						<c:forEach var="pais" items="${paises}">
							<tr>
								<td><c:out value="${pais}" /></td>
							</tr>
						</c:forEach>
					</table>
					<h3>FORTOKENS</h3>
					<c:forTokens items="un,deux,trois,quatre" delims="," var="compter">
						<c:out value="${compter}" />
						<br />
					</c:forTokens>

					<h3>SWITCH</h3>
					<%--SWITCH  --%>

					<c:choose>
						<c:when test="${visitas1 > 50}">
							<h3>más de 50 vísitas</h3>
						</c:when>
						<c:when test="${visitas1 < 50}">
							<h3>menos de 50 vísitas</h3>
						</c:when>
						<c:otherwise>
							<h3>50 vísitas justas</h3>
						</c:otherwise>
					</c:choose>
					<h3>FORMATEANDO CIFRAS</h3>
					<fmt:formatNumber value="${foo}" maxFractionDigits="3"
						minFractionDigits="3" />
					<h3>Number Format:</h3>
					<c:set var="balance" value="120000.2309" />


					<p>
						Solo parte del número (1):
						<fmt:formatNumber type="number" maxIntegerDigits="3"
							value="${balance}" />
					</p>
					<p>
						Redondeando (2):
						<fmt:formatNumber type="number" maxFractionDigits="0"
							value="${balance}" />
					</p>
					<p>
						Sin el punto de millar (3):
						<fmt:formatNumber type="number" groupingUsed="false"
							value="${balance}" />
					</p>
					<h3>FORMATEANDO PORCENTAJES</h3>
					<p>
						Porcentaje (1):
						<fmt:formatNumber type="percent" maxIntegerDigits="3"
							value="${balance}" />
					</p>
					<p>
						Porcentaje (2):
						<fmt:formatNumber type="percent" minFractionDigits="10"
							value="${balance}" />
					</p>
					<p>
						Porcentaje con Solo parte del número(3):
						<fmt:formatNumber type="percent" maxIntegerDigits="3"
							value="${balance}" />
					</p>
					<h3>USO DE REMOVE</h3>

					<%-- <c:redirect url = "https://www.google.com"/> --%>
					<c:set var="salary" scope="session" value="${2000*2}" />
					<p>
						Before Remove Value:
						<c:out value="${salary}" />
					</p>
					<c:remove var="salary" />
					<p>
						After Remove Value:
						<c:out value="${salary}" />
					</p>

					<h3>Formateando fechas:</h3>
					<c:set var="now" value="<%=new java.util.Date()%>" />

					<p>
						hh:mm:ss ->
						<fmt:formatDate type="time" value="${now}" />
					</p>

					<p>
						dd-mes-yyyy ->
						<fmt:formatDate type="date" value="${now}" />
					</p>

					<p>
						dd-mes-yyyy hh:mm:ss ->
						<fmt:formatDate type="both" value="${now}" />
					</p>

					<p>
						dd/mm/yy hh:mm ->
						<fmt:formatDate type="both" dateStyle="short" timeStyle="short"
							value="${now}" />
					</p>

					<p>
						fec-mes-año hh:mm:ss ->
						<fmt:formatDate type="both" dateStyle="medium" timeStyle="medium"
							value="${now}" />
					</p>

					<p>
						fecha mes año hh:mm:ss ->
						<fmt:formatDate type="both" dateStyle="long" timeStyle="long"
							value="${now}" />
					</p>

					<p>
						yyyy-MM-dd ->
						<fmt:formatDate pattern="yyyy-MM-dd" value="${now}" />
					</p>


					<h3>Funciones de java</h3>

					<%--https://docs.oracle.com/javaee/5/jstl/1.1/docs/tlddocs/ --%>

					<c:set var="string" value="Second: This is first String." />

					<c:if test="${fn:startsWith(string, 'First')}">
						<p>String starts with First</p>
					</c:if>

					<br />
					<c:if test="${fn:startsWith(string, 'Second')}">
						<p>String starts with Second</p>
					</c:if>



					<c:set var="string1" value="This is first String." />
					<c:set var="string2" value="${fn:substring(string1, 5, 15)}" />

					<p>Final sub string : ${string2}</p>


				</div>
			</div>
		</div>
	</div>



	<jsp:include page="/WEB-INF/view/templates/footer.jsp">
		<jsp:param name="web" value="campus2b.com" />
	</jsp:include>

<script
		src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>



</body>
</html>