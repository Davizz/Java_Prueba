<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="/WEB-INF/view/templates/head.jsp"></jsp:include>
</head>
<body class="d-flex flex-column h-100 text-center">
	<jsp:include page="/WEB-INF/view/templates/nav.jsp"></jsp:include>
	<div class="flex-shrink-0">
		<div class="container">
			<div class="row mt-4">
				<div class="col-lg-4">
					<fieldset>
						<legend>${titulo}</legend>
						<p>${descripcion}</p>
						<form:form action="add_role" method="post" modelAttribute="role">
							<div class="mb-3">
								<form:label path="user.username" cssClass="form-label">Nombre Perfil</form:label>
								<form:input value="${user.username}" disabled="true" path="user.username" cssClass="form-control" />
								<form:errors path="user.username" cssClass="error" />
								<form:hidden path="user.username" value="${user.username}"/>
							</div>

							<div class="mb-3">
								<label for="authority" class="form-label">Rol<span
									class="asterix">*</span></label>
								<form:select path="authority" cssClass="form-control">
									<form:option value="" label="Seleccionar Permiso" />
									<c:forEach items="${roles}" var="role">
										<form:option value="${role}" label="${role}" />
									</c:forEach>
								</form:select>

								<form:errors path="authority" cssClass="error" />
							</div>

							
							
							<button type="submit" class="btn btn-primary">Validar</button>
						</form:form>
					</fieldset>
				</div>
				<div class="col-lg-8">

					<h1 class="text-center">${titulo}</h1>
					<p class="text-center">${descripcion}</p>
					<table class="table table-striped">
						<tr>
							<th>Columna</th>
							<th>Valor</th>
						</tr>
						<tr>
							<th>Nombre Perfil</th>
							<td>${user.username}</td>
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