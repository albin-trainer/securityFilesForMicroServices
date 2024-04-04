package com.cg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myapp")
public class MyController {
	@GetMapping
	public String hello(@RequestHeader("loggedInUser") String username) {
		
		return "Hello "+username;
	}
	@PostMapping
	public Data add( @RequestBody Data data) {
		System.out.println(data);
		return data;
	}
}
