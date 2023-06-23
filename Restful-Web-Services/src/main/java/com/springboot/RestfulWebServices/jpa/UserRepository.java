package com.springboot.RestfulWebServices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.RestfulWebServices.user.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	

}
