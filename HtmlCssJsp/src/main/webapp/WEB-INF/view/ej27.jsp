<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ejercicio 27</title>
<link
	href="${pageContext.request.contextPath}/resources/css/bootstrap.css"
	rel="stylesheet" type="text/css" />
<link rel="icon" type="image/x-icon"
	href="${pageContext.request.contextPath}/resources/img/favicon.ico" />



<link href="${pageContext.request.contextPath}/resources/css/ej27.css"
	rel="stylesheet" type="text/css" />

</head>
<body class="d-flex flex-column h-100 text-center">

	<jsp:include page="/WEB-INF/view/templates/nav.jsp"></jsp:include>
	<div class="flex-shrink-0">
		<div class="container">
			<div class="row">
				<div class="col-12">
					<h1>HTML &amp; CSS: Curso pr�ctico avanzado</h1>

					<h2>Datos del libro</h2>

					<ul>
						<li><span class="verde">T�tulo:</span> HTML &amp; CSS: Curso
							pr�ctico avanzado</li>
						<li><span class="verde">Autor:</span> Sergio Luj�n Mora</li>
						<li><span class="verde">Editorial:</span> Publicaciones
							Altaria</li>
						<li><span class="verde">A�o de publicaci�n:</span> 2015</li>
						<li><span class="verde">ISBN:</span> 978-84-944049-4-8</li>
					</ul>


					<h2>Descripci�n del libro</h2>

					<p>
						Aunque los inicios de <strong>Internet</strong> se remontan a los
						a�os sesenta, no ha sido hasta los a�os noventa cuando, gracias a
						la <strong>Web</strong>, se ha extendido su uso por todo el mundo.
						En pocos a�os, la <strong>Web</strong> ha evolucionado
						enormemente: se ha pasado de p�ginas sencillas, con pocas im�genes
						y contenidos est�ticos que eran visitadas por unos pocos usuarios
						a p�ginas complejas, con contenidos din�micos que provienen de
						bases de datos y que son visitadas por miles de usuarios al mismo
						tiempo.
					</p>

					<p>
						Todas las p�ginas est�n internamente construidas con la misma
						tecnolog�a, con el Lenguaje de marcas de hipertexto (<em>Hypertext
							Markup Language, HTML</em>) y con las Hojas de estilo en cascada (<em>Cascading
							Style Sheets, CSS</em>).
					</p>

					<p>
						Este libro es adecuado para cualquiera que tenga inter�s en
						aprender a desarrollar sus propias p�ginas web. No son necesarios
						conocimientos previos para aprender con este libro, lo �nico que
						es necesario es saber utilizar un ordenador y saber navegar por la
						<strong>Web</strong>.
					</p>


					<h2>Contenido del libro</h2>

					<p>El contenido de este libro se estructura en tres apartados
						bien diferenciados:</p>

					<ul>
						<li>En la primera parte del libro se trabajan conceptos
							generales que son necesarios para poder desarrollar p�ginas web;
							se explican conceptos de estructura f�sica y estructura l�gica (o
							estructura de navegaci�n) de un sitio web. Se detalla c�mo
							influye la estructura f�sica en las <em>URL</em> o direcciones
							que se emplean a la hora de crear los enlaces de un sitio web.
							Pasando por el concepto de "est�ndar web", un t�rmino general que
							se emplea para refererirse a los est�ndares que define su
							funcionamiento como <em>HTML</em> y <em>CSS</em>, empleados para
							el desarrollo de las p�ginas web en el lado del cliente.
						</li>

						<li>En la segunda parte se trabaja <em>HTML</em>. Partiendo
							de la estructura b�sica de una p�gina web, se explican las
							etiquetas de <em>HTML</em> que se utilizan para definir el texto,
							los enlaces, las listas, las tablas, los formularios y los
							elementos multimedia.
						</li>

						<li>En la tercera y �ltima parte se explica <em>CSS</em>, el
							lenguaje que se emplea para definir el formato y la presentaci�n
							de una p�gina web. Se explica c�mo utilizar el color, c�mo
							definir la presentaci�n del texto, de las tablas y de los
							formularios; c�mo realizar transformaciones y transiciones con el
							fin de dise�ar una p�gina web.
						</li>
					</ul>
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