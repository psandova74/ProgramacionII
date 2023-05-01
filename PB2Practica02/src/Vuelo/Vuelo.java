package Vuelo;

public class Vuelo {
	private final Integer CANTIDAD_DE_FILAS = 32;
	private final Integer CANTIDAD_DE_ASIENTOS_POR_FILA = 6;
	private String origen;
	private String destino;
	private Pasajero[] pasajeros;
	private Pasajero[][] asientos;
	
	public Vuelo(String origen, String destino, Integer cantidadPasajero) {
	/*
	* El constructor debe generar las acciones necesarias para
	garantizar el correcto funcionamiento de los objetos de la clase
	*/
		this.origen=origen;
		this.destino=destino;
		pasajeros=new Pasajero[cantidadPasajero];
		asientos =new Pasajero [CANTIDAD_DE_FILAS][CANTIDAD_DE_ASIENTOS_POR_FILA];	
	}
		
	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public boolean agregarPasajero(Pasajero pasajero) {
	/*
	* Incorpora un nuevo pasajero a la lista de pasajeros del vuelo.
	Devuelve true si se pudo agregar o false si la capacidad del vuelo se
	encuentra completa.
	*/
		for (int i=0;i<pasajeros.length;i++) {
			if(pasajeros[i]==null) {
				pasajeros[i]=pasajero;
				return true;
			}
			if (pasajeros[i].equals(pasajero)) {
				return false;
			}
		}
		return false;
	}
	
	public boolean verificarDisponibilidadAsiento(Integer fila, Integer columna) {
	/*
	* Verifica si el asiento indicado se encuentra disponible.
	*/
		return (asientos[fila][columna]==null);
	}
	
	public Pasajero buscarPasajero(Integer dni) {
	/*
	* Busca un pasajero en la lista de pasajeros a partir del DNI. Si no
	lo encuentra devuelve null.
	*/
	for (int i=0;i<pasajeros.length;i++) {
		if(pasajeros[i]==null && pasajeros[i].getDni().equals(dni) ) {
			return pasajeros[i];
		}
	}
	return null;
	}
	
	public boolean asignarAsiento(Pasajero pasajero, int fila, int columna) {
		/*
		* Asigna el asiento al pasajero recibido por parámetro. Devuelve
		true si lo pudo asignar o false en caso que el asiento no se encuentre disponible.
		*/
		if (asientos[fila][columna]==null) {
			asientos[fila][columna]=pasajero;
			return true;
		}
		return false;
		
	}
		
	public void ordenarListaDePasajerosPorDNI() {
		/*
		* Ordena la lista de pasajeros por DNI.
		*/
		Pasajero pasajeroAuxiliar;
		for (int i=0;i<pasajeros.length;i++) {
        	for (int j=0;j<pasajeros.length-1;j++) {
        		if(pasajeros[j].getDni() >pasajeros[j+1].getDni()) {
        			pasajeroAuxiliar=pasajeros[j+1];
        			pasajeros[j+1]=pasajeros[j];
        			pasajeros[j]=pasajeroAuxiliar;
        		}
        	}
        }
	}
		
	public Pasajero[] getPasajeros() {
		/*
		* Devuelve la lista de pasajeros
		*/
			return pasajeros;
	}
	
	public String toString() {
		/*
		* Devuelve un mapa de los asientos del vuelo indicando por cada uno
		si se encuentra libre "L" u ocupado "O".
		*/
		String mapaAsientos="";
		for (int i=0;i<asientos.length;i++) {
			for (int j=0;j<asientos.length;j++){
				if (asientos[i][j]==null) {
					mapaAsientos+=" L -";
				} else {
					mapaAsientos+=" O -";
				}
			}
			mapaAsientos+="\n";
		}
		return mapaAsientos;
	}
}
