<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Procesando el primer formulario</title>
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

					<p>Hola Bienvenido ${param.miNombre} al curso de JAVA Spring de
						C2B</p>
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