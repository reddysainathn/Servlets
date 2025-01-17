package com.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

// it is a Uni-Driectional Association with Bid
@Entity
@Table(name="item")
public class Item {

	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@ManyToMany
	@JoinTable(name="item_category",joinColumns={@JoinColumn(name="item_id")},
	inverseJoinColumns={@JoinColumn(name="category_id")})
	private Set<Category> categories;
	
	//Set<Bid> shows the association property
	//On the database side the association is represented by Foreign Key Constraint
	//In hibernate we specify the foreignkey(or)joining constraint by  JoinColumn()
	@OneToMany(mappedBy="item")
//We can use it on only uni-directional 	@JoinColumn(name="id")
	private Set<Bid> bids;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Set<Bid> getBids() {
		return bids;
	}
	public void setBids(Set<Bid> bids) {
		this.bids = bids;
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
	public Set<Category> getCategories() {
		return categories;
	}
	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}
	
	
}
