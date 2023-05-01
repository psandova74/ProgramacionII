package ar.edu.unlam.pb2.eva03;

public class Avion extends Vehiculo implements Volador{
	private Double altura;
		
	public Avion(Integer identificador, String nombre) {
		super(identificador, nombre);
		altura=0.0;
	}

	public Avion(String identificador, String nombre) {
		super(identificador, nombre);
		altura=0.0;
	}

	@Override
	public Double getAltura() {
		return this.altura;
	}
	
	public void setAltura(Double altura) {
		this.altura=altura;
	}
	
}
