<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<!--  Defino el idioma -->
<html lang="es-ES">


<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>

<!--  Creo un icono en página -->

<link rel="icon" type="image/x-icon"
	href="${pageContext.request.contextPath}/resources/img/favicon.ico" />
	
	
<style type="text/css">
table, th, td {
border: 1px solid-black;
border-collapse: collapse;
}

td, th {

background-color: blue;
}


</style>


</head>


<body>

	<h1>Esta es mi página HTML</h1>


	<div id="lipsum">
		<p style="font-size: 20px">Lorem ipsum dolor sit amet, consectetur
			adipiscing elit. Integer varius nisl quis sodales dignissim.
			Phasellus odio ex, volutpat in velit ac, dapibus facilisis lacus.
			Suspendisse hendrerit turpis dolor, vitae vehicula nibh vestibulum
			nec. Suspendisse massa metus, pharetra quis rhoncus quis, elementum
			eu ligula. Suspendisse potenti. Morbi eget purus sit amet tellus
			mollis tincidunt ac fringilla nulla. Donec tempus auctor odio, sed
			tempus dui egestas eget. Aenean eget diam est. Integer gravida leo
			nulla, vitae condimentum nisi eleifend ut. Donec ex justo,
			condimentum ac convallis mattis, efficitur quis mi. Aenean convallis
			nibh vel erat vehicula, at finibus lectus consectetur. Aenean quis
			tellus nec nisl tempus venenatis et ac turpis. Maecenas ac est non
			orci vehicula eleifend. Sed ultrices eu erat at varius.</p>

		<img alt="Mi logo" title="Mi logo"
			src="https://phantom-marca.unidadeditorial.es/0fa9e4b2433f7eada8f97d2374e54f48/resize/1320/f/jpg/assets/multimedia/imagenes/2022/05/05/16517455111875.jpg"
			height="150" />


		<p>In eu ex hendrerit, egestas lacus ac, varius mauris. Praesent
			tincidunt, lectus vitae laoreet facilisis, arcu quam tempor nisl, ac
			rutrum ligula magna at ex. In vitae tincidunt nisl. Nam egestas
			commodo nisl nec pulvinar. Cras dapibus ultrices neque non malesuada.
			Fusce sed finibus augue, ut egestas eros. Donec malesuada orci a
			magna scelerisque dapibus. Cras non metus ut libero aliquam eleifend.
		</p>
		
		<img alt="Mi logo" title="Mi logo"
			src="${pageContext.request.contextPath}/resources/img/logo_n.png"
			width="200" height="100" />

		<p>
			Aliquam <b>erat volutpat.</b> Nam tempus non <i>odio vel
				suscipit. Phasellus</i> sollicitudin convallis lorem, sed semper mauris
			vulputate vitae. Fusce placerat leo lectus, et facilisis elit
			hendrerit vel. Fusce eu sem porta, sollicitudin libero nec, tempus
			odio. Etiam sollicitudin, tellus et condimentum mollis, mauris augue
			pretium odio, a mattis ipsum enim egestas ligula. Maecenas libero
			nisl, tempus sed interdum non, accumsan ut metus. Integer porttitor
			metus dolor. Ut viverra nulla semper justo efficitur fringilla.
			Praesent fringilla libero in imperdiet egestas. Nunc at eleifend
			tortor, nec facilisis nulla. Cras vitae blandit justo. Duis congue
			velit tellus, sed accumsan urna faucibus et. Praesent facilisis nisl
			neque, vel varius nisl molestie ac. Interdum et malesuada fames ac
			ante ipsum primis in faucibus.
		</p>
		
			<%--  Comentario JSP --%>
		<!--  Creo una tabla de 3 tr -->
		
		<div>
		
		<table style = "border: 2px solid black">
		
		<tr>
		<th>Título 1</th>
		<th>Título 2</th>
		<th>Título 3</th>
		</tr>
		
		<tr>
		<td>Telefonica</td>
		<td>Jose</td>
		<td>687</td>
		</tr>
		
		
		<tr>
		<td>Mercedes</td>
		<td>Ana</td>
		<td>589</td>
		</tr>
		
		
		
		</table>
		
		</div>
		
		<p>
			Pellentesque <strong>posuere turpis sit</strong> amet tellus porta, <em>id
				porttitor eros</em> facilisis. Vivamus id mi metus. Morbi vel libero quis
			lacus condimentum auctor non et purus. Quisque interdum a sapien vel
			fermentum. Proin convallis eros vitae lacus facilisis, eu interdum
			nisl faucibus. Fusce quis diam egestas, convallis ligula ut, feugiat
			sem. Ut ullamcorper porttitor ex quis molestie.
		</p>
		
		<!--  Crear una lista desordenada -->
		
		<h3>Frutas</h3>
		<ul style ="list-style-type: disc">
		<li>Naranja</li>
		<li>Manzana</li>
		<li>Pera</li>
		<li>Uva</li>		
		
		</ul>
		
		<!--  Crear una lista ordenada -->
		
		<h3>Frutas</h3>
		<ol style ="list-style-type: circle">
		<li>Naranja</li>
		<li>Manzana</li>
		<li>Pera</li>
		<li>Uva</li>		
		
		</ol>
		
		
		<h3>Lista de definición</h3>
		
		<dl>
		<dt>Naranja</dt>
		<dd>Muy rica</dd>
		<dt>Fresa</dt>
		<dd>Muy dulce</dd>
		</dl>
		
		
		<p>Donec vehicula hendrerit efficitur. Nulla facilisi. Sed non
			arcu sit amet justo accumsan condimentum eget id nisl. Vestibulum nec
			turpis risus. In eu maximus mauris. Vivamus nec arcu orci. Maecenas
			sit amet lectus porttitor urna cursus pellentesque id ac massa.</p>
	</div>



</body>
</html>