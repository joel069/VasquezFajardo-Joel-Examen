package ec.ups.edu.DAO;

import ec.ups.edu.JPA.JPADAOFactory;

public abstract class DAOFactory {
    // Sería mejor por inyección de objetos
    protected static DAOFactory factory = new JPADAOFactory();

    public static DAOFactory getFactory() {
	return factory;
    }

    public abstract LibroDAO getLibroDAO();
    public abstract AutorDAO getAutorDAO();
    public abstract CapituloDAO getCapituloDAO();

}
