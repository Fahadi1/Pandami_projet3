package fr.eql.ai108.pandami.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.eql.ai108.pandami.idao.GenericIDao;

public class GenericDao<T> implements GenericIDao<T> {

	@PersistenceContext (unitName = "PandamiPU")
	private EntityManager em;

	@Override
	public T add(T t) {
		try {
			em.persist(t);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return t;
	}

}
