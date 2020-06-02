package ec.ups.edu.Servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.ups.edu.DAO.DAOFactory;
import ec.ups.edu.DAO.LibroDAO;
import ec.ups.edu.Modelo.Autor;
import ec.ups.edu.Modelo.Capitulo;
import ec.ups.edu.Modelo.Libro;

/**
 * Servlet implementation class RegistrarLibro
 */
@WebServlet("/RegistrarLibro")
public class RegistrarLibro extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	    private LibroDAO personaDao;
	    private Libro libro;  
	    private Autor autor;    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrarLibro() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		LibroDAO libroDAO = DAOFactory.getFactory().getLibroDAO();
		libro = new Libro();
		
		String url = " ";
		Libro lib = null;
		
		libro.setNombre("nombre");
		libro.setIsbn(Integer.valueOf(request.getParameter("isbn")));
		libro.setNumpag(Integer.valueOf(request.getParameter("numpag")));
		libro.setCapitulos(request);
		libro.setAutor(request.getParameter("id")));
		
		
		
		
		
				
		
	}

}
