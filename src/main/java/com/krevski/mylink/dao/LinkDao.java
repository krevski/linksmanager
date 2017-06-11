package com.krevski.mylink.dao;

import java.util.List;
import com.krevski.mylink.entities.Link;

public interface LinkDao {

	Link findById(int id);

	List<Link> findByThemeId(int id);

	List<Link> getFullInfo(int id);

	List<Link> getAll();

	void save(Link link);

	void remove(int id);
}
