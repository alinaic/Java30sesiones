package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.UsuarioDAO;
import daosImpl.UsuarioDAOImpl;

/**
 * Servlet implementation class SerletIndentificacionUsuario
 */
@WebServlet("/ServletIdentificacionUsuario")
public class ServletIdentificacionUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// el metodo service atiende tanto peticiones tipo get como tipo post
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("campoEmail");
		String pass = request.getParameter("campoPass");
		System.out.println("voy a identificar a: " + email + " " + pass);
		UsuarioDAO usuarioDAO = new UsuarioDAOImpl();
		if (usuarioDAO.identificarUsuario(email, pass)) {
			// usuario identificado correctamente
			
			request.getSession().setAttribute("identificado", "ok");
			request.getRequestDispatcher("loginOK.jsp").forward(request, response);
		} else {
			// email y/o pas incorrectos
			request.setAttribute("mensaje", "email y/o pass incorrectos");
			request.getRequestDispatcher("login.jsp").forward(request, response);
			

		}// end else
	}// end service

}// end class
