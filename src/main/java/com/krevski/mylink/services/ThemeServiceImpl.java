package com.krevski.mylink.services;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import org.springframework.transaction.annotation.Transactional;

import com.krevski.mylink.dao.ThemeDao;
import com.krevski.mylink.entities.Theme;


@Named
public class ThemeServiceImpl implements ThemeService{
	@Inject
	private ThemeDao themeDao;

	public Theme findById(int id) {
		return themeDao.findById(id);
	}

	public List<Theme> findAll() {
		return themeDao.findAll();
	}

	@Override
	@Transactional
	public void save(Theme theme) {
		themeDao.save(theme);
	}

	@Override
	public void remove(int id) {
		themeDao.remove(id);
	}
}
