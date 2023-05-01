package ar.edu.unlam.pb2.eva03;

public class Anfibio extends Vehiculo implements Acuatico{
	private Double profundidad;
	private Double velocidad;
	
	public Anfibio(Integer numero, String modelo) {
		super(numero, modelo);
		profundidad=0.0;
		velocidad=0.0;
	}
	
	
	public Anfibio(String identificador, String nombre) {
		super(identificador, nombre);
		profundidad=0.0;
		velocidad=0.0;
	}
	
	
	@Override
	public Double getVelocidad() {
		return this.velocidad;
	}
	
	public void setVelocidad(Double velocidad) {
		this.velocidad=velocidad;
	}
	
	@Override
	public Double getProfundidad() {
		return this.profundidad;
	}
	
	public void setProfundidad(Double profundidad) {
		this.profundidad=profundidad;
	}

}
