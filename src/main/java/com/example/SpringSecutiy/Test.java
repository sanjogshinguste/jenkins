package com.example.SpringSecutiy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
	
	@GetMapping(value="/test")
	public String test()
	{
		
		return "hii";
	}

}
