package servletsAdmin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.AnunciosDAO;
import daosImpl.AnunciosDAOImpl;

@WebServlet("/admin/ServletListadoAnunciosAdmin")
public class ServletListadoAnunciosAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out
				.println("obtener anuncios para gestionarlos en administracion");
		
		AnunciosDAO anunciosDAO = new AnunciosDAOImpl();
		request.setAttribute("anuncios", anunciosDAO.obtenerAnuncios());
		request.getRequestDispatcher("gestionAnuncios.jsp").forward(request, response);
		
		
		
		
	}//end service

}//end class
