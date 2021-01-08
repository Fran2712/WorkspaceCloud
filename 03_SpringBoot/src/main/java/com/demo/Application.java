package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.modelo.entidad.Cliente;

@SpringBootApplication
public class Application {
	
	public static ApplicationContext context = null;

	public static void main(String[] args) {
		context = SpringApplication.run(Application.class, args);
		Cliente p = (Cliente) context.getBean("cliente",Cliente.class);
	}

}
