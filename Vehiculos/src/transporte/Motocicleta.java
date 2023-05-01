package transporte;

import java.util.LinkedList;

public class Motocicleta extends Vehiculo {
	private Persona pasajero;
	
	public Motocicleta() {
		super();
	}
	public Motocicleta(Persona chofer) {
		super(chofer);
	}
	
	@Override
	public Integer cantidadPasajeros() {
		Integer cantidad=0;
		if(pasajero!=null)
			cantidad=1;
		return cantidad;
		
	}
	
	@Override
	public Boolean agregarPasajero(Persona pasajero) {
		Boolean ingresoOK=false;
		if (pasajero.getTipoPersona().equals(TipoPersona.PASAJERO)) {
			this.pasajero=pasajero;
			ingresoOK=true;
		}
		return ingresoOK;
	}
}
