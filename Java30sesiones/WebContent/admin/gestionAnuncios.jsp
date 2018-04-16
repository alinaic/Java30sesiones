

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="menu.jsp"></jsp:include>
<c:forEach items="${anuncios}" var="anuncio">
<div style="margin:8px">
titulo:${anuncio.titulo}<br/>
precio: ${anuncio.precio}<br/>
telefono:${anuncio.telefono}<br/>
email:${anuncio.email}<br/>
descripcion: ${anuncio.descripcion}<br/>
<a href="ServletBorrarAnuncio?id=${anuncio.id}">BORRAR</a>

</div>




</c:forEach>



</body>
</html>