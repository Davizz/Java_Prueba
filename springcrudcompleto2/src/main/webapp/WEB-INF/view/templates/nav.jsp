<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="container">
	<header class="d-flex justify-content-center py-3">
		<ul class="nav nav-pills">

					<li class="nav-item"><a href="/springcrudcompleto/index"
						class="nav-link ${menu=='index' ? 'active' : ''}" 
						aria-current="page">Portada</a></li>

 					<li class="nav-item"><a href="/springcrudcompleto/contacto"
						class="nav-link ${menu=='contacto' ? 'active' : ''}" 
						aria-current="page">Contacto</a></li>
						
					<li class="nav-item"><a href="/springcrudcompleto/user/list"
						class="nav-link ${menu=='lista_usuarios' ? 'active' : ''}"
						aria-current="page">Gestionar usuarios</a></li>

					<li class="nav-item"><a href="/springcrudcompleto/book/list"
						class="nav-link ${menu=='lista_libros' ? 'active' : ''}"
						aria-current="page">Gestionar libros</a></li>
						
					<li class="nav-item"><a href="/springcrudcompleto/category/list"
						class="nav-link ${menu=='lista_categorias' ? 'active' : ''}"
						aria-current="page">Gestionar Categorías</a></li>	

		</ul>
	</header>
</div>

