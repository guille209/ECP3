package models.DAO.mem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.DAO.GenericDAO;

public abstract class MemGenericDAO<T, ID> implements GenericDAO<T,ID> {

	Map<ID,T> mapa = new HashMap<ID, T>();

	public abstract ID getId(T entity);
	
	public void create(T entity) {
		mapa.put(this.getId(entity),entity);
	}

	public T read(ID id) {
		return null;
	}

	public void update(T entity) {
		// TODO Auto-generated method stub
		
	}

	public void delete(T entity) {
		// TODO Auto-generated method stub
		
	}

	public void deleteByID() {
		// TODO Auto-generated method stub
		
	}

	public List<T> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<T> findAll(int index, int size) {
		// TODO Auto-generated method stub
		return null;
	}

}
