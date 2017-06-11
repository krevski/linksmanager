package com.krevski.mylink.services;

import com.krevski.mylink.dao.CategoryDao;
import com.krevski.mylink.entities.Category;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.transaction.annotation.Transactional;

@Named
public class CategoryServiceImpl implements CategoryService {

	@Inject
	private CategoryDao categoryDao;

	@Override
	public Category findById(int id) {
		return categoryDao.findById(id);
	}

	@Transactional
	@Override
	public void save(Category category) {
		categoryDao.save(category);
	}

	@Transactional
	@Override
	public void remove(int id) {
		categoryDao.remove(id);
	}

	@Transactional
	@Override
	public void updateCategoryName(int id, String themeName) {
		categoryDao.updateCategoryName(id, themeName);
	}
	
	@Override
	public List<Category> findAll() {
		return categoryDao.findAll();
	}

}
