package com.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class Category {
	
	@Id
	@Column(name="category_id")
	private int id;
	@Column(name="category_name")
	private String name;
	
	@ManyToMany(mappedBy="categories")
	private Set<Item> items;
	
	public Category() {
		// TODO Auto-generated constructor stub
	}

	public Category(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	
	public Set<Item> getItems() {
		return items;
	}
	
	public void setItems(Set<Item> items) {
		this.items = items;
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
	
	

}
