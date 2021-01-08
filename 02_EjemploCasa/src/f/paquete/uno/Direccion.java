package f.paquete.uno;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Direccion {
	

	private String tipoVia;
	private String nombrevia;
	private String cp;
	
	
	
	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}

	public void setNombrevia(String nombrevia) {
		this.nombrevia = nombrevia;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getTipoVia() {
		return tipoVia;
	}

	public String getNombrevia() {
		return nombrevia;
	}

	public String getCp() {
		return cp;
	}

	public Direccion(String tipoVia, String nombrevia, String cp) {
		this.tipoVia = tipoVia;
		this.nombrevia = nombrevia;
		this.cp = cp;
	}

	public Direccion() {
		super();
	}
	

}
