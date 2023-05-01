package ar.edu.unlam.pb2.eva03;

public class Tanque extends Vehiculo implements Terrestre {
	private Double velocidad;
	
	public Tanque(Integer identificador, String nombre) {
		super(identificador, nombre);
		this.velocidad=0.0;
	}
	
	
		
	public Tanque(String identificador, String nombre) {
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
