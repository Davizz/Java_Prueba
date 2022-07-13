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
					<%--https://www.baeldung.com/spring-security-taglibs--%>
					<p class="text-center">
						Usuario:
						<security:authentication property="principal.username" />
						<br /> Rol:
						<security:authentication property="principal.authorities" />
					</p>
					<%--<security:authorize url="/admin">--%>
					<security:authorize access="hasRole('ADMIN')">
						<h1>PARTE RESERVADA A LOS ADMINISTRADORES</h1>
						<p>
							Solo los administradores pueden acceder a esta parte concreta de
							la página web. Contiene secretos que no podemos revelar a
							cualquiera... ;) <a
								href="${pageContext.request.contextPath}/admin"
								title="Acceder al contenido secreto">Enlace secreto</a>
						</p>
					</security:authorize>

				</div>
			</div>
		</div>
	</div>
	<jsp:include page="/WEB-INF/view/templates/footer.jsp">
		<jsp:param name="web" value="campus2b.com" />
	</jsp:include>
</body>
</html>