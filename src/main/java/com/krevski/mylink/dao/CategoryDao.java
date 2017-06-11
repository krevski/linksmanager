package com.krevski.mylink.dao;

import java.util.List;

import com.krevski.mylink.entities.Category;

public interface CategoryDao {

	Category findById(int id);

	void save(Category category);

	void remove(int id);

	void updateCategoryName(int id, String categoryName);

	List<Category> findAll();
}
