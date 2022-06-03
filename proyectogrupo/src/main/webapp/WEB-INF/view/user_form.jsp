<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario para la creación de un usuario</title>
</head>
<body>

<form:form action="user_add" method="get" modelAttribute="usuario">


<form:label path="name">Nombre usuario: <form:input path="name"/></form:label>


<input type="submit" value="Enviar"/>

</form:form>

Formulario para la creación de un usuario


</body>
</html>