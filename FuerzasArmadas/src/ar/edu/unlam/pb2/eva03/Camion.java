package ar.edu.unlam.pb2.eva03;

public class Camion extends Vehiculo implements Terrestre{
	private Double velocidad;
	
	public Camion(Integer identificador, String nombre) {
		super(identificador, nombre);
		this.velocidad=0.0;
	}

	
	public Camion(String identificador, String nombre) {
		super(identificador, nombre);
		this.velocidad=0.0;
	}

	@Override
	public Double getVelocidad() {
		return this.velocidad;
	}
	
	public void setVelocidad(Double velocidad) {
		this.velocidad=velocidad;
	}
}
