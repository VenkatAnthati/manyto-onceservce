package com.college.cource.model;

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

@Entity
@Table(name="product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="product_id")
	private Integer product_id;
	
	@Column(name="productName")
	private String productName;
	
	/*
	 * @Column(name="company_fk", insertable =false, updatable=false) private
	 * Integer company_fk;
	 * 
	 * @Column(name="category_fk", insertable =false ,updatable=false) private
	 * Integer category_fk;
	 */
	@ManyToOne(fetch = FetchType.LAZY, cascade =CascadeType.ALL)
	@JoinColumn(name = "CATEGORY_ID", insertable =false, updatable=false)
	private Category category;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade =CascadeType.ALL)
	@JoinColumn(name = "company_id", insertable =false, updatable=false)
	private Company company;
}
