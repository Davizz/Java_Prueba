<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CAMPUS 2B - EDITANDO USUARIO</title>
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
		<legend>Formulario para ingresar usuarios</legend>
		<form:form action="saveUser" method="post" modelAttribute="user">
			<table>
				<tr>
					<th>Nombre</th>
					<td><form:input path="name" /> <form:errors path="name"
							cssClass="error" /></td>
					<th>Email</th>
					<td><form:input path="email" /> <form:errors path="email"
							cssClass="error" /></td>
					<td><button type="submit">Validar</button></td>
				</tr>
			</table>
		</form:form>
	</fieldset>
	<br>
	<br>

	<fieldset>
		<legend>Lista de usuarios</legend>
		<table class="resltTable">
			<tr>
				<th>Nombre</th>
				<th>Email</th>
				<th>Actualizar</th>
				<th>Borrar</th>

			</tr>
			<c:forEach items="${users}" var="user">
				<c:url var="delete" value="/deleteUser">
					<c:param name="id" value="${user.id}" />
				</c:url>
				<c:url var="edit" value="/editUser">
					<c:param name="id" value="${user.id}" />
				</c:url>
				<tr>
					<td>${user.name}</td>
					<td>${user.email}</td>
					<td><a href="${edit}"
						title="Actualizar ${user.name} con id ${user.id}">
							<button type="submit" class="btn btn-success">Modificar</button>
					</a></td>
					<td><a href="${delete}"
						title="Borrar ${user.name} con id ${user.id}">
							<button type="submit" class="btn btn-danger"
								onclick="if(!(confirm('¿Seguro que quieres eliminar el registro?'))) return false">Borrar</button>
					</a></td>
				</tr>
			</c:forEach>

		</table>
	</fieldset>

</body>
</html>

</body>
</html>