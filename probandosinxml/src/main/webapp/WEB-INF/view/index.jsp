<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="/WEB-INF/view/templates/head.jsp"></jsp:include>

</head>
<body>
<jsp:include page="/WEB-INF/view/templates/nav.jsp"></jsp:include>
<h1>${titulo}</h1>
<p>${descripcion}</p>
<jsp:include page="/WEB-INF/view/templates/footer.jsp">
	<jsp:param value="Campus 2B" name="web"/>
	<jsp:param value="campus2b.com" name="webruta"/>
</jsp:include>
</body>
</html>