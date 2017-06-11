package com.krevski.mylink.services;

import java.util.List;

import com.krevski.mylink.entities.Theme;

public interface ThemeService {
	
	Theme findById(int id);

	List<Theme> findAll();

	void save(Theme theme);
	
	void remove(int id);

}
