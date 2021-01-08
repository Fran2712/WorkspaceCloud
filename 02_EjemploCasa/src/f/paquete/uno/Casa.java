package f.paquete.uno;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Casa {
	private double superficie;
	@Autowired
	@Qualifier("habitacion")
	private ArrayList<Habitacion> habitaciones;
	@Autowired
	@Qualifier("persona")
	private Persona due�o;
	@Autowired
	private ArrayList<Persona>inquilinos;
	
	public Casa(double superficie, ArrayList<Habitacion> habitaciones, Persona due�o, ArrayList<Persona> inquilinos) {
		this.superficie = superficie;
		this.habitaciones = habitaciones;
		this.due�o = due�o;
		this.inquilinos = inquilinos;
	}

	public Casa() {
		super();
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public ArrayList<Habitacion> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}

	public Persona getDue�o() {
		return due�o;
	}

	public void setDue�o(Persona due�o) {
		this.due�o = due�o;
	}

	public ArrayList<Persona> getInquilinos() {
		return inquilinos;
	}

	public void setInquilinos(ArrayList<Persona> inquilinos) {
		this.inquilinos = inquilinos;
	}
	@Override
	public String toString() {
		String res = "";
		String hab = "";
		String due = "";
		String in = "";

		for (int i = 0; i < this.habitaciones.size(); i++) {

			hab += " " + this.habitaciones.get(i).getCantidad() + ", " + this.habitaciones.get(i).getMetros2() + "m2 "
					+ "." ;

		}
		due = this.due�o.getNombre() + ", " + this.due�o.getEdad() + ", " + this.due�o.getTelefono();

		for (int i = 0; i < this.inquilinos.size(); i++) {
			in += i + " " + this.inquilinos.get(i).getNombre() + ", "
					+ this.inquilinos.get(i).getDireccion().getTipoVia() + ", "
					+ this.inquilinos.get(i).getDireccion().getNombrevia() + ", ";
		}

		res = "Superficie: " + this.superficie + ", Habitaciones: " + hab + ", Due�o: " + due + ", Inquilinos: " + in;

		return res;
	}
	


}