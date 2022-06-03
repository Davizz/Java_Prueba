<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Página de contacto</title>
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
							<li class="nav-item"><a class="nav-link"
						aria-current="page" href="contacto">Contacto</a></li>	
						<li class="nav-item"><a class="nav-link"
						aria-current="page" href="html">Html</a></li>					
				</ul>
				
			</div>
		</div>
	</nav>
	<div class="flex-shrink-0">
		<div class="container">
			<div class="row">
				<div class="col-12">
					<h1>Página de contacto</h1>
					<p>Página de contacto desde dónde puedes llamarme</p>
				</div>
			</div>
		</div>
	</div>
	<script
		src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
	
</body>
</html>