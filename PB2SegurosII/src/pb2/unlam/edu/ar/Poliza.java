package pb2.unlam.edu.ar;

public class Poliza {
	private Integer numeroDePoliza;
	private Persona asegurado;
	private Double sumaAsegurada;
	private Double prima;
	private Double premio;
	private Boolean siniestro;

	
	public Poliza(Integer numeroDePoliza, Persona asegurado, Double sumaAsegurada, Double prima) {
		this.numeroDePoliza = numeroDePoliza;
		this.asegurado = asegurado;
		this.sumaAsegurada = sumaAsegurada;
		this.prima = prima;
		this.premio=prima*1.2;
		this.siniestro=false;
	}


	protected Integer getNumeroDePoliza() {
		return numeroDePoliza;
	}


	protected void setNumeroDePoliza(Integer numeroDePoliza) {
		this.numeroDePoliza = numeroDePoliza;
	}


	protected Persona getAsegurado() {
		return asegurado;
	}


	protected void setAsegurado(Persona asegurado) {
		this.asegurado = asegurado;
	}


	protected Double getSumaAsegurada() {
		return sumaAsegurada;
	}


	protected void setSumaAsegurada(Double sumaAsegurada) {
		this.sumaAsegurada = sumaAsegurada;
	}


	protected Double getPrima() {
		return prima;
	}


	protected void setPrima(Double prima) {
		this.prima = prima;
	}


	protected Double getPremio() {
		return premio;
	}


	protected void setPremio(Double premio) {
		this.premio = premio;
	}
	
	public boolean isSiniestro() {
		return siniestro;
	}


	public boolean fueRobado() {
		return this.siniestro;
	}
	public void setSiniestro(boolean b) {
		this.siniestro = b;
		
	}
	
	public Boolean getSiniestro() {
		return this.siniestro;
	}

	public Boolean tuvoAlgunAccidente() {
		Boolean tuvo = false;
		if(this.siniestro) {
			tuvo = true;
		}
		return tuvo;
	}	
	
}
