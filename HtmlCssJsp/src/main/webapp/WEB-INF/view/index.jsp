<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>P�gina principal</title>
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
					<h1>Esto es mi p�gina principal</h1>
					<p>Esto es una prueba que muestra que la conexi�n se ha
						realizado correctamente</p>
					<%-- pageContext.request.contextPath es la ruta del proyecto --%>
					<div>
						<img alt="Mi logo"
							src="${pageContext.request.contextPath}/resources/img/logo_n.png"
							height="100">
					</div>
					<p>
						Voy a poner un <a href="primer_formulario"
							title="probando el form">enlace ah�</a> para probar a cambiar de
						p�gina
					</p>
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