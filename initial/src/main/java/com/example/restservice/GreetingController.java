package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	
	

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "H World") String name, @RequestParam(value = "name2", defaultValue = "name2_default") String name2) {
		System.out.println("inside controller class method mapping");
		return new Greeting(162722,name+name2);
	}
	
	@PostMapping(path = "/greeting", 
	        consumes = MediaType.APPLICATION_JSON_VALUE, 
	        produces = MediaType.APPLICATION_JSON_VALUE)
	public Greeting greeting(@RequestBody Greeting greet) {
		System.out.println("inside controller class method mapping");
		return new Greeting(162722,greet.getContent());
	}
	
}