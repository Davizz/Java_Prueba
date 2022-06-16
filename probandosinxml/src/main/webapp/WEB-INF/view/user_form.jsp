<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

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
					<h1>${titulo}</h1>
					<p>${descripcion}</p>
				</div>
			</div>
			<div class="row">
				<div class="col-8">
					<form:form action="add" method="POST" modelAttribute="user">

						<div class="mb-3">
							<div class="row">
								<div class="col">
									<form:label path="name" cssClass="form-label">Nombre<span
											class="asterix">*</span>
									</form:label>
								</div>
								<div class="col">
									<form:errors path="name" cssClass="error" />
								</div>
							</div>
							<form:input cssClass="form-control" path="name" />

						</div>


						<div class="mb-3">
							<div class="row">
								<div class="col">
									<form:label path="email" cssClass="form-label">Email<span
											class="asterix">*</span>
									</form:label>
								</div>
								<div class="col">
									<form:errors path="email" cssClass="error" />
								</div>
							</div>
							<form:input cssClass="form-control" path="email" />
						</div>
						<div class="mb-3">
							<div class="row">
								<div class="col">
									<form:label path="password" cssClass="form-label">Contraseña<span
											class="asterix">*</span>
									</form:label>
								</div>
								<div class="col">
									<form:errors path="password" cssClass="error" />
								</div>
								<form:password cssClass="form-control" path="password" />
							</div>
						</div>
						<div class="mb-3">
							<div class="row">
								<div class="col">
									<form:label path="age" cssClass="form-label">Edad</form:label>
								</div>
								<div class="col">
									<form:errors path="age" cssClass="error" />
								</div>
								<form:input cssClass="form-control" path="age" />
							</div>
						</div>
						
						<div class="mb-3">
							<div class="row">
								<div class="col">
									<form:label path="avatar" cssClass="form-label">Avatar</form:label>
								</div>
								<div class="col">
									<form:errors path="avatar" cssClass="error" />
								</div>								
								<input type="file" class="form-control" id="avatar" name="avatar"
      							 accept="image/png, image/jpeg">
							</div>
						</div>

						<input type="submit" class="btn btn-primary" value="Enviar">
					</form:form>
				</div>
				<div class="col-4  row align-items-center">
					<div class="caja_responsive caja_responsive300">
						<img alt="Imagen de PIXABAY" title="Imagen de Pixabay"
							src="${pageContext.request.contextPath}/resources/img/users.png"
							class="img-thumbnail">
					</div>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="/WEB-INF/view/templates/footer.jsp">
		<jsp:param name="web" value="campus2b.com" />
	</jsp:include>


</body>
</html>