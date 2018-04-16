package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletLogOut
 */
@WebServlet("/ServletLogOut")
public class ServletLogOut extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// vaciar la sesion:
		request.getSession().invalidate();
		request.getRequestDispatcher("logOutOK.JSP").forward(request, response);
	}

}
