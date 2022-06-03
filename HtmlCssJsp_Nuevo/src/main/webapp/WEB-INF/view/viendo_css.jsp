<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CSS en C2B</title>


<link
	href="${pageContext.request.contextPath}/resources/css/estilos.css"
	rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/resources/css/css.css"
	rel="stylesheet" type="text/css" />


<link rel="icon" type="image/x-icon"
	href="${pageContext.request.contextPath}/resources/img/favicon.ico" />

<link href="https://fonts.googleapis.com/css?family=Lato|Merriweather"
	rel="stylesheet">
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

	



					<h1 id="borde1">Es mi página CSS</h1>
					<p>Estamos modificando aspectos con CSS</p>
					<img alt="Mi logo" title="Mi logo"
						src="${pageContext.request.contextPath}/resources/img/logo_n.png"
						height="100" class="zindex">

					<div id="lipsum1">
						<p class="marginado" style="font-size: 20px; color: BLACK;">Aquí
							Lorem ipsum dolor sit amet, consectetur adipiscing elit.
							Pellentesque dictum euismod felis, rutrum aliquet mi auctor ut.
							Mauris viverra est non felis pulvinar, vitae mollis nulla
							laoreet. Interdum et malesuada fames ac ante ipsum primis in
							faucibus. Nullam blandit placerat dapibus. Phasellus rhoncus
							ultrices leo, at sagittis nibh sagittis eu. Suspendisse lobortis
							lacus sed interdum sollicitudin. Sed tempus vehicula magna,
							porttitor tristique sem lobortis vitae. Cras blandit laoreet
							purus, eget dignissim metus imperdiet sit amet. Donec odio
							turpis, accumsan ut sollicitudin eu, auctor eget ligula. Maecenas
							ornare lectus a nisi consectetur faucibus. Sed at metus sed felis
							lobortis volutpat tempus in velit. Maecenas vel nibh nunc.
							Interdum et malesuada fames ac ante ipsum primis in faucibus. Sed
							vel faucibus sem. Vivamus ac vulputate magna. Class aptent taciti
							sociosqu ad litora torquent per conubia nostra, per inceptos
							himenaeos.</p>

						<div id="proyecto_img">
							<img alt="Imagen de PIXABAY" title="Imagen de Pixabay"
								src="https://cdn.pixabay.com/photo/2022/05/16/19/14/road-7201023__480.jpg">
						</div>



						<hr class="trait_rojo grand" />
						<p id="parrafo_verde">

							<b>Nunc mauris metusn</b>, <i>malesuada nec nibh gravida</i>,
							lacinia euismod enim. Suspendisse commodo molestie enim, a
							consectetur leo pulvinar congue. Sed non porttitor tellus, eget
							dictum ipsum. Sed sit amet tortor nec nisl posuere ornare. Fusce
							sed ex malesuada, ultricies leo a, finibus metus. Vestibulum
							egestas condimentum tortor consequat bibendum. Aenean aliquet
							lobortis libero, vel pellentesque sem pulvinar id. Nam ut nulla
							id ipsum imperdiet convallis id at nunc. Sed mattis nibh at diam
							ultrices mollis. Proin lobortis sapien condimen style=tum odio
							vehicula, at consequat orci volutpat. In id lorem ac mi facilisis
							volutpat nec et tellus. Etiam posuere malesuada odio vitae
							vulputate. Proin quam nisi, venenatis non dignissim a, varius sit
							amet velit. Ut eleifend volutpat magna vitae porttitor.
						</p>

						<h3>Frutas desordenadas</h3>
						<ul style="list-style-type: circle">
							<li>Naranja</li>
							<li>Fresa</li>
							<li>Manzana</li>
							<li>Pera</li>
						</ul>

						<h3>Frutas ordenadas</h3>
						<ol type="I">
							<li>Fresa</li>
							<li>Manzana</li>
							<li>Naranja</li>
							<li>Pera</li>
						</ol>

						<h3>Lista de definición</h3>
						<dl>
							<dt>Naranja</dt>
							<dd>Fruta de color naranja muy rica</dd>
							<dt>Manzana</dt>
							<dd>Fruta del manzano de varios colores</dd>
							<dt>Fresa</dt>
							<dt>Pera</dt>
						</dl>


						<div>
							<table>
								<tr>
									<th>Empresa</th>
									<th>Contacto</th>
									<th>País</th>
									<th>Teléfono</th>
								</tr>
								<tr>
									<td>ADIDAS</td>
									<td>Mario</td>
									<td>Alemania</td>
									<td>456789789</td>
								</tr>

								<tr>
									<td>C2B</td>
									<td>Marije</td>
									<td>España</td>
									<td>47859632145</td>
								</tr>

								<tr>
									<td>Hiberdrola</td>
									<td>Erick</td>
									<td>Francia</td>
									<td>942478214589</td>
								</tr>

								<tr>
									<td>Juillo</td>
									<td>Marcus</td>
									<td>Portugal</td>
									<td>942456789</td>
								</tr>
							</table>
						</div>


						<p class="parrafos fondo_negro">
							<strong>Maecenas purus purus</strong>, <em>lacinia non
								mollis sit amet</em>, maximus non odio. Etiam laoreet nunc a sem
							viverra efficitur. Class aptent taciti sociosqu ad litora
							torquent per conubia nostra, per inceptos himenaeos. Integer nunc
							ligula, mattis et vulputate ac, lobortis sit amet mauris. Vivamus
							gravida mollis malesuada. Mauris tempor metus dui, a suscipit
							justo sollicitudin et. Quisque porta erat eu fermentum elementum.
							Aliquam ornare quam sed mauris interdum ornare. Cras pulvinar leo
							risus, id faucibus lorem laoreet a. Aliquam at diam hendrerit,
							imperdiet est sed, egestas tellus.
						</p>
					</div>
					<div id="lipsum">

						<p class="parrafos">Duis tempor tellus et fermentum egestas.
							Ut a malesuada tellus. Cras sodales dapibus arcu dapibus mollis.
							Donec posuere nulla sed condimentum auctor. Nam vel tellus arcu.
							Morbi condimentum nunc placerat, fermentum ipsum in, lobortis
							urna. Nullam fringilla urna justo, eget ultrices diam euismod
							non. Etiam a posuere lectus, a ullamcorper ex. Morbi dignissim
							porttitor sagittis. Integer diam nisl, tincidunt et semper ut,
							tincidunt nec urna. Duis pellentesque diam lorem, in dictum
							sapien facilisis quis. Fusce feugiat ac magna quis porttitor.
							Nunc a odio venenatis, dapibus diam eu, dignissim sapien.
							Praesent dignissim egestas est vel ornare.</p>
						<p class="parrafos">Suspendisse varius porttitor nulla, at
							egestas justo lobortis commodo. Curabitur erat nunc, semper quis
							fermentum in, volutpat sit amet odio. In fringilla ante in
							tincidunt blandit. Vestibulum in purus sit amet magna faucibus
							auctor. Nulla gravida sapien venenatis, volutpat ante id, rhoncus
							quam. Proin maximus mi velit, eu tempus leo euismod non. Nulla
							turpis sem, ullamcorper et libero elementum, luctus congue
							ligula. Nulla lacus tortor, tristique sed aliquet at, semper a
							massa. Suspendisse bibendum neque vitae egestas ultricies. Nam
							vestibulum, ipsum a vehicula cursus, lectus enim congue ligula,
							eget tempus magna sem id purus. Cras risus tortor, lacinia at
							quam vel, dictum bibendum turpis. Duis euismod justo et ipsum
							posuere molestie. Vestibulum non convallis libero, ut interdum
							lectus. Praesent placerat erat et maximus luctus. Nullam tempus
							interdum viverra.</p>





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