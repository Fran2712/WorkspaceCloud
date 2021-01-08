package negocio;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entidad.Persona;

public class Main2 {
	
	private static ApplicationContext context = null;
	
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("recursos/autowired.xml");
		Persona p =(Persona) context.getBean("persona", Persona.class);
		System.out.println(p);
	}
}
