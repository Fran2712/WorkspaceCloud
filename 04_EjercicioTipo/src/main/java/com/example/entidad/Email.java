package com.example.entidad;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Email {
	private int id;
	private String reminente;
	private String destinatario;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReminente() {
		return reminente;
	}
	public void setReminente(String reminente) {
		this.reminente = reminente;
	}
	public String getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	public Email(int id, String reminente, String destinatario) {
		super();
		this.id = id;
		this.reminente = reminente;
		this.destinatario = destinatario;
	}
	public Email() {
		super();
	}
	
	
	
	
}
