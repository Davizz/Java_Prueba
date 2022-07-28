<div class="container">
	<header class="d-flex justify-content-center py-3">
		<ul class="nav nav-pills">
			<li class="nav-item"><a href="${pageContext.request.contextPath}/index"
				class="nav-link ${menu == 'index' ? 'active' : ''}"
				aria-current="page">Portada</a></li>
			<li class="nav-item"><a href="${pageContext.request.contextPath}/contacto"
				class="nav-link ${menu == 'contacto' ? 'active' : ''}"
				aria-current="page">Contacto</a></li>
			<li class="nav-item"><a href="${pageContext.request.contextPath}/user/list"
				class="nav-link ${menu == 'lista_usuarios' ? 'active' : ''}">Gestionar
					usuarios</a></li>
			<li class="nav-item"><a href="${pageContext.request.contextPath}/product/list"
				class="nav-link ${menu == 'lista_libros' ? 'active' : ''}">Gestionar
					medicamentos</a></li>
			<li class="nav-item"><a href="${pageContext.request.contextPath}/category/list"
				class="nav-link ${menu == 'lista_categorias' ? 'active' : ''}">Gestionar
					categorías</a></li>
		</ul>
	</header>
</div>

