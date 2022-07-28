<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="/WEB-INF/view/templates/head.jsp"></jsp:include>
</head>
<body class="d-flex flex-column h-100 text-center">
	<jsp:include page="/WEB-INF/view/templates/nav.jsp"></jsp:include>
	<div class="flex-shrink-0">
		<div class="container">
			<div class="row">
				<div class="col-12">
					<h1 class="text-center">${titulo}</h1>
					<p class="text-center">${descripcion}</p>
					<table class="table table-striped">
						<tr>
							<th>Columna</th>
							<th>Valor</th>
						</tr>
						<tr>
							<th>Nombre Perfil</th>
							<td>${user.usename}</td>
						</tr>
						<tr>
							<th>Nombre</th>
							<td>${user.name}</td>
						</tr>
						<tr>
							<th>Apellido</th>
							<td>${user.surname}</td>
						</tr>
						<tr>
							<th>Email</th>
							<td>${user.email}</td>
						</tr>
						<tr>
							<th>Habilitado</th>
							<td>${user.enabled}</td>
						</tr>
						<tr>
							<th>Contraseña</th>
							<td>${user.password}</td>
						</tr>
					
					
					</table>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="/WEB-INF/view/templates/footer.jsp">
		<jsp:param name="web" value="campus2b.com" />
	</jsp:include>
</body>
</html>