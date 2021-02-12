package com.tim.firstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class HomeController {


	@RequestMapping("")
	public String hello() {
		return "Hello client! How are you doing?";
	}
	@RequestMapping("/random")
	public String springBoot() {
		return "Spring Boot is great! So easy to just respond with strings";
	}
}
