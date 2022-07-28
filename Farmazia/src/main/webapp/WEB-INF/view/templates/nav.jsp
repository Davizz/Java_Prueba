<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<nav class="navbar navbar-expand-lg bg-light">
	<div class="container-fluid">
		<a class="navbar-brand" href="#">Java Spring</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav me-auto mb-2 mb-lg-0">
				<li class="nav-item"><a href="/farmazia/index"
					class="nav-link ${menu == 'index' ? 'active' : ''}"
					aria-current="page">Portada</a></li>
				<li class="nav-item"><a href="/farmazia/contacto"
					class="nav-link ${menu == 'contacto' ? 'active' : ''}"
					aria-current="page">Contacto</a></li>
				<li class="nav-item"><a href="/farmazia/user/list"
					class="nav-link ${menu == 'lista_usuarios' ? 'active' : ''}">Gestionar
						usuarios</a></li>
				<li class="nav-item"><a href="/farmazia/book/list"
					class="nav-link ${menu == 'lista_libros' ? 'active' : ''}">Gestionar
						medicamentos</a></li>
				<li class="nav-item"><a href="/farmazia/category/list"
					class="nav-link ${menu == 'lista_categorias' ? 'active' : ''}">Gestionar
						categorías</a></li>


			</ul>
			<form:form action="${pageContext.request.contextPath}/logout" class="d-flex" method="POST">
				<input type="submit" class="btn btn-outline-danger"
					value="Cerrar Sesión" aria-label="Search">
			</form:form>
		</div>
	</div>
</nav>
