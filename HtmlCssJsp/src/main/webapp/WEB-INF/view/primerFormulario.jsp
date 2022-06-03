<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Primer Formulario</title>

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
					<form action="procesar_primer_formulario" method="post">
						Nombre: <input type="text" name="miNombre"> <input type="submit">
					</form>

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