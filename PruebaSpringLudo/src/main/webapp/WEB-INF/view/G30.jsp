<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!-- Tienes que crear un formulario en un fichero JSP en el que el usuario
ingresa el nombre y el precio de un producto. Al enviar el formulario se
abre una nueva página JSP que imprime en pantalla lo que se ha
transmitido con el formulario. Con este ejercicio no haremos todavía
ninguna comprobación sobre el dato enviado.-->

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>

	<form action="G30_Saludo" method="post">
	
		<p style="color: blue">PRODUCTO</p> <input type="text" name="producto" /> <br /> 
		<p style="color: red">PRECIO</p> 	<input type="text" name="precio" /> <br /> 
		<p>
		<input type="submit" />

	</form>


</body>
</html>