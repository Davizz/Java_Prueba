<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ejercicio 26 2</title>
<link
	href="${pageContext.request.contextPath}/resources/css/bootstrap.css"
	rel="stylesheet" type="text/css" />
<link rel="icon" type="image/x-icon"
	href="${pageContext.request.contextPath}/resources/img/favicon.ico" />

</head>
<body class="d-flex flex-column h-100 text-center">
	<jsp:include page="/WEB-INF/view/templates/nav.jsp"></jsp:include>

	<div class="flex-shrink-0">
		<div class="container">
			<div class="row">
				<div class="col-12">

				
					<h1>Curriculum Vitae de Bruce Wayne</h1>

					<h2>Datos personales</h2>
					<ul>
						<li>Nombre completo: <strong>Bruce Wayne</strong></li>
						<li>Fecha de nacimiento: <strong>1/5/1939</strong></li>
						<li>Lugar de nacimiento: <strong>Gotham City</strong></li>
					</ul>

					<h2>Formación académica</h2>
					<ul>
						<li>1956-1961: <strong>Universidad del
								Espantapájaros</strong></li>
						<li>1952-1956: <strong>Instituto de Dos Caras</strong></li>
						<li>1944-1952: <strong>Escuela Primaria del Joker</strong></li>
					</ul>

					<h2>Experiencia laboral</h2>
					<ul>
						<li>1975-1985: <strong>En el paro</strong></li>
						<li>1965-1975: <strong>Cazavillanos y demás chusma</strong></li>
						<li>1962-1965: <strong>Aprendiz de superhéroe</strong></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="/WEB-INF/view/templates/footer.jsp">
		<jsp:param name="web" value="campus2b.com" />
	</jsp:include>


	<script
		src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>


</body>
</html>