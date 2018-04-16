<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
if(session.getAttribute("identificado")==null){
	request.getRequestDispatcher("login.jsp").forward(request, response);
}


%>

	<a href="index.jsp">volver a inicio</a>
	<br /> Introduce los datos de tu anuncio:
	<br />
	<form action="ServletRegistroAnuncio" method="post">
		titulo: <input type="text" name="campoTitulo" /><br /> 
		precio: <input
			type="text" name="campoPrecio" /><br /> 
		telefono: <input
			type="text" name="campoTelefono" /><br /> 
		email: <input type="text" name="campoEmail" /><br /> 
		descripcion: <br />
		<textarea rows="3" cols="20" name="campoDescripcion"></textarea>
		<br /> <input type="submit" value="ACEPTAR" /><br />
		<br />
	</form>


</body>
</html>