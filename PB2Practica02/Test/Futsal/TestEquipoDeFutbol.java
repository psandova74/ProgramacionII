package Futsal;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class TestEquipoDeFutbol {
	@Test
	public void queSePuedaDarDeAltaJugador() {
		Jugador nuevoJugador=cargarNuevoJugador(1,"Messi",23, 1224.67);
		assertNotNull(nuevoJugador);
	}
	
	@Test
	public void queSePuedaDarDeAltaEvento() {
		Jugador nuevoJugador=cargarNuevoJugador(1,"Messi",23, 1224.67);
		Evento nuevoEvento=cargarNuevoEvento(30,nuevoJugador,TipoDeEvento.GOL_A_FAVOR);
		assertNotNull(nuevoEvento);
	}
	
	@Test
	public void queSePuedaDarDeAltaEquipo() {
		EquipoDeFutbol nuevoEquipo=cargarNuevoEquipo("Cebollita");
		assertNotNull(nuevoEquipo);
	}
	
	//Boolean agregarJugador(Jugador nuevo)
	@Test
	public void queSePuedaDarDeCargarJugadorAEquipo() {
		EquipoDeFutbol nuevoEquipo=cargarNuevoEquipo("Cebollita");
		Jugador nuevoJugador=cargarNuevoJugador(1,"Messi",23, 1224.67);
		Boolean ve=nuevoEquipo.agregarJugador(nuevoJugador);
		assertTrue(ve);
	}
	
	@Test
	public void queNoSePuedaDarDeCargarJugadorAEquipoDuplicado() {
		EquipoDeFutbol nuevoEquipo=cargarNuevoEquipo("Cebollita");
		Jugador nuevoJugador=cargarNuevoJugador(1,"Messi",23, 1224.67);
		nuevoEquipo.agregarJugador(nuevoJugador);
		nuevoJugador=cargarNuevoJugador(1,"Messi",23, 1224.67);
		Boolean ve=nuevoEquipo.agregarJugador(nuevoJugador);
		assertFalse(ve);
	}
	
	// Jugador buscarJugador(Jugador jugadorBuscado) 
	@Test
	public void queSePuedaEncontrarJugadorExistente() {
		EquipoDeFutbol nuevoEquipo=cargarNuevoEquipoLocal("Cebollita");
		Jugador jugadorABuscar=cargarNuevoJugador(3,"Rodriguez",22, 999.54);
		Jugador jugadorEncontrado=nuevoEquipo.buscarJugador(jugadorABuscar);
		assertNotNull(jugadorEncontrado);
	}
	
	@Test
	public void queNoSePuedaEncontrarJugadorInexistente() {
		EquipoDeFutbol nuevoEquipo=cargarNuevoEquipoLocal("Cebollita");
		Jugador jugadorABuscar=cargarNuevoJugador(1,"Messi",23, 1224.67);
		Jugador jugadorEncontrado=nuevoEquipo.buscarJugador(jugadorABuscar);
		assertNull(jugadorEncontrado);
	}
		
	// Double calcularLaEdadPromedioDelEquipo() 
	@Test
	public void queSePuedaCalcularElPromedioEdadDelEquipo() {
		EquipoDeFutbol nuevoEquipo=cargarNuevoEquipoLocal("Cebollita");
		Double promedioEdadDelEquipo=nuevoEquipo.calcularLaEdadPromedioDelEquipo();
		Double ve=24.2;
		esIgual(ve,promedioEdadDelEquipo);	
	}
	
	//Double calcularElValorDelEquipo()
	@Test
	public void queSePuedaCalcularValorDelEquipo() {
		EquipoDeFutbol nuevoEquipo=cargarNuevoEquipoLocal("Cebollita");
		Double valorDelEquipo=nuevoEquipo.calcularElValorDelEquipo();
		Double ve=4889.61;
		esIgual(ve,valorDelEquipo);	
	}
	
	@Test
	public void queSePuedaDarDeAltaPartido() {
		EquipoDeFutbol localEquipo=cargarNuevoEquipoLocal("Cebollita");
		EquipoDeFutbol visitanteEquipo=cargarNuevoEquipoVisitante("Mandillu");
		PartidoDeFutbol nuevoPartido=new PartidoDeFutbol(localEquipo,visitanteEquipo);	
		assertNotNull(nuevoPartido);
	}
	
	//Cargar evento Gol void marcar(Evento gol)
	@Test
	public void queSePuedaRegistrarGolAFavorLocal() {
		EquipoDeFutbol localEquipo=cargarNuevoEquipoLocal("Cebollita");
		EquipoDeFutbol visitanteEquipo=cargarNuevoEquipoVisitante("Mandillu");
		PartidoDeFutbol nuevoPartido=new PartidoDeFutbol(localEquipo,visitanteEquipo);
		Integer golesLocales=nuevoPartido.getGolesLocal();
		Integer golesVisitantes=nuevoPartido.getGolesVisitante();
		Jugador nuevoJugador=cargarNuevoJugador(3,"Rodriguez",22, 999.54);//Jugador Local
		esIgual(0,golesLocales);
		esIgual(0,golesVisitantes);
		Evento nuevoEvento=cargarNuevoEvento(15,nuevoJugador,TipoDeEvento.GOL_A_FAVOR);
		nuevoPartido.marcar(nuevoEvento);
		golesLocales=nuevoPartido.getGolesLocal();
		golesVisitantes=nuevoPartido.getGolesVisitante();
		esIgual(1,golesLocales);
		esIgual(0,golesVisitantes);	
	}
	
	@Test
	public void queSePuedaRegistrarGolEnContraLocal() {
		EquipoDeFutbol localEquipo=cargarNuevoEquipoLocal("Cebollita");
		EquipoDeFutbol visitanteEquipo=cargarNuevoEquipoVisitante("Mandillu");
		PartidoDeFutbol nuevoPartido=new PartidoDeFutbol(localEquipo,visitanteEquipo);
		Integer golesLocales=nuevoPartido.getGolesLocal();
		Integer golesVisitantes=nuevoPartido.getGolesVisitante();
		Jugador nuevoJugador=cargarNuevoJugador(3,"Rodriguez",22, 999.54);//Jugador Local
		esIgual(0,golesLocales);
		esIgual(0,golesVisitantes);
		Evento nuevoEvento=cargarNuevoEvento(45,nuevoJugador,TipoDeEvento.GOL_EN_CONTRA);
		nuevoPartido.marcar(nuevoEvento);
		golesLocales=nuevoPartido.getGolesLocal();
		golesVisitantes=nuevoPartido.getGolesVisitante();
		esIgual(0,golesLocales);
		esIgual(1,golesVisitantes);	
	}
	
	@Test
	public void queSePuedaRegistrarGolAFavorVisitante() {
		EquipoDeFutbol localEquipo=cargarNuevoEquipoLocal("Cebollita");
		EquipoDeFutbol visitanteEquipo=cargarNuevoEquipoVisitante("Mandillu");
		PartidoDeFutbol nuevoPartido=new PartidoDeFutbol(localEquipo,visitanteEquipo);
		Integer golesLocales=nuevoPartido.getGolesLocal();
		Integer golesVisitantes=nuevoPartido.getGolesVisitante();
		Jugador nuevoJugador=cargarNuevoJugador(3,"Ovejero",22, 3455.54);//Jugador Visitante
		esIgual(0,golesLocales);
		esIgual(0,golesVisitantes);
		Evento nuevoEvento=cargarNuevoEvento(40,nuevoJugador,TipoDeEvento.GOL_A_FAVOR);
		nuevoPartido.marcar(nuevoEvento);
		golesLocales=nuevoPartido.getGolesLocal();
		golesVisitantes=nuevoPartido.getGolesVisitante();
		esIgual(0,golesLocales);
		esIgual(1,golesVisitantes);	
	}
	
	@Test
	public void queSePuedaRegistrarGolAContraVisitante() {
		EquipoDeFutbol localEquipo=cargarNuevoEquipoLocal("Cebollita");
		EquipoDeFutbol visitanteEquipo=cargarNuevoEquipoVisitante("Mandillu");
		PartidoDeFutbol nuevoPartido=new PartidoDeFutbol(localEquipo,visitanteEquipo);
		Integer golesLocales=nuevoPartido.getGolesLocal();
		Integer golesVisitantes=nuevoPartido.getGolesVisitante();
		Jugador nuevoJugador=cargarNuevoJugador(3,"Ovejero",22, 3455.54);//Jugador Visitante
		esIgual(0,golesLocales);
		esIgual(0,golesVisitantes);
		Evento nuevoEvento=cargarNuevoEvento(40,nuevoJugador,TipoDeEvento.GOL_EN_CONTRA);
		nuevoPartido.marcar(nuevoEvento);
		golesLocales=nuevoPartido.getGolesLocal();
		golesVisitantes=nuevoPartido.getGolesVisitante();
		esIgual(1,golesLocales);
		esIgual(0,golesVisitantes);	
	}
	
	@Test
	public void queNoSePuedaRegistrarGolAJugadorInexistente() {
		EquipoDeFutbol localEquipo=cargarNuevoEquipoLocal("Cebollita");
		EquipoDeFutbol visitanteEquipo=cargarNuevoEquipoVisitante("Mandillu");
		PartidoDeFutbol nuevoPartido=new PartidoDeFutbol(localEquipo,visitanteEquipo);
		Integer golesLocales=nuevoPartido.getGolesLocal();
		Integer golesVisitantes=nuevoPartido.getGolesVisitante();
		Jugador nuevoJugador=cargarNuevoJugador(22,"Mesi",22, 3455.54);//No esta en ninguno de los equipos
		esIgual(0,golesLocales);
		esIgual(0,golesVisitantes);
		Evento nuevoEvento=cargarNuevoEvento(40,nuevoJugador,TipoDeEvento.GOL_A_FAVOR);
		nuevoPartido.marcar(nuevoEvento);
		golesLocales=nuevoPartido.getGolesLocal();
		golesVisitantes=nuevoPartido.getGolesVisitante();
		esIgual(0,golesLocales);
		esIgual(0,golesVisitantes);	
	}
	
	private Jugador  cargarNuevoJugador(Integer numero, String nombre, Integer edad, Double precio) {
		Jugador jugador=new Jugador(numero, nombre, edad, precio);
		return jugador;		
	}
	
	private Evento  cargarNuevoEvento(Integer minuto, Jugador autor, TipoDeEvento tipo) {
		Evento evento=new Evento( minuto, autor, tipo);
		return evento;		
	}
	
	private EquipoDeFutbol  cargarNuevoEquipo(String nombreEquipo) {
		EquipoDeFutbol nuevoEquipo=new EquipoDeFutbol( nombreEquipo);
		return nuevoEquipo;		
	}
	
	
	private EquipoDeFutbol  cargarNuevoEquipoLocal(String nombreEquipo) {
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
	
	private EquipoDeFutbol  cargarNuevoEquipoVisitante(String nombreEquipo) {
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

	private void esIgual(Double ve, Double vo) {	
		Assert.assertEquals(ve, vo,0.01);
	}

	private void esIgual(Integer ve, Integer vo) {	
		Assert.assertEquals(ve, vo);
	}

}
