package com.college.cource.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.college.cource.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
