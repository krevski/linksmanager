package com.krevski.mylink.entities;

import java.util.Collection;

import javax.persistence.*;

@Entity
public class Theme {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String themeName;
	@OneToMany(mappedBy="theme",  cascade = CascadeType.PERSIST)
	private Collection<Link> links;

	
	public Theme() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getThemeName() {
		return themeName;
	}
	public void setThemeName(String themeName) {
		this.themeName = themeName;
	}
	@Override
	public String toString() {
		return "Theme [id=" + id + ", themeName=" + themeName + "]";
	}
	

}
