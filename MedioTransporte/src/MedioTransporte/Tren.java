package MedioTransporte;

public class Tren extends MedioTransporte{
	private Integer cantidadDeVagones;
	private Integer velocidadMaxima;
	private Integer cantidadDePasajerosPorVagon;
	
	public Tren(Integer cantidadDeVagones,Integer cantidadDePasajerosPorVagon,Integer velocidadMaxima, Double latitud, Double longitud) {
		super(latitud, longitud);
		this.cantidadDeVagones=cantidadDeVagones;
		this.velocidadMaxima=velocidadMaxima;
		this.cantidadDePasajerosPorVagon=cantidadDePasajerosPorVagon;
	}

	protected Integer getCantidadDeVagones() {
		return cantidadDeVagones;
	}

	protected void setCantidadDeVagones(Integer cantidadDeVagones) {
		this.cantidadDeVagones = cantidadDeVagones;
	}

	protected Integer getVelocidadMaxima() {
		return velocidadMaxima;
	}

	protected void setVelocidadMaxima(Integer velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	protected Integer getCantidadDePasajerosPorVagon() {
		return cantidadDePasajerosPorVagon;
	}

	protected void setCantidadDePasajerosPorVagon(Integer cantidadDePasajerosPorVagon) {
		this.cantidadDePasajerosPorVagon = cantidadDePasajerosPorVagon;
	}
	
	
}
