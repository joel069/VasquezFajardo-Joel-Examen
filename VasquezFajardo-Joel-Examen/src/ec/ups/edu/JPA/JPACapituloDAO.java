package ec.ups.edu.JPA;
import javax.persistence.Query;


import ec.ups.edu.DAO.CapituloDAO;
import ec.ups.edu.Modelo.Capitulo;

public class JPACapituloDAO extends JPAGenericDAO<Capitulo, Integer> implements CapituloDAO{

	public JPACapituloDAO() {
		super(Capitulo.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Capitulo readByCapitulo(Integer numero) {
		// TODO Auto-generated method stub
		Query query = em.createNamedQuery("readByCapitulo");
		
		query.setParameter("capitulo", numero);
		Capitulo capitulo  = (Capitulo) query.getSingleResult();
		return capitulo;
		
	}



}
