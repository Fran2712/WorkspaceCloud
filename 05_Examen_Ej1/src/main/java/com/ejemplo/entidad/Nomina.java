package com.ejemplo.entidad;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Nomina {
	private int salario;
	private String fecha;
	
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Nomina(int salario, String fecha) {
		super();
		this.salario = salario;
		this.fecha = fecha;
	}
	public Nomina() {
		super();
	}
	
	
	
}
