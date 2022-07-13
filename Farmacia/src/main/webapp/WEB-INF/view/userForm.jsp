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
				<div class="col-5">
					<fieldset>
						<legend>${titulo}</legend>
						<p>${descripcion}</p>
						<form:form action="save" method="post" modelAttribute="user">
							<div class="mb-3">
								<form:label path="name" cssClass="form-label">Nombre</form:label>
								<form:input path="name" cssClass="form-control" />
								<form:errors path="name" cssClass="error" />
								<form:hidden path="id" />
							</div>
							<div class="mb-3">
								<form:label path="email" cssClass="form-label">Email</form:label>
								<form:input path="email" cssClass="form-control" />
								<form:errors path="email" cssClass="error" />
								<c:if test="${existe == true }">
									<p>
										El mail ya existe
										<a href="/form_book_category/user/list">Intentarlo de nuevo</a><br>									
									</p>
								</c:if>
							</div>
							<button type="submit" class="btn btn-primary">Validar</button>
						</form:form>
					</fieldset>
				</div>
				<div class="col-7">
					<fieldset>
						<legend>Lista de usuarios</legend>
						<table class="table table-striped">
							<tr>
								<th>Nombre</th>
								<th>Email</th>
								<th colspan="3">Acciones</th>								
							</tr>
							<c:if test="${how_many > 0}">
								<c:forEach items="${users}" var="user">
									<c:url var="loan_books" value="loan_books">
										<c:param name="id" value="${user.id}" />
									</c:url>
									<c:url var="delete" value="delete">
										<c:param name="id" value="${user.id}" />
									</c:url>
									<c:url var="edit" value="edit">
										<c:param name="id" value="${user.id}" />
									</c:url>
									<tr>
										<td>${user.name}</td>
										<td>${user.email}</td>
										<td><a href="${loan_books}"
											title="Consultar listado de libros prestados a ${user.name}">
												<button type="submit" class="btn btn-primary btn-sm">Gestionar</button>
										</a></td>
										<td><a href="${edit}"
											title="Actualizar ${user.name}">
												<button type="submit" class="btn btn-success btn-sm">Modificar</button>
										</a></td>
										<td><a href="${delete}"
											title="Borrar ${user.name}">
												<button type="submit" class="btn btn-danger btn-sm"
													onclick="if(!(confirm('¿Seguro que quieres eliminar el registro?'))) return false">Borrar</button>
										</a></td>
									</tr>
								</c:forEach>
							</c:if>
							<c:if test="${how_many == 0}">
								<tr>
									<td colspan="4">La tabla no contiene registros</td>
								</tr>
							</c:if>

						</table>
					</fieldset>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="/WEB-INF/view/templates/footer.jsp">
		<jsp:param name="web" value="campus2b.com" />
	</jsp:include>
</body>
</html>