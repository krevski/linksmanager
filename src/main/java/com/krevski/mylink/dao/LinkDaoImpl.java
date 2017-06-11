package com.krevski.mylink.dao;

import org.springframework.stereotype.Repository;

import com.krevski.mylink.entities.Link;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Repository
public class LinkDaoImpl implements LinkDao {
	@PersistenceContext
	private EntityManager em;

	public Link findById(int id) {
		Link l = null;
		l = em.find(Link.class, id);
		return l;
	}

	@Override
	public List<Link> findByThemeId(int id) {
		TypedQuery<Link> query = em.createQuery("SELECT l FROM Link l WHERE l.theme = " + id, Link.class);
		return query.getResultList();
	}

	@Override
	public List<Link> getFullInfo(int id) {
		String txt = "SELECT DISTINCT l.id FROM ";
		txt += "Link l, Theme t ";
		txt += "WHERE l.id = t.theme > " + id;
		TypedQuery<Link> query = em.createQuery(txt, Link.class);
		return query.getResultList();
	}

	@Override
	public List<Link> getAll() {
		TypedQuery<Link> query = em.createQuery("SELECT l FROM Link l  ", Link.class);
		List<Link> listT = null;
		listT = query.getResultList();
		return listT;
	}


	@Override
	public void save(Link link) {

		if (link.getId() == 0) {
			em.persist(link);
		} else {
			em.merge(link);
		}
	}
	
	@Override
	public void remove(int id) {
		
		Link link = em.find(Link.class, id);
		if (link != null) {
			em.remove(link);
		}
		
	}

}
