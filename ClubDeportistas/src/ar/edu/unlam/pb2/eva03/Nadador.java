package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Nadador extends Deportista implements  INadador{
	private String estiloPreferido;

	public Nadador(Integer numeroDeSocio, String nombre, String estiloPreferido) {
		super(numeroDeSocio, nombre);
		this.estiloPreferido=estiloPreferido;
	}

	protected String getEstiloPreferido() {
		return estiloPreferido;
	}

	protected void setEstiloPreferido(String estiloPreferido) {
		this.estiloPreferido = estiloPreferido;
	}
	

}
