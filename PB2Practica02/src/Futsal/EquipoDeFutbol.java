package Futsal;

public class EquipoDeFutbol {
	private String nombre;
	private Jugador jugadores[];
	private final Integer MAXIMO_DE_JUGADORES=5;
	
	public EquipoDeFutbol(String nombre) {
		this.nombre = nombre;
		jugadores=new Jugador[MAXIMO_DE_JUGADORES];
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/*
	 * La capacidad m�xima de un equipo es 5. No se permiten jugadores repetidos (ya sea el n�mero o nombre del jugador)
	 * Se retorna el resultado de la operaci�n
	 */
	public Boolean agregarJugador(Jugador nuevo) {
		if (buscarJugador(nuevo)!=null) {
			return false;		
		}
		for (int i=0;i<jugadores.length;i++) {
			if (jugadores[i]==null) {
				jugadores[i]=nuevo;
				return true;
			}
		}
		return false;
	}
	
	/*
	 * Permite buscar un jugador . 
	 * 
	 */
	public Jugador buscarJugador(Jugador jugadorBuscado) {
		for (int i=0;i<jugadores.length;i++) {
			if (jugadores[i]!=null && jugadores[i].equals(jugadorBuscado) ) {
				return jugadores[i];
			}
		}
		return null;
	}
	
	
	
	/*
	 * Calcula el valor del equipo. 
	 * 
	 */
	public Double calcularLaEdadPromedioDelEquipo() {
		Double sumatoriaEdadDelEquipo=0.0,promedioDeEdadDelEquipo=0.0;
		Integer cantidadDeJugadores=0;
		for (int i=0;i<jugadores.length;i++) {
			if (jugadores[i]!=null ) {
				cantidadDeJugadores++;
				sumatoriaEdadDelEquipo+=jugadores[i].getEdad();
			}
		}
		if (cantidadDeJugadores>0) {
			 promedioDeEdadDelEquipo=sumatoriaEdadDelEquipo/cantidadDeJugadores;
		}
		return promedioDeEdadDelEquipo;
	}
	
	/*
	 * Calcula el valor del equipo
	 * 
	 */
	public Double calcularElValorDelEquipo() {
		Double sumatoriaPrecioDelEquipo=0.0;
		for (int i=0;i<jugadores.length;i++) {
			if (jugadores[i]!=null ) {
				sumatoriaPrecioDelEquipo+=jugadores[i].getPrecio();
			}
		}
		return sumatoriaPrecioDelEquipo;
	}
	
	public String toString() {
		return this.nombre;
	}
	
}
