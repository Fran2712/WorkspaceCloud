package com.ejemplo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.ejemplo.entidad.Equipo;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class Application {
	public static ApplicationContext context = null;

	public static void main(String[] args) {
		context = SpringApplication.run(Application.class, args);
		Equipo r =  (Equipo)context.getBean("equipo");
		Equipo r2 =  (Equipo)context.getBean("equipo2");
		
		System.out.println(r);
		System.out.println(r2);
	}

}
