package com.ejemplo.entidad;

import java.util.ArrayList;

public class Equipo {
	
	private String nombre;
	private ArrayList<Jugador> jugador;
	private String ciudad;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Jugador> getJugador() {
		return jugador;
	}
	public void setJugador(ArrayList<Jugador> jugador) {
		this.jugador = jugador;
	}
	public Equipo(String nombre, ArrayList<Jugador> jugador, String ciudad) {
		super();
		this.nombre = nombre;
		this.jugador = jugador;
		this.ciudad= ciudad;
	}
	public Equipo() {
		super();
	}
	
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	@Override
	public String toString() {
		String j = "";
		for (int i = 0; i < jugador.size(); i++) {
			j += " " + jugador.get(i).getNombre() + "-" + jugador.get(i).getDorsal();
		}
		return nombre + " --> "+ ciudad + ": "+j;
	}
	
	
	
	
	
}
