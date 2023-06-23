package com.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;


@Component
public class CourseCommandLineRunner implements CommandLineRunner{
	
//	@Autowired
//	private CourseJdbcRepository repository;
	
//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;

//	@Override
//	public void run(String... args) throws Exception {
//		repository.insert(new Course(1, "Leanrn AWS jpa!", "someonee"));
//		repository.insert(new Course(2, "Leanrn Azure jpa!", "someonee"));
//		repository.insert(new Course(3, "Leanrn Fullstack jpa!", "someonee"));
//		
//		repository.deleteById(1);
//		
//		System.out.println(repository.findById(2));
//		System.out.println(repository.findById(3));
	
	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1, "Leanrn AWS jpa!", "someonee"));
		repository.save(new Course(2, "Leanrn Azure jpa!", "someonee"));
		repository.save(new Course(3, "Leanrn Fullstack jpa!", "someonee"));
		
		repository.deleteById(1l);
		
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		
		System.out.println(repository.findByAuthor("someonee"));
		System.out.println(repository.findByAuthor(""));
		
		System.out.println(repository.findByName("Leanrn Fullstack jpa!"));
		System.out.println(repository.findByName("Leanrn Azure jpa!"));
		
	}

}
