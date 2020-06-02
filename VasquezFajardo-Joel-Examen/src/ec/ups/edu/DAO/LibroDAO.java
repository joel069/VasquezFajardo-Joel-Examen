package ec.ups.edu.DAO;


import ec.ups.edu.Modelo.Libro;

public interface LibroDAO extends GenericDAO<Libro, String>{
	
	public abstract Libro readByNombre(String nombre);
	


}
