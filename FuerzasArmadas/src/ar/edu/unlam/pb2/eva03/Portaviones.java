package ar.edu.unlam.pb2.eva03;

public class Portaviones extends Vehiculo implements Acuatico {
	private Double profundidad;

	public Portaviones(Integer numero, String modelo) {
		super(numero, modelo);
		profundidad=0.0;
	}
	
	public Portaviones(String identificador, String nombre) {
		super(identificador, nombre);
		profundidad=0.0;
	}

	@Override
	public Double getProfundidad() {
		return this.profundidad;
	}
	
	public void setProfundidad(Double profundidad) {
		this.profundidad=profundidad;
	}
	
}
