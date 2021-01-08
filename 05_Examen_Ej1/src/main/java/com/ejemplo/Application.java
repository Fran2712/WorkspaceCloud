package com.ejemplo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.ejemplo.entidad.Empleado;

@SpringBootApplication
public class Application {

	public static ApplicationContext context = null;

	public static void main(String[] args) {
		context = SpringApplication.run(Application.class, args);
		Empleado p = (Empleado) context.getBean("empleado",Empleado.class);
		p.setCompañia("Adidas");
		p.setNombre("Astolfo");
		p.getNomina().setSalario(500);
		p.getNomina().setFecha("25/03/2020");
		
		
		
		Empleado p2 = (Empleado) context.getBean("empleado",Empleado.class);
		p2.setCompañia("Ufotable");
		p2.setNombre("Kishimoto");
		p2.getNomina().setSalario(8000);
		p2.getNomina().setFecha("03/02/2018");
		
		
		System.out.println(p);
		System.out.println(p2);
	}

}
