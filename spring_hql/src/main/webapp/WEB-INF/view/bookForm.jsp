<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
				<div class="col">
					<fieldset>
						<legend>${titulo}</legend>
						<p>${descripcion}</p>
						<form:form action="save" method="post" modelAttribute="book">
							<div class="mb-3">
								<form:label path="title" cssClass="form-label">Título</form:label>
								<form:input path="title" cssClass="form-control" />
								<form:errors path="title" cssClass="error" />
								<form:hidden path="id" />
							</div>
							<div class="mb-3">
								<form:label path="author" cssClass="form-label">Autor</form:label>
								<form:input path="author" cssClass="form-control" />
								<form:errors path="author" cssClass="error" />
							</div>
							<button type="submit" class="btn btn-primary">Validar</button>
						</form:form>
					</fieldset>
				</div>
				<div class="col">

					<fieldset>
						<legend>Lista de libros</legend>
						<table class="table table-striped">
							<tr>
								<th>Título</th>
								<th>Autor</th>
								<th>Actualizar</th>
								<th>Borrar</th>

							</tr>
							<c:if test="${how_many > 0}">
								<c:forEach items="${books}" var="book">
									<c:url var="delete" value="delete">
										<c:param name="id" value="${book.id}" />
									</c:url>
									<c:url var="edit" value="edit">
										<c:param name="id" value="${book.id}" />
									</c:url>
									<tr>
										<td>${book.title}</td>
										<td>${book.author}</td>
										<td><a href="${edit}"
											title="Actualizar ${book.title} con id ${book.id}">
												<button type="submit" class="btn btn-success">Modificar</button>
										</a></td>
										<td><a href="${delete}"
											title="Borrar ${book.title} con id ${book.id}">
												<button type="submit" class="btn btn-danger"
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