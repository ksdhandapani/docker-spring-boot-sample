package com.dhandapani.dockerspringbootsample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/test")
	public String sayHello() {
		return "Hello from the App!";
	}
}
