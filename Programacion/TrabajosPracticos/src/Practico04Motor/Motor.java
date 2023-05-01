package Practico04Motor;

public class Motor {

	private int tipoBomba;
	private String tipoFluido;
	private String combustible;
	
	public Motor() {
		this.tipoBomba=0;
		this.tipoFluido="";
		this.combustible="";
	}

	public Motor(int tipoBomba,String tipoFluido, String combustible) {
		this.tipoBomba=tipoBomba;
		this.tipoFluido=tipoFluido;
		this.combustible=combustible;
	}

	public int getTipoBomba() {
		return tipoBomba;
	}

	public void setTipoBomba(int tipoBomba) {
		this.tipoBomba = tipoBomba;
	}

	public String getTipoFluido() {
		return tipoFluido;
	}

	public void setTipoFluido(String tipoFluido) {
		this.tipoFluido = tipoFluido;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}
	
}
