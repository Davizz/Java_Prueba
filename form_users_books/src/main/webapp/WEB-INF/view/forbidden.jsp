<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="/WEB-INF/view/templates/head.jsp"></jsp:include>
</head>
<body class="d-flex flex-column h-100 text-center">
	<jsp:include page="/WEB-INF/view/templates/nav.jsp"></jsp:include>
	<div class="flex-shrink-0">
		<div class="container">
			<div class="row">
				<div class="col-12">
					<h1 class="text-center">${titulo}</h1>
					<p class="text-center">${descripcion}</p>
					<p class="text-center"><security:authorize access="isAuthenticated()">
						Te saludamos querido
						<security:authentication property="principal.username" /></security:authorize>
						Por desgracia, no tienes acceso a todos nuestra secretos de la
						página web.
					<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut
						posuere orci tortor, at ornare est mollis et. Quisque vel rhoncus
						tortor, et vehicula tortor. Maecenas et bibendum arcu. Etiam id
						erat eu felis viverra hendrerit sit amet quis felis. Etiam auctor
						est ut est aliquam feugiat et faucibus leo. Phasellus et magna
						justo. Suspendisse non vehicula leo. Pellentesque sollicitudin
						augue ac sem sollicitudin blandit sit amet in metus.</p>
					<p>Fusce a est at dolor ultrices tempor. Vivamus iaculis
						laoreet turpis, vitae sagittis ante cursus sit amet. Donec non
						elit rhoncus, pretium dui eget, sodales ipsum. Aenean sed placerat
						velit. Nunc ultrices semper lacus vitae pellentesque. Fusce eget
						nulla gravida, hendrerit ipsum ac, vehicula felis. Vivamus in
						placerat nisi. Aenean dignissim enim vel neque euismod posuere.
						Curabitur hendrerit nunc in magna volutpat, et dignissim ex
						sollicitudin.</p>
					<p>Suspendisse sit amet augue pharetra, ultricies odio
						condimentum, rutrum velit. Vivamus id lorem dapibus, sagittis
						velit vitae, mattis elit. Sed id varius leo. Cras convallis ligula
						dictum, pellentesque quam eget, mattis lectus. Nulla maximus
						pretium mi, eget mollis quam tincidunt et. Maecenas sollicitudin
						dolor in ligula efficitur, scelerisque fringilla neque sodales.
						Sed aliquet metus eget lectus iaculis, ut viverra urna pretium. Ut
						sed imperdiet ex.</p>
					<a href="${pageContext.request.contextPath}/index"
						title="Volver al inicio">Inicio</a>


				</div>
			</div>
		</div>
	</div>
	<jsp:include page="/WEB-INF/view/templates/footer.jsp">
		<jsp:param name="web" value="campus2b.com" />
	</jsp:include>
</body>
</html>