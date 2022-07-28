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
				<div class="col-6 mx-auto">
					<fieldset>
						<legend>${titulo}</legend>
						<p>${descripcion}</p>
						<form:form action="confirm_loan" method="post"
							modelAttribute="user">
							<div class="mb-3">
								<form:label path="name" cssClass="form-label">Nombre</form:label>
								<form:input disabled="true" path="name" cssClass="form-control" />
								<form:errors path="name" cssClass="error" />
								<form:hidden path="username" />
								<form:hidden path="name" />
								<form:hidden path="email" />
								<form:hidden path="surname" />
								<form:hidden path="password" />
								<form:hidden path="enabled" />
								<form:hidden path="confirmPassword" />
							</div>
							<div class="mb-3">
								<form:label path="email" cssClass="form-label">Email</form:label>
								<form:input disabled="true" path="email" cssClass="form-control" />
								<form:errors path="email" cssClass="error" />

							</div>
							<div class="mb-1">
								<label for="books" class="form-label">Libros prestados</label>

								<form:select path="books" cssClass="form-control"
									multiple="true" items="${booklist}" itemValue="title"
									itemLabel="title" />


								<form:errors path="books" cssClass="error" />
							</div>
							<button type="submit" class="btn btn-primary">Validar</button>
						</form:form>
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