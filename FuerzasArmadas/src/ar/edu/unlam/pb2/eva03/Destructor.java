package ar.edu.unlam.pb2.eva03;

public class Destructor extends Vehiculo implements Acuatico {
	private Double profundidad;

	public Destructor(Integer numero, String modelo) {
		super(numero, modelo);
		profundidad=0.0;
	}
	
	
	
	public Destructor(String identificador, String nombre) {
		super(identificador, nombre);
		profundidad=0.0;
	}
	
	@Override
	public Double getProfundidad() {
		return profundidad;
	}



	public void setProfundidad(Double profundidad) {
		this.profundidad=profundidad;
	}
	
}
