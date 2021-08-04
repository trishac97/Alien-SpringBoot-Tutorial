package com.alien.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AlienSpringBootTutorialApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AlienSpringBootTutorialApplication.class, args);
		
		System.out.println("Here you go, first statement..");
		
		Alien a = context.getBean(Alien.class);
		
		a.show();
	}

}
