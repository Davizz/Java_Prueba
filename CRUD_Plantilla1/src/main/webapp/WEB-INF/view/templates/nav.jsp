<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="container">
	<header class="d-flex justify-content-center py-3">
		<ul class="nav nav-pills">
			<c:choose>
				<c:when test="${menu == 'index'}">
					<li class="nav-item"><a href="/crud_con_relaciones/index"
						class="nav-link active" aria-current="page">Portada</a></li>
				</c:when>
				<c:otherwise>
					<li class="nav-item"><a href="/crud_con_relaciones/index"
						class="nav-link" aria-current="page">Portada</a></li>
				</c:otherwise>
			</c:choose>

			<c:choose>
				<c:when test="${menu == 'contacto'}">
					<li class="nav-item"><a href="/crud_con_relaciones/contacto"
						class="nav-link active" aria-current="page">Contacto</a></li>
				</c:when>
				<c:otherwise>
					<li class="nav-item"><a href="/crud_con_relaciones/contacto"
						class="nav-link">Contacto</a></li>
				</c:otherwise>
			</c:choose>
			<%-- __Fase_028__--> NAVBAR  --%>
			<c:choose>
				<c:when test="${menu == 'lista_usuarios'}">
					<li class="nav-item"><a href="/crud_con_relaciones/user/list"
						class="nav-link active">Gestionar usuarios</a></li>
				</c:when>
				<c:otherwise>
					<li class="nav-item"><a href="/crud_con_relaciones/user/list"
						class="nav-link">Gestionar usuarios</a></li>
				</c:otherwise>
			</c:choose>

<c:choose>
				<c:when test="${menu == 'lista_libros'}">
					<li class="nav-item"><a href="/crud_con_relaciones/book/list"
				class="nav-link active">Gestionar libros</a></li>
				</c:when>
				<c:otherwise>
			<li class="nav-item"><a href="/crud_con_relaciones/book/list"
				class="nav-link">Gestionar libros</a></li>
				</c:otherwise>
			</c:choose>


		</ul>
	</header>
</div>

