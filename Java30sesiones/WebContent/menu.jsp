Bienvenido a mi portal de anuncios&nbsp;
<br />

<%
	if (session.getAttribute("identificado") == null) {
%>
<spam style="color:blue;">
 DEBES IDENTIDIFICARTE PARA REGISTRAR TU ANUNCIO<spam/>
<a href="login.jsp">Identificarme</a>
&nbsp;&nbsp;&nbsp;
<a href="registrarUsuario.jsp">Registrarme</a>
<br />
&nbsp;&nbsp;
<%
	} else {
%>
<a href="registrarAnuncio.jsp">Registrar mi anuncio</a>
&nbsp;&nbsp;&nbsp;
<a href="ServletLogOut">cerrar sesion</a><b/>
&nbsp;&nbsp;&nbsp;

<%
	}
%>




