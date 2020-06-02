 package ec.ups.edu.JPA;

import ec.ups.edu.DAO.AutorDAO;
import ec.ups.edu.DAO.CapituloDAO;
import ec.ups.edu.DAO.DAOFactory;
import ec.ups.edu.DAO.LibroDAO;

public class JPADAOFactory extends DAOFactory {

	@Override
	public AutorDAO getAutorDAO() {
		return new JPAAutorDAO();
	}
	
	@Override
	public LibroDAO getLibroDAO() {
		return new JPALibroDAO();
	}
	
	@Override
	public CapituloDAO getCapituloDAO() {
		return new JPACapituloDAO();
	}

}
