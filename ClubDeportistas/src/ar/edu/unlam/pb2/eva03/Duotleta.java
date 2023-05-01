package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;
import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;

public class Duotleta extends Deportista implements ICiclista, ICorredor {
	private String  tipoDeBicicleta;
	private Integer distanciaPreferida;
	private Integer kilometrosEntrenados;
	
	public Duotleta(Integer numeroDeSocio, String nombre ,String tipoDeBicicleta, Integer distanciaPreferida) {
		super(numeroDeSocio, nombre);
		this.tipoDeBicicleta=tipoDeBicicleta;
	}
	public String getTipoDeBicicleta() {
		return tipoDeBicicleta;
	}
	public void setEstiloPreferido(String tipoDeBicicleta) {
		this.tipoDeBicicleta = tipoDeBicicleta;
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
