<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pruebas con HTML</title>
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


					<h1>Título principal</h1>
					<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
						Phasellus id molestie est. Aliquam congue scelerisque dui, non
						porttitor felis dignissim vel. Mauris tincidunt rutrum turpis nec
						maximus. Suspendisse tincidunt semper elit, a elementum metus
						porttitor sed. Fusce vel lectus turpis. Vestibulum vitae pharetra
						velit. Nulla sollicitudin pretium leo nec ornare. In fermentum
						ligula in dignissim congue.</p>
					<br />
					<p>Nullam porttitor odio id arcu condimentum cursus. Proin ac
						placerat ligula. Morbi eget mauris ut leo bibendum ornare. Mauris
						non mauris justo. Fusce sed sem nec nulla eleifend commodo. Cras
						vel hendrerit mauris. Etiam posuere, turpis dapibus fringilla
						mollis, tortor metus hendrerit justo, non blandit nisi neque non
						mi. Integer vitae placerat mauris, in hendrerit lacus. Aliquam
						vitae enim convallis, volutpat felis a, finibus erat. Integer
						tempus in dui nec bibendum. Curabitur cursus pharetra cursus.</p>
					<hr />
					<p>Praesent eget condimentum sem, sit amet euismod diam.
						Praesent lorem tellus, varius pellentesque porttitor et, suscipit
						pellentesque nibh. Phasellus scelerisque nulla non erat
						sollicitudin accumsan. Donec et placerat neque, id faucibus
						ligula. Donec et tortor ac lorem rhoncus euismod. Pellentesque
						pellentesque efficitur massa quis ullamcorper. Phasellus tempus
						felis urna, nec consectetur diam iaculis a. Donec risus mi, dictum
						in dignissim posuere, scelerisque non turpis. Aenean sollicitudin
						justo a velit semper malesuada. Maecenas ut dignissim dolor.
						Praesent aliquet a dolor vitae dignissim. Etiam posuere vulputate
						ligula feugiat maximus. Ut ultricies eget diam vitae malesuada.
						Nulla tempor in quam nec maximus. Pellentesque habitant morbi
						tristique senectus et netus et malesuada fames ac turpis egestas.</p>
					<h2>Título principal de sub-sección</h2>
					<p>Interdum et malesuada fames ac ante ipsum primis in
						faucibus. Ut ut eros ut elit semper consectetur. Fusce efficitur
						leo ipsum, sit amet imperdiet dui finibus vitae. Morbi vel quam
						massa. Ut tempus augue vel orci aliquet placerat. Duis scelerisque
						lorem nisi. Nunc et justo est. Proin sed consequat eros, placerat
						euismod neque. Praesent scelerisque ultrices bibendum. Integer
						ornare sapien non mi gravida, quis tempus metus tempus.</p>
					<h3>Título secundario</h3>
					<p>Mauris non sapien ut quam facilisis suscipit a non orci.
						Suspendisse potenti. Ut auctor vitae mi eget scelerisque. Aenean
						vitae ornare odio, eu consequat nisl. Aliquam lacus orci, posuere
						eu turpis in, cursus mollis nulla. Cras justo urna, ullamcorper id
						metus eu, tempor pretium nulla. Donec et molestie felis, quis
						vestibulum nisl. Integer tellus turpis, dignissim in elit eu,
						vehicula scelerisque orci.</p>
					<h4>Título</h4>
					<p>Mauris non sapien ut quam facilisis suscipit a non orci.
						Suspendisse potenti. Ut auctor vitae mi eget scelerisque. Aenean
						vitae ornare odio, eu consequat nisl. Aliquam lacus orci, posuere
						eu turpis in, cursus mollis nulla. Cras justo urna, ullamcorper id
						metus eu, tempor pretium nulla. Donec et molestie felis, quis
						vestibulum nisl. Integer tellus turpis, dignissim in elit eu,
						vehicula scelerisque orci.</p>
					<h5>Título</h5>
					<p>Mauris non sapien ut quam facilisis suscipit a non orci.
						Suspendisse potenti. Ut auctor vitae mi eget scelerisque. Aenean
						vitae ornare odio, eu consequat nisl. Aliquam lacus orci, posuere
						eu turpis in, cursus mollis nulla. Cras justo urna, ullamcorper id
						metus eu, tempor pretium nulla. Donec et molestie felis, quis
						vestibulum nisl. Integer tellus turpis, dignissim in elit eu,
						vehicula scelerisque orci.</p>
					<h6>Título</h6>
					<p>Mauris non sapien ut quam facilisis suscipit a non orci.
						Suspendisse potenti. Ut auctor vitae mi eget scelerisque. Aenean
						vitae ornare odio, eu consequat nisl. Aliquam lacus orci, posuere
						eu turpis in, cursus mollis nulla. Cras justo urna, ullamcorper id
						metus eu, tempor pretium nulla. Donec et molestie felis, quis
						vestibulum nisl. Integer tellus turpis, dignissim in elit eu,
						vehicula scelerisque orci.</p>



					<div>
						<img alt="Mi logo"
							src="${pageContext.request.contextPath}/resources/img/logo_n.png"
							height="100">
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