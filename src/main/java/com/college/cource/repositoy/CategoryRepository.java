package com.college.cource.repositoy;


import org.springframework.data.jpa.repository.JpaRepository;

import com.college.cource.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
