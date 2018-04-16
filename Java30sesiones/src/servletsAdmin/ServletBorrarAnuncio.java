package servletsAdmin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.AnunciosDAO;
import daosImpl.AnunciosDAOImpl;


@WebServlet("/admin/ServletBorrarAnuncio")
public class ServletBorrarAnuncio extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println("borrar anuncio de id: " + id);
		
		AnunciosDAO anunciosDAO = new AnunciosDAOImpl();
		anunciosDAO.borrarAnuncio(id);
		
		request.getRequestDispatcher("gestionAnuncios.jsp").forward(request, response);
		
	}

}
