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
		<div class="container-fluid">
			<div class="row mt-4">
				<div class="col-4">
					<fieldset>
						<legend>${titulo}</legend>
						<p>${descripcion}</p>
						<form:form action="save" method="post" modelAttribute="category">
							<div class="mb-3">
								<form:label path="category_name" cssClass="form-label">Nombre de categorķa</form:label>
								<form:input path="category_name" cssClass="form-control" />
								<form:errors path="category_name" cssClass="error" />
								<form:hidden path="id" />								
							</div>										
							<button type="submit" class="btn btn-primary">Validar</button>
						</form:form>
					</fieldset>
				</div>
				<div class="col-8">

					<fieldset>
						<legend>Lista de categorķas</legend>
						<table class="table table-striped">
							<tr>
								<th>Nombre</th>							
								<th>Actualizar</th>
								<th>Borrar</th>

							</tr>
							<c:if test="${how_many > 0}">
								<c:forEach items="${categories}" var="category">
									<c:url var="delete" value="delete">
										<c:param name="id" value="${category.id}" />
									</c:url>
									<c:url var="edit" value="edit">
										<c:param name="id" value="${category.id}" />
									</c:url>
									<tr>
										<td>${category.category_name}</td>				
										
										
										<td><a href="${edit}"
											title="Actualizar ${category.category_name}">
												<button type="submit" class="btn btn-success">M</button>
										</a></td>
										<td><a href="${delete}"
											title="Borrar ${category.category_name}">
												<button type="submit" class="btn btn-danger"
													onclick="if(!(confirm('æSeguro que quieres eliminar el registro?'))) return false">X</button>
										</a></td>
									</tr>
								</c:forEach>
							</c:if>
							<c:if test="${how_many == 0}">
								<tr>
									<td colspan="3">La tabla no contiene registros</td>
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