package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.example.entidad.Email;

@SpringBootApplication
@ImportResource("classpath:objSpring.xml")
public class Application {
	
	public static ApplicationContext context;
	public static void main(String[] args) {
		context = SpringApplication.run(Application.class, args);
		Email email = (Email) context.getBean("email");
		Email email1=(Email) context.getBean("email1");
		System.out.println(email1.getId());
		
		
	}

}
