package f.paquete.uno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Persona {

	private String nombre;
	private int edad;
	private String telefono;
	@Autowired
	private Direccion direccion;
	
	public Persona(String nombre, int edad, String telefono, Direccion direccion) {
		this.nombre = nombre;
		this.edad = edad;
		this.telefono = telefono;
		this.direccion = direccion;
	}
	

	public Persona() {
		super();
	}
	


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}


	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public String getTelefono() {
		return telefono;
	}

	public Direccion getDireccion() {
		return direccion;
	}
}
