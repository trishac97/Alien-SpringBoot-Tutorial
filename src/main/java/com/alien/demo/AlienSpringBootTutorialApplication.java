package com.alien.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AlienSpringBootTutorialApplication {

	@Autowired 
	Alien a2;
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AlienSpringBootTutorialApplication.class, args);
		
		
		  System.out.println("Here you go, first statement..");
		  
		  // From the application context, you will get only one instance of Alien. If you want multiple instance, use prototype. 
		  Alien a1 = context.getBean(Alien.class); 
		  a1.show(); 
		  // Create object once for singleton
		  //Alien a2 = context.getBean(Alien.class);
		  		 
	}

}
