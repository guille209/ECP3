package models.DAO.mem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.DAO.GenericDAO;

public abstract class MemGenericDAO<T, ID> implements GenericDAO<T, ID> {

	Map<ID, T> mapa = new HashMap<ID, T>();

	public abstract ID getId(T entity);

	public void create(T entity) {
		mapa.put(this.getId(entity), entity);
	}

	public T read(ID id) {
		return mapa.get(id);
	}

	public void update(T entity) {
		// TODO Auto-generated method stub
		assert mapa.containsValue(entity) : "No existe tal entidad";
		mapa.put(this.getId(entity), entity);		

	}

	public void delete(T entity) {
		assert mapa.containsValue(entity) : "No existe tal entidad";
		mapa.remove(this.getId(entity));

	}

	public void deleteByID(ID id) {
		assert mapa.containsKey(id) : "No existe tal entidad";
		mapa.remove(id);
	}

	public Map<ID, T> findAll() {
		// TODO Auto-generated method stub

		return mapa;
	}

	public Map<ID, T> findAll(int index, int size) {
		// TODO Auto-generated method stub
		return null;
	}

}
