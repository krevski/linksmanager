package com.krevski.mylink.services;

import java.util.List;

import com.krevski.mylink.entities.Category;

public interface CategoryService {
	
	Category findById(int id);

	void save(Category category);

	void remove(int id);

	void updateCategoryName(int id, String categoryName);

	List<Category> findAll();
}
