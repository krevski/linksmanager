package com.krevski.mylink.services;

import com.krevski.mylink.dao.LinkDao;
import com.krevski.mylink.entities.Link;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.transaction.annotation.Transactional;

@Named
public class LinkServiceImpl implements LinkService {
	
	@Inject
	private LinkDao linkDao;

	    public Link findById(int id) { 
	    	return linkDao.findById(id); 
	    }
	    
	    @Override
	    public List<Link> findByThemeId(int id){
	    	return linkDao.findByThemeId(id);
	    }

		@Override
		public List<Link> getFullInfo(int id) {
			return linkDao.getFullInfo(id);
		}
		@Transactional
		@Override
		public void save(Link link) {
			
			linkDao.save(link);
		}
		@Transactional
		@Override
		public void remove(int id) {
			// TODO Auto-generated method stub
			linkDao.remove(id);
		}

		@Override
		public void updateLinkName(int id, String linkName) {
			// TODO realize
			
		}

		@Override
		public List<Link> getAllLinks() {
			
			return linkDao.getAll();
		}

}
