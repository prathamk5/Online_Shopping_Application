package com.spring.IntroToSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroToSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntroToSpringApplication.class, args);
		System.out.println(java.util.TimeZone.getDefault().getID());
	}

}
