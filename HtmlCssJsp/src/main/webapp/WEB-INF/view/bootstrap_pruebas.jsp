<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pruebas con Bootstrap</title>
<link
	href="${pageContext.request.contextPath}/resources/css/bootstrap.css"
	rel="stylesheet" type="text/css" />

<link rel="icon" type="image/x-icon"
	href="${pageContext.request.contextPath}/resources/img/favicon.ico" />
</head>
<body class="d-flex flex-column h-100 text-center">
	<jsp:include page="/WEB-INF/view/templates/nav.jsp"></jsp:include>


	<div class="container">
		<div class="row align-items-start">
			<div class="col-9">
				<img alt="Imagen de PIXABAY" title="Imagen de Pixabay"
					src="https://cdn.pixabay.com/photo/2022/05/16/19/14/road-7201023__480.jpg"
					class="img-thumbnail">
			</div>
			<div class="col-3">One of three columns</div>

		</div>
		<div class="row align-items-center">
			<div class="col">
				<div class="alert alert-primary" role="alert">A simple primary
					alert-check it out!</div>
			</div>
			<div class="col">
				<div class="alert alert-primary" role="alert">A simple primary
					alert-check it out!</div>
			</div>
			<div class="col">
				<div class="alert alert-primary" role="alert">A simple primary
					alert-check it out!</div>
			</div>
		</div>
		<div class="row align-items-end">
			<div class="col-6">
				<table class="table table-dark">
					<thead>
						<tr>
							<th scope="col">#</th>
							<th scope="col">First</th>
							<th scope="col">Last</th>
							<th scope="col">Handle</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<th scope="row">1</th>
							<td>Mark</td>
							<td>Otto</td>
							<td>@mdo</td>
						</tr>
						<tr>
							<th scope="row">2</th>
							<td>Jacob</td>
							<td>Thornton</td>
							<td>@fat</td>
						</tr>
						<tr>
							<th scope="row">3</th>
							<td colspan="2">Larry the Bird</td>
							<td>@twitter</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="col">One of three columns</div>
			<div class="col">One of three columns</div>
		</div>
	</div>



	<div class="container">
		<div class="row">
			<div class="col-9">.col-9</div>
			<div class="col-3">
				.col-3<br>Since 9 + 4 = 13 &gt; 12, this 4-column-wide div gets
				wrapped onto a new line as one contiguous unit.
			</div>
			<div class="col-6">
				.col-6<br>Subsequent columns continue along the new line.
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