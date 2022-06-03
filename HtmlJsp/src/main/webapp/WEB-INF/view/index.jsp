<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Página principal</title>
<link
	href="${pageContext.request.contextPath}/resources/css/bootstrap.css"
	rel="stylesheet" type="text/css" />
<link rel="icon" type="image/x-icon"
	href="${pageContext.request.contextPath}/resources/img/favicon.ico" />
</head>
<body class="d-flex flex-column h-100 text-center">
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container-fluid">
			<a class="navbar-brand" href="index">Biblioteca</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="index">Portada</a></li>
					<li class="nav-item"><a class="nav-link" aria-current="page"
						href="contacto">Contacto</a></li>
					<li class="nav-item"><a class="nav-link" aria-current="page"
						href="html">Html</a></li>


				</ul>

			</div>
		</div>
	</nav>
	<div class="flex-shrink-0">
		<div class="container">
			<div class="row">
				<div class="col-12">
					<h1>Esto es mi página principal</h1>
					<p>Esto es una prueba que muestra que la conexión se ha
						realizado correctamente</p>
					<%-- pageContext.request.contextPath es la ruta del proyecto --%>
					<div>
						<img alt="Mi logo"
							src="${pageContext.request.contextPath}/resources/img/logo_n.png"
							height="100">
					</div>
					<p>
						Voy a poner un <a href="primer_formulario"
							title="probando el form">enlace ahí</a> para probar a cambiar de
						página
					</p>
				</div>
			</div>
		</div>
	</div>

	<script
		src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>

</body>
</html>