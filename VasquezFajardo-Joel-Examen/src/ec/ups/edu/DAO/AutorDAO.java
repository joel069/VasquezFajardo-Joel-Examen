package ec.ups.edu.DAO;

import ec.ups.edu.Modelo.Autor;
import ec.ups.edu.Modelo.Libro;

public interface AutorDAO extends GenericDAO<Autor, String> {
	
	public abstract Autor read(String nombre);

}
