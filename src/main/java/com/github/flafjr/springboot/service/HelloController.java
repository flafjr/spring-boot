package com.github.flafjr.springboot.service;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    public static final String HELLO_WORLD = "Greetings from Spring Boot!";

    @RequestMapping("/")
	public String index() {
		return HELLO_WORLD;
	}
}