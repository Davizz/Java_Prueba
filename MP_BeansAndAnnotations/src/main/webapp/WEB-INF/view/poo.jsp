<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${titulo}</title>
<link
	href="${pageContext.request.contextPath}/resources/css/bootstrap.css"
	rel="stylesheet" type="text/css" />
</head>
<body>
	<jsp:include page="/WEB-INF/view/templates/nav.jsp"></jsp:include>
	<div class="container">
		<div class="row">
			<h1 class="text-center">${titulo}</h1>
			<p class="text-center">${mensaje}</p>
			<div class="card col-4">
				<div class="card-body">
					<c:if test="${valid_poo == 'ok'}">
						<h5 class="card-title">${coche}</h5>
						<p class="card-text">${coche.descripcion}</p>
						<a href="poo_con_herencia" class="btn btn-primary">Siguiente</a>
					</c:if>
				</div>
			</div>
			<div class="card col-4">
				<div class="card-body">
					<c:if test="${valid_poo_herencia == 'ok'}">
						<h5 class="card-title">Probando con herencia</h5>
						<p class="card-text">${pascal}</p>
						<p class="card-text">${eric}</p>
						<a href="poo_con_interfaces" class="btn btn-primary">Siguiente</a>

					</c:if>
				</div>
			</div>
			<div class="card col-4">
				<div class="card-body">
					<c:if test="${valid_poo_interfaces == 'ok'}">
						<p class="card-text">${annie}</p>
						<p class="card-text">${michel}</p>
						<a href="poo_con_anotaciones" class="btn btn-primary">Siguiente</a>

					</c:if>
				</div>
			</div>
			<div class="card col-12">
				<div class="card-body">
					<c:if test="${valid_poo_anotaciones == 'ok'}">
						<h5 class="card-title">Probando con las anotaciones</h5>
						<p class="card-text">${telefono}</p>
						<a href="poo" class="btn btn-primary">Volver</a>

					</c:if>
				</div>
			</div>
			<%-- __Fase_027__--> CONTROLLER  --%>
			<div class="card col-12">
				<div class="card-body">
					<c:if test="${valid_poo_anotaciones_2 == 'ok'}">
						<h5 class="card-title">Acceder a datos de interfaz</h5>
						<p class="card-text">${aventuras1}</p>
						<a href="poo" class="btn btn-primary">Volver</a>
						<table class="table">
							<thead>
								<tr>
									<th scope="col">Tipo ventas</th>
									<th scope="col">Ventas totales</th>
									<th scope="col">Ganancias totales</th>
									<th scope="col">IVA aplicado</th>

								</tr>
							</thead>
							<tbody>
								<tr>
									<td>${aventuras1.getEstadisticas().getTipoVentas()}</td>
									<td>${aventuras1.getEstadisticas().getVentasTotales()}</td>
									<td>${aventuras1.getEstadisticas().getGananciasTotales()}</td>
									<td>${aventuras1.getEstadisticas().getIva()}</td>

								</tr>

							</tbody>
						</table>
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