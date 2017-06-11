package com.krevski.mylink.dao;

import java.util.List;

import com.krevski.mylink.entities.Theme;

public interface ThemeDao {

	Theme findById(int id);

	List<Theme> findAll();

	void save(Theme theme);

	void remove(int id);

}
