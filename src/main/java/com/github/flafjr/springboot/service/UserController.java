package com.github.flafjr.springboot.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class UserController {

    public static final String HELLO_WORLD = "Greetings from Spring AAAAA!";

    @RequestMapping("/a")
	public String index() {
		return HELLO_WORLD;
	}
}