package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@Table(name="euser")
@DiscriminatorColumn(name="user_type",discriminatorType=DiscriminatorType.STRING)
public abstract class User {
	
	@Id
	@Column(name="user_id")
	private int userId;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="user_address_id")
	private Address address;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}
