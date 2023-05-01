package ar.edu.unlam.pb2.eva03;

public class HidroAvion extends Vehiculo implements Volador, Acuatico {
	private Double altura;
	private Double profundidad;
	
	
	public HidroAvion(String identificador, String nombre) {
		super(identificador, nombre);
		altura=0.0;
		profundidad=0.0;
	}


	public HidroAvion(Integer numero, String modelo) {
		super(numero, modelo);
		altura=0.0;
		profundidad=0.0;
	}


	@Override
	public Double getAltura() {
		return this.altura;
	}
	
	public void setAltura(Double altura) {
		this.altura=altura;
	}	
	
	@Override
	public Double getProfundidad() {
		return this.profundidad;
	}
	
	public void setProfundidad(Double profundidad) {
		this.profundidad=profundidad;
	}
	
	
}
