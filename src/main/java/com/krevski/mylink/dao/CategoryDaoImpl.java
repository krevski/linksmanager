package com.krevski.mylink.dao;

import org.springframework.stereotype.Repository;
import com.krevski.mylink.entities.Category;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Repository
public class CategoryDaoImpl implements CategoryDao {
	@PersistenceContext
	private EntityManager em;

	@Override
	public Category findById(int id) {
		Category category = null;
		category = em.find(Category.class, id);
		return category;
	}

	@Override
	public void save(Category category) {
		em.persist(category);
	}

	@Override
	public void remove(int id) {
		Category category = em.find(Category.class, id);
		if (category != null) {
			em.remove(category);
		}
	}

	@Override
	public void updateCategoryName(int id, String categoryName) {
		Category category = em.find(Category.class, id);
		if (category != null) {
			category.setCategoryName(categoryName);
		}
	}

	@Override
	public List<Category> findAll() {
		TypedQuery<Category> query = em.createQuery("SELECT c FROM Category c", Category.class);
		List<Category> listCategory = null;
		listCategory = query.getResultList();
		return listCategory;
	}
}
