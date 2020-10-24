package com.college.cource.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.college.cource.model.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer>{

}
