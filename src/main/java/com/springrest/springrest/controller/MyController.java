package com.springrest.springrest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/home")
	public String home() {
		return "Shubham bhai is going to delhi";
	}
	
	@GetMapping("/priye")
	public String home1() {
		return "Priye is going to delhi";
	}
	
}
