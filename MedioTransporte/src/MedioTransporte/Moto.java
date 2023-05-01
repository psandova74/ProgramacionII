package MedioTransporte;


public class Moto extends MedioTransporte{
	private String patente;
	private Integer velocidadMaxima;
	private final Integer CAPACIDA_MAXIMA_DE_PASAJEROS=2;
	
	
	public Moto(String patente,Integer velocidadMaxima, Double latitud, Double longitud) {
		super(latitud, longitud);
		this.patente=patente;
		this.velocidadMaxima=velocidadMaxima;
	}


	protected String getPatente() {
		return patente;
	}


	protected void setPatente(String patente) {
		this.patente = patente;
	}


	protected Integer getVelocidadMaxima() {
		return velocidadMaxima;
	}


	protected void setVelocidadMaxima(Integer velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}


	protected Integer getCAPACIDA_MAXIMA_DE_PASAJEROS() {
		return CAPACIDA_MAXIMA_DE_PASAJEROS;
	}
	
	
}
