package com.college.cource.controller.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.cource.model.Phone;
import com.college.cource.model.User;
import com.college.cource.repositoy.PhoneRepository;
import com.college.cource.repositoy.UserRepositoy;

@Service
public class UserService {

	
    @Autowired
	UserRepositoy repo;
    
    @Autowired
    PhoneRepository phonerepo;

    @Transactional
	public void saveUser(User user) {
		
		repo.save(user);

		// TODO Auto-generated method stub
		
	}

	public List<User> findAll() {
		
		return repo.findAll();
		// TODO Auto-generated method stub
		}

	public void savephone(Phone phone) {
		// TODO Auto-generated method stub
		phonerepo.save(phone);
	}
}
