package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.INadador;
import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;

public class Acuatleta extends Deportista implements ICorredor, INadador{
	private String estiloPreferido;
	private Integer distanciaPreferida;
	private Integer kilometrosEntrenados;
	
	public Acuatleta(Integer numeroDeSocio, String nombre ,String estiloPreferido, Integer distanciaPreferida) {
		super(numeroDeSocio, nombre);
		this.estiloPreferido=estiloPreferido;
	}
	public String getEstiloPreferido() {
		return estiloPreferido;
	}
	public void setEstiloPreferido(String estiloPreferido) {
		this.estiloPreferido = estiloPreferido;
	}
	

	@Override
	public void setCantidadDeKilometrosEntrenados(Integer kilometrosEntrenados) {
		this.kilometrosEntrenados = kilometrosEntrenados;
		
	}
	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		return kilometrosEntrenados;
	}
	
}
