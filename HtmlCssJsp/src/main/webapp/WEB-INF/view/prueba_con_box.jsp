<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Probando los estilos CSS de tipo box</title>

<link
	href="${pageContext.request.contextPath}/resources/css/bootstrap.css"
	rel="stylesheet" type="text/css" />
<link rel="icon" type="image/x-icon"
	href="${pageContext.request.contextPath}/resources/img/favicon.ico" />

<link href="${pageContext.request.contextPath}/resources/css/css.css"
	rel="stylesheet" type="text/css" />
</head>
<body class="d-flex flex-column h-100 text-center">
	<jsp:include page="/WEB-INF/view/templates/nav.jsp"></jsp:include>
	<div class="box">
		<div class="item_peq item70">
			<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
				Pellentesque dictum euismod felis, rutrum aliquet mi auctor ut.
				Mauris viverra est non felis pulvinar, vitae mollis nulla laoreet.
				Interdum et malesuada fames ac ante ipsum primis in faucibus. Nullam
				blandit placerat dapibus.</p>
		</div>

		<div class="item_peq item5">
			<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
				Pellentesque dictum euismod felis, rutrum aliquet mi auctor ut.
				Mauris viverra est non felis pulvinar, vitae mollis nulla laoreet.
				Interdum et malesuada fames ac ante ipsum primis in faucibus. Nullam
				blandit placerat dapibus.</p>
		</div>
	</div>
	<div>
		<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
			Pellentesque dictum euismod felis, rutrum aliquet mi auctor ut.
			Mauris viverra est non felis pulvinar, vitae mollis nulla laoreet.
			Interdum et malesuada fames ac ante ipsum primis in faucibus. Nullam
			blandit placerat dapibus.</p>
	</div>

	<div>
		<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
			Pellentesque dictum euismod felis, rutrum aliquet mi auctor ut.
			Mauris viverra est non felis pulvinar, vitae mollis nulla laoreet.
			Interdum et malesuada fames ac ante ipsum primis in faucibus. Nullam
			blandit placerat dapibus.</p>
	</div>

	<jsp:include page="/WEB-INF/view/templates/footer.jsp">
		<jsp:param name="web" value="campus2b.com" />
	</jsp:include>


	<script
		src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>



</body>
</html>