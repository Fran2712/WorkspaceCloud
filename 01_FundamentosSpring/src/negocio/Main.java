package negocio;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entidad.Persona;

public class Main {
	
	// Tendrdemos que guardar una referencia al contenedor de Spring
	
	public static ApplicationContext context = null;
	
	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("recursos/context.xml");
		
		Persona p1 = (Persona) context.getBean("persona1");
		
		p1.setNombre("Silvia");
		p1.setEdad(19);
		p1.setPeso(50);
		
		p1 = null;
		combiarNombre("Patricia");
		p1 = context.getBean("persona2", Persona.class);
		//System.out.println(p1);
		
		Persona p3 = context.getBean("persona3",Persona.class);
		p3 = context.getBean("persona5", Persona.class);
		System.out.println(p3);
		
	}
	public static void combiarNombre(String nombre) {
		Persona p1 = (Persona) context.getBean("persona1");
		p1.setNombre(nombre);
	}

}
