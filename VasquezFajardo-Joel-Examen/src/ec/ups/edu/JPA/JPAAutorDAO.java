package ec.ups.edu.JPA;


import javax.persistence.Query;
import ec.ups.edu.DAO.AutorDAO;
import ec.ups.edu.Modelo.Autor;

public class JPAAutorDAO extends JPAGenericDAO<Autor, String> implements AutorDAO{

	public JPAAutorDAO() {
		super(Autor.class);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public Autor read(String nombre) {
		Query query = em.createNamedQuery("read");

		query.setParameter("autor", nombre);
		Autor autor = (Autor) query.getSingleResult();
		return autor;
	}



}
