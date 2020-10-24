package com.college.cource.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
@Table(name="User")
public class User implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private Integer user_id;
	
	@Column(name="user_name")
	private String username;
	

	@OneToMany(targetEntity = Phone.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "phone_fk", referencedColumnName = "user_id")
	//@OneToMany(mappedBy = "user")
	private List<Phone> phone;


	public List<Phone> getPhone() {
		return phone;
	}


	public void setPhone(List<Phone> phone) {
		this.phone = phone;
	}


	public int getUser_id() {
		return user_id;
	}


	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


}
