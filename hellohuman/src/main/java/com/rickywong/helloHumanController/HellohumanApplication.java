package com.rickywong.helloHumanController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class HellohumanApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(HellohumanApplication.class, args);
	}
	
}
 