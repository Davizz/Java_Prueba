<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="/WEB-INF/view/templates/head.jsp"></jsp:include> 

</head>
<body class="d-flex flex-column h-100 text-center">
	<jsp:include page="/WEB-INF/view/templates/nav.jsp"></jsp:include>
	<div class="flex-shrink-0">
		<div class="container">
			<div class="row mt-4">
				<div class="col">
					<fieldset>
						<legend>${titulo}</legend>
						<p>${descripcion}</p>
						<form:form action="save" method="post" modelAttribute="user">
							<div class="mb-3">
								<form:label path="name" cssClass="form-label">Nombre</form:label>
								<form:input path="name" cssClass="form-control" />
								<form:errors path="name" cssClass="error" />
								<form:hidden path="id" />
							</div>
							<div class="mb-3">
								<form:label path="email" cssClass="form-label">Email</form:label>
								<form:input path="email" cssClass="form-control" />
								<form:errors path="email" cssClass="error" />
							</div>
							<button type="submit" class="btn btn-primary"><i class="fas fa-address-card"></i> Crear Usuario</button>
						</form:form>
					</fieldset>
				</div>
				<div class="col">
					<fieldset>
						<legend>Lista de usuarios</legend>
						<table class="table table-striped">
							<tr>
								<th>Nombre</th>
								<th>Email</th>
								<th>Actualizar</th>
								<th>Borrar</th>
							</tr>
							<c:if test="${how_many > 0}">
								<c:forEach items="${users}" var="user">
									<c:url var="delete" value="delete">
										<c:param name="id" value="${user.id}" />
									</c:url>
									<c:url var="edit" value="edit">
										<c:param name="id" value="${user.id}" />
									</c:url>
									<tr>
										<td>${user.name}</td>
										<td>${user.email}</td>
										<td><a href="${edit}"
											title="Actualizar ${user.name} con id ${user.id}">
											<button type="submit" class="btn btn-success text-center" onclick="mensajeSweet('¿Seguro que quieres modificar el registro?');"><i class="fas fa-edit"></i></button>  <!-- modificar -->
										</a></td>
										<td><a href="${delete}"
											title="Borrar ${user.name} con id ${user.id}">
												<button type="submit" class="btn btn-danger"
													onclick="mensajeSweet('¿Seguro que quieres eliminar el registro?');"><i class="fas fa-trash"></i></button>  <!-- borrar -->
													<!--onclick="if(!(confirm('¿Seguro que quieres eliminar el registro?'))) return false"><i class="fas fa-trash"></i></button>  borrar -->
										</a></td>
									</tr>
								</c:forEach>
							</c:if>
							<c:if test="${how_many == 0}">
								<tr>
									<td colspan="4">La tabla no contiene registros</td>
								</tr>
							</c:if>

						</table>
					</fieldset>
				</div>
			</div>
		</div>
	</div>
	<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	<jsp:include page="/WEB-INF/view/templates/footer.jsp">
		<jsp:param name="web" value="campus2b.com" />
	</jsp:include>
	
<script type="text/javascript">
function mensajeSweetOK(msj) {
	swal({
	    title: "Are you sure?",
	    text: "Once deleted, you will not be able to recover this imaginary file!",
	    icon: "warning",
	    buttons: true,
	    dangerMode: true,
	 })
	  .then((willDelete) => {
	    if (willDelete) {
	      swal("Poof! Your imaginary file has been deleted!", {
	        icon: "success",
	      });
	    } else {
	      swal("Your imaginary file is safe!");
	    }
	  });
}

function mensajeSweet(msj) {
	Swal.fire({
		  title: msj,
		  showDenyButton: true,
		  showCancelButton: true,
		  confirmButtonText: `SI`,
		  denyButtonText: `NO`,
		}).then((result) => {
		  /* Read more about isConfirmed, isDenied below */

		  if (result.isConfirmed) {
		    Swal.fire('¡Eliminado!', '', 'success');
		  } else if (result.isDenied) {
		    Swal.fire('No ha sido Eliminado', '', 'info');
		    return false;
		  }
		});
		//setTimeout(300000);
		//alert("ha llamado a la funcion con ");
}
	

</script>

</body>
</html>

