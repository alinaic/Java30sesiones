<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<a href="index.jsp">volver a inicio</a>
	<br /> Registra tu usuario:
	<br />
	<form action="ServletRegistroUsuario" method="post">
		nombre: <input type="text" name="campoNombre" /><br /> 
		pass: <input
			type="text" name="campoPass" /><br /> 
		poblacion: <input
			type="text" name="campoPoblacion" /><br /> 
		email: <input type="text" name="campoEmail" /><br /> 
	
		<br /> <input type="submit" value="ACEPTAR" /><br />
		<br />
	</form>


</body>
</html>