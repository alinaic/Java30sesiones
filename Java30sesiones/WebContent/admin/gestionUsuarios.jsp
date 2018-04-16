

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
<c:forEach items="${usuario}" var="usuario">
<div style="margin:8px">
nombre:${usuario.nombre}<br/>
pass: ${usuario.pass}<br/>
poblacion:${usuario.poblacion}<br/>
email:${usuario.email}<br/>

<a href="ServletBorrarUsuario?id=${usuario.id}">BORRAR</a>

</div>




</c:forEach>



</body>
</html>