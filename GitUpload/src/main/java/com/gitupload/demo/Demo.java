package com.gitupload.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class Demo {

	
	@GetMapping("/welcome")
	public String getInfo() {
		return "Hey Friends...!";
	}
	
	@GetMapping("/welcome1")
	public String getInfo1() {
		return "Hey Friends1...!";
	}
}