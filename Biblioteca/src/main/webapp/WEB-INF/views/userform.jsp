<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CAMPUS 2B - CRUD JAVA SPRING MVC</title>
<style type="text/css">
fieldset {
	border: 1px solid #dedede;
}

legend {
	font-size: 20px;
	text-transform: uppercase;
}

.error {
	color: red;
}

.resltTable {
	width: 50%;
	border-collapse: collapse;
	border-spacing: 0px;
}

.resltTable td, .resltTable th {
	border: 1px solid #565454;
}
</style>
</head>
<body>
	<fieldset>
		<legend> FORMULARIO PARA INGRESAR USUARIOS </legend>
		<form:form action="saveUser" method="POST" modelAttribute="user">
			<table>
				<tr>
					<th>NOMBRE</th>
					<td><form:input path="name" /> <form:errors path="name"
							cssClass="error" /></td>
					<th>EMAIL</th>
					<td><form:input path="email" /> <form:errors path="email"
							cssClass="error" /></td>
					<td>
						<button type="submit">Validar</button>
					</td>
				</tr>
			</table>
		</form:form>
	</fieldset>
	<br />
	<br />

	<fieldset>
		<legend> LISTA DE USUARIOS </legend>
		<table class="resltTable">
			<tr>
				<th>NOMBRE</th>
				<th>EMAIL</th>
			</tr>
			<c:forEach items="${users}" var="user">
				<tr>
					<td>${user.name}</td>
					<td>${user.email}</td>
				</tr>
			</c:forEach>
		</table>
	</fieldset>
</body>
</html>