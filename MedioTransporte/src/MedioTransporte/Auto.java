package MedioTransporte;


public class Auto extends MedioTransporte{
	private String patente;
	private Integer velocidadMaxima;
	private Integer cantidadMaximaDePasajeros;
	public Auto(String patente,Integer cantidadMaximaDePasajeros,Integer velocidadMaxima, Double latitud, Double longitud) {
		super(latitud, longitud);
		this.patente=patente;
		this.velocidadMaxima=velocidadMaxima;
		this.cantidadMaximaDePasajeros=cantidadMaximaDePasajeros;
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
	protected Integer getCantidadMaximaDePasajeros() {
		return cantidadMaximaDePasajeros;
	}
	protected void setCantidadMaximaDePasajeros(Integer cantidadMaximaDePasajeros) {
		this.cantidadMaximaDePasajeros = cantidadMaximaDePasajeros;
	}
	
	
	
	

	
}
