package com.ejemplo.entidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Empleado {
	
	private String nombre;
	private String compañia;
	@Autowired
	private Nomina nomina;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCompañia() {
		return compañia;
	}
	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}
	public Nomina getNomina() {
		return nomina;
	}
	public void setNomina(Nomina nomina) {
		this.nomina = nomina;
	}
	public Empleado(String nombre, String compañia, Nomina nomina) {
		super();
		this.nombre = nombre;
		this.compañia = compañia;
		this.nomina = nomina;
	}
	public Empleado() {
		super();
	}
	@Override
	public String toString() {
		return "Empleado --> nombre:" + nombre + ", compañia:" + compañia + ", salario: " + nomina.getSalario() + ", a fecha: " + nomina.getFecha();
	}
	
	
	
}
