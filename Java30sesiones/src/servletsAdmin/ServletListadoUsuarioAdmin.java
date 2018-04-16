package servletsAdmin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.AnunciosDAO;
import daos.UsuarioDAO;
import daosImpl.AnunciosDAOImpl;
import daosImpl.UsuarioDAOImpl;

@WebServlet("/admin/ServletListadoUsuarioAdmin")
public class ServletListadoUsuarioAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("obtener usuarios para gestionarlos en administracion");
		
		UsuarioDAO usuarioDAO = new UsuarioDAOImpl();
		request.setAttribute("usuario", usuarioDAO.obtenerUsuario());
		request.getRequestDispatcher("gestionUsuarios.jsp").forward(request, response);
		
		
		
		
	}//end service

}//end class
