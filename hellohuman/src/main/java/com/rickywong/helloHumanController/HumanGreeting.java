package com.rickywong.helloHumanController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanGreeting {
	@RequestMapping("/")
	public String index(@RequestParam(value="name", required=false ) String searchQuery){
		if (searchQuery == null) {
			return "Hello Human! \n Welcome to SpringBoot!";
		}
		else {
			return "Hello " + searchQuery + "!/n/n Welcome to SpringBoot!";
			
		}
	}
		
}
