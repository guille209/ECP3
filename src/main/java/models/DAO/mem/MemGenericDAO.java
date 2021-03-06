package models.DAO.mem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.DAO.GenericDAO;

public abstract class MemGenericDAO<T, ID> implements GenericDAO<T, ID> {

	Map<ID, T> mapa = new HashMap<ID, T>();

	protected abstract ID getId(T entity);

	public void create(T entity) {
		assert !mapa.containsValue(entity) : "ERROR: Entidad ya existente";
		mapa.put(this.getId(entity), entity);
	}

	public T read(ID id) {
		return mapa.get(id);
	}

	public void update(T entity) {
		// TODO Auto-generated method stub
		assert mapa.containsValue(entity) : "ERROR: No existe tal entidad";
		mapa.put(this.getId(entity), entity);

	}

	public void delete(T entity) {
		assert mapa.containsValue(entity) : "ERROR: No existe tal entidad";
		mapa.remove(this.getId(entity));

	}

	public void deleteByID(ID id) {
		assert mapa.containsKey(id) : "ERROR: No existe tal entidad";
		mapa.remove(id);
	}

	public List<T> findAll() {

		return new ArrayList<T>(mapa.values());
	}

	public List<T> findAll(int index, int size) {
		List<T> lista = new ArrayList<T>(mapa.values());
		return lista.subList(index, size);
	}

}
