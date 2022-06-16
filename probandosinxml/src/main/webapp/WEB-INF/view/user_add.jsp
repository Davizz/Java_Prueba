<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="/WEB-INF/view/templates/head.jsp"></jsp:include>
</head>
<body class="d-flex flex-column h-100 text-center">

	<jsp:include page="/WEB-INF/view/templates/nav.jsp"></jsp:include>
	<div class="container">
		<div class="row">
			<h2>Información acerca del usuario</h2>
			<h3>Tabla con las propiedades</h3>
			<table class="table table-striped table-hover">
				<tr>
					<td>Nombre :</td>
					<td>${user.name}</td>
				</tr>
				<tr>
					<td>Email :</td>
					<td>${user.email}</td>
				</tr>

				<tr>
					<td>Edad :</td>
					<td>${user.age}</td>
				</tr>
	
				<tr>
					<td>Contraseña :</td>
					<td>********************</td>
				</tr>
				
				<tr>
					<td>Nombre fichero avatar</td>
					<td>${user.avatar}</td>
				</tr>
			
			</table>
			<h3>To String de Usuario</h3>
			${user}
		</div>
	</div>
	<jsp:include page="/WEB-INF/view/templates/footer.jsp">
		<jsp:param name="web" value="campus2b.com" />
	</jsp:include>


</body>
</html>