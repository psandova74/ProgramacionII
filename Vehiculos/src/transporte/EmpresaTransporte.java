package transporte;

import java.util.LinkedList;

public class EmpresaTransporte {
	private String nombre;
	private LinkedList <Persona> listaChoferes= new LinkedList<Persona>();
	private LinkedList <Vehiculo> listaVehiculos= new LinkedList<Vehiculo>();
	
	public EmpresaTransporte(String nombre) {
		this.nombre = nombre;
	}

	protected String getNombre() {
		return nombre;
	}
	
	private Boolean ingresarChoferesLista(Persona chofer) {
		if(!listaChoferes.contains(chofer) && chofer.getTipoPersona().equals(TipoPersona.CHOFER))
			return this.listaChoferes.add(chofer);
		return false;
		
	}
	private Boolean ingresarVehiculoLista(Vehiculo vehiculo) {
		if(!listaVehiculos.contains(vehiculo))
			return this.listaVehiculos.add(vehiculo);
		return false;
		
	}
}
