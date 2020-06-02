package ec.ups.edu.DAO;

import java.util.List;

public interface GenericDAO<T, ID> {

    public void create(T entity);

    public T read(ID id);

    public void update(T entity);

    public void delete(T entity);
    
    public List<T> find();
    
    
}

