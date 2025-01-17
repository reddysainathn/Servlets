package com.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="eseller")
@PrimaryKeyJoinColumn(name="user_seller_id")
public class Seller extends User{
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="seller_item_id")
	private Set<Item> items;
	
	@Column(name="cr_balance")
	private float creditBalance;
	
	public Seller() {
		// TODO Auto-generated constructor stub
	}
	
	public float getCreditBalance() {
		return creditBalance;
	}
	
	public void setCreditBalance(float creditBalance) {
		this.creditBalance = creditBalance;
	}
	
	public Set<Item> getItems() {
		return items;
	}
	
	public void setItems(Set<Item> items) {
		this.items = items;
	}

}
