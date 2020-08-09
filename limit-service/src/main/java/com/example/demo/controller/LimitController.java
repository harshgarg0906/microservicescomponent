package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {
	
	@Value("${limit-service.maximum}")
	private String maximun;
	
	@Value("${limit-service.minimum}")
	private String minimum;
	
	@GetMapping("/data")
	public String getData()
	{
		return "Maximum"+maximun+"Minimum"+minimum;
	}

}
