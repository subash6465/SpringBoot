package com.springboot.RestfulWebServices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.RestfulWebServices.user.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {
	
	

}
