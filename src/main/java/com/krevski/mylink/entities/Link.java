package com.krevski.mylink.entities;

import java.sql.Date;

import javax.persistence.*;

@Entity
public class Link {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
    private String name;
    private String description;
    private String url;
    private java.sql.Date dateofadd;
    private String readnotread;
    @ManyToOne
	@JoinColumn(name="themeId")
    private Theme theme;
    @ManyToOne
	@JoinColumn(name="categoryId")
    private Category category;
    private String rating;

    public Link(){   }
    
	public Link(int id, String name, String description, String url, Date dateofadd, String readnotread, Theme theme,
			Category category, String rating) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.url = url;
		this.dateofadd = dateofadd;
		this.readnotread = readnotread;
		this.theme = theme;
		this.category = category;
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public java.sql.Date getDateofadd() {
		return dateofadd;
	}

	public void setDateofadd(java.sql.Date dateofadd) {
		this.dateofadd = dateofadd;
	}

	public String getReadnotread() {
		return readnotread;
	}

	public void setReadnotread(String readnotread) {
		this.readnotread = readnotread;
	}

	public Theme getTheme() {
		return theme;
	}

	public void setTheme(Theme theme) {
		this.theme = theme;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Link [id=" + id + ", name=" + name + ", description=" + description + ", url=" + url + ", dateofadd="
				+ dateofadd + ", readnotread=" + readnotread + ", theme=" + theme + ", category=" + category
				+ ", rating=" + rating + "]";
	}
	
}
