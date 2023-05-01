package Futsal;



public class mainTest {

	public static void main(String[] args) {
		EquipoDeFutbol localEquipo=cargarNuevoEquipoLocal("Cebollita");
		EquipoDeFutbol visitanteEquipo=cargarNuevoEquipoVisitante("Mandillu");
		PartidoDeFutbol nuevoPartido=new PartidoDeFutbol(localEquipo,visitanteEquipo);
		Integer golesLocales=nuevoPartido.getGolesLocal();
		Integer golesVisitantes=nuevoPartido.getGolesVisitante();
		Jugador nuevoJugador=cargarNuevoJugador(3,"Rodriguez",22, 999.54);//Jugador Local
		Evento nuevoEvento=cargarNuevoEvento(30,nuevoJugador,TipoDeEvento.GOL_A_FAVOR);
		System.out.println("Local: "+golesLocales+" Visitante: "+golesVisitantes);
		nuevoPartido.marcar(nuevoEvento);		
	}
	
	private static Jugador  cargarNuevoJugador(Integer numero, String nombre, Integer edad, Double precio) {
		Jugador jugador=new Jugador(numero, nombre, edad, precio);
		return jugador;		
	}
	
	public static Evento  cargarNuevoEvento(Integer minuto, Jugador autor, TipoDeEvento tipo) {
		Evento evento=new Evento( minuto, autor, tipo);
		return evento;		
	}
	
	public static EquipoDeFutbol  cargarNuevoEquipo(String nombreEquipo) {
		EquipoDeFutbol nuevoEquipo=new EquipoDeFutbol( nombreEquipo);
		return nuevoEquipo;		
	}
	
	
	public static EquipoDeFutbol  cargarNuevoEquipoLocal(String nombreEquipo) {
		//Promedio Edad 24.2
		//Valor Equipo 4889.61
		EquipoDeFutbol nuevoEquipo=new EquipoDeFutbol( nombreEquipo);
		Jugador nuevoJugador=cargarNuevoJugador(1,"Sanchez",23, 1224.67);
		nuevoEquipo.agregarJugador(nuevoJugador);
		nuevoJugador=cargarNuevoJugador(2,"Fernandez",25, 1024.67);
		nuevoEquipo.agregarJugador(nuevoJugador);
		nuevoJugador=cargarNuevoJugador(3,"Rodriguez",22, 999.54);
		nuevoEquipo.agregarJugador(nuevoJugador);
		nuevoJugador=cargarNuevoJugador(4,"Villamayor",24, 896.75);
		nuevoEquipo.agregarJugador(nuevoJugador);
		nuevoJugador=cargarNuevoJugador(5,"Sosa",27, 743.98);
		nuevoEquipo.agregarJugador(nuevoJugador);
		return nuevoEquipo;		
	}
	
	public static EquipoDeFutbol  cargarNuevoEquipoVisitante(String nombreEquipo) {
		EquipoDeFutbol nuevoEquipo=new EquipoDeFutbol( nombreEquipo);
		Jugador nuevoJugador=cargarNuevoJugador(1,"Maldonado",23, 1224.67);
		nuevoEquipo.agregarJugador(nuevoJugador);
		nuevoJugador=cargarNuevoJugador(2,"Rivero",25, 1024.67);
		nuevoEquipo.agregarJugador(nuevoJugador);
		nuevoJugador=cargarNuevoJugador(3,"Ovejero",22, 3455.54);
		nuevoEquipo.agregarJugador(nuevoJugador);
		nuevoJugador=cargarNuevoJugador(4,"Jardines",24, 2345.75);
		nuevoEquipo.agregarJugador(nuevoJugador);
		nuevoJugador=cargarNuevoJugador(5,"Avalos",27, 1345.98);
		nuevoEquipo.agregarJugador(nuevoJugador);
		return nuevoEquipo;	
	}

}
