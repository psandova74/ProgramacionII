package ar.edu.unlam.pb2.eva03;

import java.util.HashSet;
import java.util.Set;


public class Batalla {
	private String nombre;
	private Double latitud;
	private Double longitud;
	private TipoDeBatalla tipo;
	Set<Vehiculo> vehiculosEnLaBatalla;
	
	public Batalla(String nombre, TipoDeBatalla tipo,Double latitud, Double longitud ) {
		this.nombre=nombre;
		this.latitud = latitud;
		this.longitud = longitud;
		this.tipo = tipo;
		this.vehiculosEnLaBatalla=new HashSet<Vehiculo>();
	}
		
	protected Double getLatitud() {
		return latitud;
	}

	protected void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	protected Double getLongitud() {
		return longitud;
	}

	protected void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	protected TipoDeBatalla getTipo() {
		return tipo;
	}

	protected void setTipo(TipoDeBatalla tipo) {
		this.tipo = tipo;
	}
	
	
	protected String getNombre() {
		return nombre;
	}


	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void enviarFlotaAPresentarBatalla() {
		for(Vehiculo envioVehiculo:vehiculosEnLaBatalla ) {
			envioVehiculo.setPresentaBatalla(true);
		}
	}

	public void agregarVehiculo(Vehiculo nuevo) {
		vehiculosEnLaBatalla.add(nuevo);
	}
}
