package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Hello World!";
	}

    @GetMapping("/team")
	public String getTeam() {
		return "AWengerS here !!";
	}

}
