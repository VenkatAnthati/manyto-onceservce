package com.college.cource.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
@Table(name="phone")
public class Phone implements Serializable{

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="phone_id")
	private Integer phone_id;
	
	@Column(name="phone_number")
	private String number;
	
	@Column(name="phone_fk", insertable = false, updatable = false)
	private Integer phonefk;
	
	/*
	 * @ManyToOne(fetch = FetchType.LAZY, cascade =CascadeType.DETACH)
	 * 
	 * @JoinColumn(name = "phone_fk", referencedColumnName = "user_id") private User
	 * user;
	 */

	/*
	 * public User getUser() { return user; }
	 * 
	 * public void setUser(User user) { this.user = user; }
	 */

	public int getPhone_id() {
		return phone_id;
	}

	public void setPhone_id(int phone_id) {
		this.phone_id = phone_id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
