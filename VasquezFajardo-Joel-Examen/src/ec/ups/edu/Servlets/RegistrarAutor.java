package ec.ups.edu.Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.ups.edu.DAO.AutorDAO;
import ec.ups.edu.DAO.DAOFactory;
import ec.ups.edu.Modelo.Autor;

/**
 * Servlet implementation class RegistrarAutor
 */
@WebServlet("/RegistrarAutor")
public class RegistrarAutor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrarAutor() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		Autor auto = null;
		String url ="";
		url = "/JSPs/RegistrarAutor.jsp";
		
		
		AutorDAO autorDAO = DAOFactory.getFactory().getAutorDAO();
		
		String nombre  = request.getParameter("nombre");
		String nacionalidad  = request.getParameter("nacionalidad");
		
		auto = new  Autor(nombre,nacionalidad);
		autorDAO.create(auto);
		
		
		
		url = "/JSPs/ResgistrarAutor.jsp";
	}

}
