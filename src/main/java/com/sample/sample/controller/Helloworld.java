package com.sample.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {


    @GetMapping("/hello")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}
