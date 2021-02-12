package com.tim.firstproject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/dojo/{dojo}")
	public String showCampus(@PathVariable("dojo") String dojo) {
		if(dojo.equals("dojo")) {
			return "The dojo is awesome!";
		}
		if(dojo.equals("burbank-dojo")) {
			return "Burbank Dojo is located in Southern California";
		}
		if(dojo.equals( "san-jose")) {
			return "SJ dojo is the headquarters";
		}
		return "there is no match";
	}
}



//Create another controller named 'DojoController'. For the routes below, use the @PathVariable annotation.
//Have an http GET request to 'http://localhost:8080/dojo' display a text that says 'The dojo is awesome!'.
//Have an http GET request to 'http://localhost:8080/burbank-dojo/' display a text that says 'Burbank Dojo is located in Southern California'.
//Have an http GET request to 'http://localhost:8080/san-jose/' display a text that says 'SJ dojo is the headquarters'.