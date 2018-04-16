<%@page import="modelo.Usuario"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Bienvenido a mi portal de Usuario
	<br />

	<a href="registrarUsuario.jsp">registrar mi Usuario</a>
	<a href="registrarUsuario.jsp">registrarme</a>
	<br /> listado de Usuario:
	<br />
	<%
		List<Usuario> usuario = (List<Usuario>) request
			.getAttribute("usuario");
			for (Usuario a : usuario) {
	%>
	<div style="margin: 10px">
		nombre:<%=a.getNombre()%><br /> pass:<%=a.getPass()%><br />
		poblacion:<%=a.getPoblacion()%><br /> email:<%=a.getEmail()%><br />

	</div>



	<%
		}//end foreach
	%>

</body>
</html>