package transporte;

public abstract class Vehiculo {
	private Persona chofer;
	private Integer kmRecorridos;
	
	public Vehiculo(Persona chofer) {
		this.chofer = chofer;
		this.kmRecorridos = 0;
	}
	
	public Vehiculo() {
		this.chofer = null;
		this.kmRecorridos = 0;
	}
	
	public abstract Integer cantidadPasajeros();
	
	public abstract Boolean agregarPasajero(Persona pasajero);

	public Persona getChofer() {
		return chofer;
	}

	public Boolean asignarChofer(Persona chofer) {
		Boolean ingresoOK=false;
		if (chofer.getTipoPersona().equals(TipoPersona.CHOFER)) {
			this.chofer = chofer;
			ingresoOK=true;
		}
		return ingresoOK;
	}

	public Integer getKmRecorridos() {
		return kmRecorridos;
	}

	public void setKmRecorridos(Integer kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}
}
