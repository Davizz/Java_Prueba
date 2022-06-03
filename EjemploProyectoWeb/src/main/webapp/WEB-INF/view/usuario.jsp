<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form action="crea_usuario" method="POST" modelAttribute="usuario">
		<form:label path="name" cssClass="clase_del_label" />Nombre de usuario
		<form:input path="name" cssClass="clase_utilizada" />
		<form:label path="email" cssClass="clase_del_label" />Email
		<form:input path="email" cssClass="clase_utilizada" />

		<input type="submit" value="Enviar Datos">

	</form:form>

</body>
</html>