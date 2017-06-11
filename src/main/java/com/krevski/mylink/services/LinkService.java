package com.krevski.mylink.services;

import java.util.List;

import com.krevski.mylink.entities.Link;

public interface LinkService {
	
	Link findById(int id);
	
	List<Link> getAllLinks();

	List<Link> findByThemeId(int id);

	List<Link> getFullInfo(int id);

	void save(Link link); 

	void remove(int id);

	void updateLinkName(int id, String linkName);
}
