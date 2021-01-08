package f.paquete.uno;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Habitacion {
	
	private String tipoHab;
	private int cantidad;
	private double metros2;
	
	public String getTipoHab() {
		return tipoHab;
	}
	public void setTipoHab(String tipoHab) {
		this.tipoHab = tipoHab;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getMetros2() {
		return metros2;
	}
	public void setMetros2(double metros2) {
		this.metros2 = metros2;
	}
	public Habitacion(String tipoHab, int cantidad, double metros2) {
		super();
		this.tipoHab = tipoHab;
		this.cantidad = cantidad;
		this.metros2 = metros2;
	}
	public Habitacion() {
		super();
	}
	
	
}
