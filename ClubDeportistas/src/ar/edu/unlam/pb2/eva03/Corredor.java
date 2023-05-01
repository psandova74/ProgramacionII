package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;

public class Corredor  extends Deportista implements ICorredor{
	private Integer distanciaPreferida;
	private Integer kilometrosEntrenados;
	
	public Corredor(Integer numeroDeSocio, String nombre,Integer distanciaPreferida) {
		super(numeroDeSocio, nombre);
		this.distanciaPreferida=distanciaPreferida;
		kilometrosEntrenados=0;
	}

	protected Integer getDistanciaPreferida() {
		return distanciaPreferida;
	}

	protected void setDistanciaPreferida(Integer distanciaPreferida) {
		this.distanciaPreferida = distanciaPreferida;
	}

	public Integer getCantidadDeKilometrosEntrenados() {
		return kilometrosEntrenados;
	}

	public void setCantidadDeKilometrosEntrenados(Integer kilometrosEntrenados) {
		this.kilometrosEntrenados = kilometrosEntrenados;
	}
	
	
	
	

}
