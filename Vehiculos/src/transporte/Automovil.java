package transporte;
import java.util.LinkedList;
public class Automovil extends Vehiculo {
	private static Integer MAX_PASAJEROS=3;
	private LinkedList <Persona> listaPasajeros= new LinkedList<Persona>();
	
	public Automovil() {
		super();
	}
	public Automovil(Persona chofer) {
		super(chofer);
	}
	
	@Override
	public Integer cantidadPasajeros() {
		return listaPasajeros.size();
	}
	
	@Override
	public Boolean agregarPasajero(Persona pasajero) {
		if (this.listaPasajeros.size()<MAX_PASAJEROS && !this.listaPasajeros.contains(pasajero) && pasajero.getTipoPersona().equals(TipoPersona.PASAJERO))
			return this.listaPasajeros.add(pasajero);
		return false;
	}
	

	

}
