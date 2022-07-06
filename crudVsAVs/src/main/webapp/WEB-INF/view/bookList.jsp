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
				<div class="col-lg-4">
					<fieldset>
						<legend>${titulo}</legend>
						<p>${descripcion}</p>
						<form:form action="save" method="post" modelAttribute="book">
							<div class="mb-3">
								<form:label path="title" cssClass="form-label">T�tulo</form:label>
								<form:input path="title" cssClass="form-control" />
								<form:errors path="title" cssClass="error" />
								<form:hidden path="id" />
								<form:hidden path="bookDetails.id" />
							</div>
							<div class="mb-3">
								<form:label path="author" cssClass="form-label">Autor</form:label>
								<form:input path="author" cssClass="form-control" />
								<form:errors path="author" cssClass="error" />
							</div>

							<div class="mb-3">
								<form:label path="category" cssClass="form-label">Categor�a</form:label>
								<form:select path="category" cssClass="form-control">

									<form:option value="" label="Seleccionar categor�a" />
									<c:forEach var="cat" items="${categories}">
										<c:if
											test="${cat.category_name == book.category.category_name}">
											<form:option value="${cat.category_name}"
												label="${cat.category_name}" selected="selected" />
										</c:if>
										<c:if
											test="${cat.category_name != book.category.category_name}">
											<form:option value="${cat.category_name}"
												label="${cat.category_name}" />
										</c:if>
									</c:forEach>

								</form:select>
								<form:errors path="category" cssClass="error" />
							</div>

							<div class="mb-3">
								<form:label path="bookDetails.publication_year"
									cssClass="form-label">A�o de publicaci�n</form:label>
								<form:input path="bookDetails.publication_year"
									cssClass="form-control" />
								<form:errors path="bookDetails.publication_year"
									cssClass="error" />
							</div>

							<div class="mb-3">
								<form:label path="bookDetails.purchase_year"
									cssClass="form-label">A�o de adquisici�n</form:label>
								<form:input path="bookDetails.purchase_year"
									cssClass="form-control" />
								<form:errors path="bookDetails.purchase_year" cssClass="error" />
							</div>

							<div class="mb-3">
								<form:label path="bookDetails.page_number" cssClass="form-label">N�mero de p�ginas</form:label>
								<form:input path="bookDetails.page_number"
									cssClass="form-control" />
								<form:errors path="bookDetails.page_number" cssClass="error" />
							</div>
							<button type="submit" class="btn btn-primary">Validar</button>
						</form:form>
					</fieldset>
				</div>
				<div class="col-lg-8">

					<fieldset>
						<legend>Lista de libros</legend>
						<table class="table table-striped">
							<tr>
								<th width="30%">T�tulo</th>
								<th width="15%">Autor</th>
								<th width="15%">Categor�a</th>
								<th width="10%">Publicado</th>
								<th width="10%">Comprado</th>
								<th width="10%">P�ginas</th>
								<th width="5%">Actualizar</th>
								<th width="5%">Borrar</th>

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
										<td>${book.category.category_name}</td>
										<td>${book.bookDetails.publication_year}</td>
										<td>${book.bookDetails.purchase_year}</td>
										<td>${book.bookDetails.page_number}</td>

										<td><a href="${edit}"
											title="Actualizar ${book.title} con id ${book.id}">
												<button type="submit" class="btn btn-success">M</button>
										</a></td>
										<td><a href="${delete}"
											title="Borrar ${book.title} con id ${book.id}">
												<button type="submit" class="btn btn-danger"
													onclick="if(!(confirm('�Seguro que quieres eliminar el registro?'))) return false">X</button>
										</a></td>
									</tr>
								</c:forEach>
							</c:if>
							<c:if test="${how_many == 0}">
								<tr>
									<td colspan="8">La tabla no contiene registros</td>
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