package ar.edu.unlam.pb2.eva03;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FuerzaArmada {

	private Set<Vehiculo> convoy;
	private Map<String, Batalla> batallas; 

	public FuerzaArmada() {
		this.convoy = new HashSet<Vehiculo>();
		this.batallas = new HashMap<String, Batalla>();
	}



	public void agregarVehiculo(Vehiculo vehiculo) {
		if(buscarvehiculo(vehiculo.getIdentificador())==null)
			convoy.add(vehiculo);
	}
	


	public Integer getCapacidadDeDefensa() {
		return convoy.size();
	}
	
	public Batalla getBatalla(String string) {
		return batallas.get(string);
	}
	
	public void crearBatalla(String nombre, TipoDeBatalla tipo, Double latitud, Double longitud) {
		batallas.put(nombre, new Batalla(nombre, tipo, latitud, longitud));
	}
	
	public void crearBatalla(String tipo, Double latitud, Double longitud, String nombre) {
		TipoDeBatalla nuevoTipo=TipoDeBatalla.TERRESTRE;
		switch (tipo) {
		case "Terrestre":
			nuevoTipo=TipoDeBatalla.TERRESTRE;
			break;
		case "Naval":
			nuevoTipo=TipoDeBatalla.NAVAL;
			break;
		case "Aerea":
			nuevoTipo=TipoDeBatalla.AEREA;
			break;
		}
		if (tipo.equals("Terrestre"))
		batallas.put(nombre, new Batalla(nombre, nuevoTipo, latitud, longitud));
		
	}
	public Vehiculo buscarvehiculo(Integer buscarNumero) {
		for (Vehiculo numeroEncontrado : convoy) 
			if ((numeroEncontrado.getIdentificador().equals(buscarNumero))) 
				return numeroEncontrado;
		return null;
	}
	
	
	
	public boolean enviarALaBatalla(String string, Integer nroVehiculo) throws VehiculoInexistente, VehiculoIncompatible  {
		Boolean estado = false;
		Batalla batalla = batallas.get(string);
		
		TipoDeBatalla tipo = batalla.getTipo();
		Vehiculo vehiculo=null;
		
		if(buscarvehiculo(nroVehiculo)!=null) 
			vehiculo=buscarvehiculo(nroVehiculo);
		else 
			throw new VehiculoInexistente("Vehiculo inexistente");
		
		
		switch (tipo) {
		case TERRESTRE:
			if (vehiculo instanceof Terrestre) {
				batalla.agregarVehiculo(vehiculo);
				estado = true;
			} 
			else {
				throw new VehiculoIncompatible("No es un vehiculo terrestre");
			}	
			break;
		case NAVAL:
			if (vehiculo instanceof Acuatico) {
				batalla.agregarVehiculo(vehiculo);
				estado = true;
			} else {
				throw new VehiculoIncompatible("No es un vehiculo acuatico");
			}
			break;
		case AEREA:
			if (vehiculo instanceof Volador) {
				batalla.agregarVehiculo(vehiculo);
				estado = true;
			} else {
				throw new VehiculoIncompatible("No es un vehiculo volador");
			}
			break;
		}
		return estado;
	}



	public void presentarBatalla() {
		for (Batalla checkBatalla : batallas.values())
			checkBatalla.enviarFlotaAPresentarBatalla();
	}



	
	
}
