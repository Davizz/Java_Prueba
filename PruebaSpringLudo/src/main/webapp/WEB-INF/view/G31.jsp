Tarea G31
Trabajo de investigación con elementos de interactividad. 
En grupo de 2, tenéis que investigar la forma de dar de alta 
un formulario en el controlador y el fichero de tratamiento de 
datos con el que va conectado y, a continuación, utilizar el 
conjunto de elementos HTML (con JSP tags) que existen para que 
el usuario pueda ingresar datos y a al enviarlo que estén leídos 
y entendibles. 
Los elementos de formulario que podemos tratar son:  
Input (password, email, cadena, imagen…), 
Caja de selección (checkbox),
Zona de texto (textarea), 
Casilla de opción (radio), 
Botón de reset, 
…


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="G31_Saludo" method="post">
	
		<p style="color: blue">Marca</p> <input type="text" name="marca" /> <br /> 
		<p style="color: red">Modelo</p> 	<input type="text" name="modelo" /> <br /> 
		<p>
		<input type="submit" />

	</form>
	
	

</body>
</html>