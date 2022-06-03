<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Acceso al contenido con BEANS</title>

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


					<p>
						Hemos llegado!!!<br /> Aquí pegaré <strong>UNOS</strong> enlaces
						para navegar entre los contenidos
					</p>
					<p>
						<a href="poo" title="Ir a Programación orientada a objetos básica">Programación
							orientada a objetos básica y Beans</a> <br /> <a
							href="poo_con_herencia"
							title="Ir a Programación orientada a objetos con herencia">POO
							con herencia y Beans</a> <br /> <a href="poo_con_interfaces"
							title="Ir a Programación orientada a objetos con herencia">POO
							con interfaces y Beans</a> <br /> <a href="poo_con_anotaciones"
							title="Ir a Programación orientada a objetos usando anotaciones">Programación
							orientada a objetos usando las anotaciones de Spring</a> <br />

					</p>

					<c:if test="${valid_poo == 'ok'}">
						<h1>${coche}</h1>
						<p>${descripcion}</p>
					</c:if>
					<c:if test="${valid_poo_herencia == 'ok'}">
						<h1>POO CON HERENCIA</h1>
						<p>${pascal}</p>
						<p>${eric}</p>
					</c:if>

					<c:if test="${valid_poo_interfaces == 'ok'}">
						<h1>POO CON INTERFACES</h1>
						<h2>con gente de Madrid y de Bilbao</h2>
						<p>${annie}</p>
						<p>${michel}</p>
					</c:if>

					<c:if test="${valid_poo_anotaciones == 'ok'}">
						<h1>POO CON ANOTACIONES</h1>
						<p>${annie}</p>
						<p>${michel}</p>
					</c:if>
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