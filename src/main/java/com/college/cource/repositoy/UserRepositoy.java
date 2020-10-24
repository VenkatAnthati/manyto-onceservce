package com.college.cource.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.cource.model.User;

public interface UserRepositoy extends JpaRepository<User, Integer> {

}
