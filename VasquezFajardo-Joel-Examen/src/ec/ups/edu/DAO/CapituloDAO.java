package ec.ups.edu.DAO;

import ec.ups.edu.Modelo.Capitulo;
import ec.ups.edu.Modelo.Libro;

public interface CapituloDAO extends GenericDAO<Capitulo, Integer> {
	
	public abstract Capitulo readByCapitulo(Integer numero);

}
