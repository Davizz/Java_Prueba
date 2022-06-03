<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ejercicio 26 1</title>
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
					<h1>HTML</h1>

					<p>
						<strong>HTML</strong> son las siglas de <em>HyperText Markup
							Language</em>, que puede traducirse como lenguaje de marcas o marcado
						de hipertexto.
					</p>

					<p>
						El lenguaje <strong>HTML</strong> se emplea para crear las p�ginas
						web. Es muy f�cil ver el c�digo <strong>HTML</strong> de una
						p�gina web, la opci�n exacta cambia de un navegador a otro y
						tambi�n puede cambiar de una versi�n a otra de un mismo navegador,
						pero suelen tener un nombre similar.
					</p>

					<p>
						<strong>HTML</strong> se compone de etiquetas que se escriben
						entre los s�mbolos menor que y mayor que.
					</p>

					<h2>Historia de HTML</h2>

					<p>
						Los inicios del lenguaje <strong>HTML</strong> se remontan al a�o
						1990, cuando <em>Tim Berners-Lee</em> cre� la primera p�gina web.
					</p>

					<h2>Versiones de HTML</h2>

					<p>
						<em>Tim Berners-Lee</em> defini� la primera versi�n de <strong>HTML</strong>
						en el a�o 1991.
					</p>

					<p>
						En la actualidad, la �ltima versi�n de <strong>HTML</strong> es
						HTML5.
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