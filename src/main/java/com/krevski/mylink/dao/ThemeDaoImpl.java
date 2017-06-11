package com.krevski.mylink.dao;

import java.util.List;
import org.springframework.stereotype.Repository;

import com.krevski.mylink.entities.Theme;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Repository
public class ThemeDaoImpl implements ThemeDao {
	@PersistenceContext
	private EntityManager em;

	@Override
	public Theme findById(int id) {
		Theme t = null;
		t = em.find(Theme.class, id);
		return t;
	}

	@Override
	public List<Theme> findAll() {
		TypedQuery<Theme> query = em.createQuery("SELECT t FROM Theme t", Theme.class);
		List<Theme> listT = null;
		listT = query.getResultList();
		return listT;
	}

	@Override
	public void save(Theme theme) {
		if (theme.getId() == 0)
			em.persist(theme);
		else
			em.merge(theme);
	}

	@Override
	public void remove(int id) {
		Theme customer = em.find(Theme.class, id);
		if (customer != null) {
			em.remove(customer);
		}
	}

}
