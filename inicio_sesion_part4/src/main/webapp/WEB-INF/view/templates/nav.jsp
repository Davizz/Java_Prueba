<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<nav class="navbar navbar-expand-lg bg-light">
	<div class="container-fluid">
		<a class="navbar-brand" href="#">Java Spring</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarText" aria-controls="navbarText"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarText">
			<ul class="navbar-nav me-auto mb-2 mb-lg-0">
				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="${pageContext.request.contextPath}/index">Portada</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="#">Otra
						función</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Tercera
						función</a></li>
			</ul>

			<form:form action="${pageContext.request.contextPath}/logout"
				class="d-flex" method="POST">
				<input type="submit"
					class="btn btn-outline-danger"
					value="Cerrar sesión" />				
			</form:form>


		</div>
	</div>
</nav>

