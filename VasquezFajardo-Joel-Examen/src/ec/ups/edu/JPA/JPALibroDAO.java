package ec.ups.edu.JPA;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


import ec.ups.edu.DAO.LibroDAO;
import ec.ups.edu.Modelo.Libro;

public class JPALibroDAO extends JPAGenericDAO<Libro, String> implements LibroDAO{

	public JPALibroDAO() {
		super(Libro.class);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Libro read(String nombre) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public Libro readByNombre(String nombre) {
		// TODO Auto-generated method stub
		
        Query query = em.createNamedQuery("readByNombre");
		
		query.setParameter("nombre", nombre);
		Libro lib = (Libro) query.getSingleResult();
		return lib;
		
	}



}
