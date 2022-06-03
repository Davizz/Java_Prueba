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
	<jsp:include page="/WEB-INF/view/templates/nav.jsp"></jsp:include>
	<div class="flex-shrink-0">
		<div class="container">
			<div class="row">
				<div class="col-12">

					<div class="container px-4 py-5" id="featured-3">
						<h2 class="pb-2 border-bottom">Columns with icons</h2>
						<div class="mb-3">
							<label for="exampleFormControlInput1" class="form-label">Email
								address</label> <input type="email" class="form-control"
								id="exampleFormControlInput1" placeholder="name@example.com">
						</div>
						<div class="mb-3">
							<label for="exampleFormControlTextarea1" class="form-label">Example
								textarea</label>
							<textarea class="form-control" id="exampleFormControlTextarea1"
								rows="3"></textarea>
						</div>
					</div>
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