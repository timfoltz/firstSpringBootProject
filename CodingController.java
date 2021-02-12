package com.tim.firstproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class CodingController {
	
	@RequestMapping("")
	public String coding() {
		return "Hello Coding Dojo!";
	}
	@RequestMapping("/python")
	public String python() {
		return "Python/Django was awesome!";
	}
	@RequestMapping("/java")
	public String java() {
		return "Java/Spring is better!";
	}

}


//Create a controller named 'CodingController'. For the first 3 routes, use the @RequestMapping annotation.
//Have an http GET request to 'http://localhost:8080/coding' display a text that says 'Hello Coding Dojo!'.
//Have an http GET request to 'http://localhost:8080/coding/python' display a text that says 'Python/Django was awesome!'.
//Have an http GET request to 'http://localhost:8080/coding/java' display a text that says 'Java/Spring is better!'.