package pb2.unlam.edu.ar;

public class Auto {
	private String marca;
	private String modelo;
	private Integer anio;
	private Double sumaAsegurada;
	
	public Auto(String marca, String modelo, Integer anio, Double sumaAsegurada) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.sumaAsegurada = sumaAsegurada;
	}

	protected String getMarca() {
		return marca;
	}

	protected void setMarca(String marca) {
		this.marca = marca;
	}

	protected String getModelo() {
		return modelo;
	}

	protected void setModelo(String modelo) {
		this.modelo = modelo;
	}

	protected Integer getAnio() {
		return anio;
	}

	protected void setAnio(Integer anio) {
		this.anio = anio;
	}

	protected Double getSumaAsegurada() {
		return sumaAsegurada;
	}

	protected void setSumaAsegurada(Double sumaAsegurada) {
		this.sumaAsegurada = sumaAsegurada;
	}
}
