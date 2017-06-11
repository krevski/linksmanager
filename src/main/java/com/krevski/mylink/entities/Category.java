package com.krevski.mylink.entities;

import java.util.Collection;
import javax.persistence.*;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String categoryName;
	@OneToMany(mappedBy="category",  cascade = CascadeType.PERSIST)
	private Collection<Link> links;

	public Category() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}




	public Collection<Link> getLinks() {
		return links;
	}

	public void setLinks(Collection<Link> links) {
		this.links = links;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", categoryName=" + categoryName + ", links=" + links + "]";
	}

	
	
}
