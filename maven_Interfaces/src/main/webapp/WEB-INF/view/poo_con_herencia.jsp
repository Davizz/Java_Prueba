<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="/WEB-INF/view/templates/head.jsp"></jsp:include>
</head>
<body>

<h1>${titulo}</h1>
<p>${mensaje}</p>
<p>${coche}</p>
<p>${coche.description}</p>


<p>${camion}</p>
<p>${camion.carga}</p>

</body>
</html>