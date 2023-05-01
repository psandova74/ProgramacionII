package pb2.unlam.edu.ar;

import java.util.HashSet;


public class Empresa {

	private String nombre;
	private HashSet<Vuelo> vuelos;
	private HashSet<Pasajero> Pasajeros;
	private HashSet<AsignacionAsiento> asignacionesAsientos;
	private HashSet<Avion> aviones;

	public Empresa(String nombre) {

		this.nombre = nombre;
		this.vuelos = new HashSet<Vuelo>();
		this.Pasajeros = new HashSet<Pasajero>();
		this.asignacionesAsientos = new HashSet<AsignacionAsiento>();
		this.aviones=new HashSet<>();

	}

	public Boolean registrarAvion(Avion avion) {
		return this.aviones.add(avion);
	}

	public Boolean regitrarVuelo(Vuelo vuelo) {
		return this.vuelos.add(vuelo);
	}

	public Boolean RegistarPasajero(Pasajero pasajero) {
		return this.Pasajeros.add(pasajero);
	}

	public Boolean asignarPasajeroAUnVuelo(Integer idVuelo, Integer dni) {

		return null;
	}

	public Boolean verificarSiExisteUnAsientoEnUnAvion(Integer idAvion, String asciento) {

		return null;
	}
                                                                 
	public Boolean verificarAsientoDiponibleParaUnVuelo(Integer idVuelo, String asciento) {
		
		
		
		return true;
	}

	public Boolean asignarAsientoPasajeroParaUnVuelo(Integer idVuelo, Integer dni, String numeroAciento) {

		
		return null;
	}

	public HashSet<String> obtenerListaDeAsientoDeUnAvion(Integer idAvion) {
		
		
		return null;
	}

	public HashSet<String> obtenerListaDeAsientoOcupadosDeUnVuelo(Integer IdVuelo) {
		return null;
	}

	public HashSet<String> obtenerListaDeAsientoDisponibleDeUnVuelo(Integer IdVuelo) {
		return  null;
	}
	
	public Boolean cambiarAsientoDeUnPasajeroParaUnVuelo(Integer idVuelo, Integer dni, String nuevoAsciento) {
		return null;
	}
	public Vuelo buscarVuelo(Integer idAvion) {
		for (Vuelo vuelo : this.vuelos)
			if (vuelo.getAvion().getId().equals(idAvion)) {
				return vuelo;
			}
		return null;
	}

}
