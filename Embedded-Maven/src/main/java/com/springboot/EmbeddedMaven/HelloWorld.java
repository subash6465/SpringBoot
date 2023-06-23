package com.springboot.EmbeddedMaven;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@RequestMapping ("/courses")
	public List<Course> retriveAllCourses()
	{
		return Arrays.asList(
				new Course(1, "Learn AWS", "in28minutes"),
				new Course(2, "Learn DevOps", "in28minutes"),
				new Course(3, "Learn Spring boot", "in28minutes")
				);
	}

}
