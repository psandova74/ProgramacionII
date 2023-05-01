package pb2.unlam.edu.ar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Set;
import java.util.TreeSet;

import org.junit.Assert;
import org.junit.Test;


public class TestTorneoDeFutbol {
	@Test
	public void queSePuedaDarDeAltaDt() {
		Dt nuevoDt=new Dt("Lionel","Argentina","Scalonni",234556661);
		assertNotNull(nuevoDt);
	}
	
	@Test
	public void queSePuedaDarDeAltaNuevoGol() {
		Jugador nuevoJugador= new Jugador("Lionel","Argentina","Messi",234556666,1,"delantero");
		Integer minuto=23;
		Gol nuevoGol=new Gol(nuevoJugador, minuto);
		assertNotNull(nuevoGol);
	}
	
	@Test
	public void queSePuedaCrearTorneoRegistrarEquipos() {
		Torneo nuevoTorneo=new Torneo("Mundial Qatar");
		cargarEquipoArgentina(nuevoTorneo);
		cargarEquipoArabia(nuevoTorneo);
		assertNotNull(nuevoTorneo);
	}
	
	@Test
	public void queSePuedaCrearPartido() throws PartidoNoEncontradoException, JugadorNoEncontradoException {
		Torneo nuevoTorneo=new Torneo("Mundial Qatar");
		cargarEquipoArgentina(nuevoTorneo);
		cargarEquipoArabia(nuevoTorneo);
		nuevoTorneo.crearPartido(1, "Argentina", "Arabia");
		nuevoTorneo.registrarGol(new Integer(1),new Integer(1), "Empate",new Integer(23));
		assertEquals(nuevoTorneo.obtenerResultadoPorPartido(new Integer(1)),"empate");
	}
	
	@Test
	public void queSePuedaMarcarGolLocal() throws PartidoNoEncontradoException, JugadorNoEncontradoException {
		Torneo nuevoTorneo=new Torneo("Mundial Qatar");
		cargarEquipoArgentina(nuevoTorneo);
		cargarEquipoArabia(nuevoTorneo);
		nuevoTorneo.crearPartido(1, "Argentina", "Arabia");
		nuevoTorneo.registrarGol(1, 1, "local", 23);
		assertEquals(nuevoTorneo.obtenerResultadoPorPartido(new Integer(1)),"local");
		
	}
	
	@Test
	public void queSePuedaMarcarGolVisitante() throws PartidoNoEncontradoException, JugadorNoEncontradoException {
		Torneo nuevoTorneo=new Torneo("Mundial Qatar");
		cargarEquipoArgentina(nuevoTorneo);
		cargarEquipoArabia(nuevoTorneo);
		nuevoTorneo.crearPartido(1, "Argentina", "Arabia");
		nuevoTorneo.registrarGol(1, 1, "visitante", 23);
		assertEquals(nuevoTorneo.obtenerResultadoPorPartido(new Integer(1)),"visitante");
		
	}
	
	@Test
	public void queNoSePuedaMarcarGolJugadorNoEncontrado() throws PartidoNoEncontradoException, JugadorNoEncontradoException {
		Torneo nuevoTorneo=new Torneo("Mundial Qatar");
		cargarEquipoArgentina(nuevoTorneo);
		cargarEquipoArabia(nuevoTorneo);
		nuevoTorneo.crearPartido(1, "Argentina", "Arabia");
		nuevoTorneo.registrarGol(1, 10, "local", 23);
		assertEquals(nuevoTorneo.obtenerResultadoPorPartido(new Integer(1)),"empate");
		
	}
	
	public void cargarEquipoArgentina(Torneo cargoTorneo) {
		Dt scalonni=new Dt("Lionel","Argentina","Scalonni",234556661);
		Jugador messi= new Jugador("Lionel","Argentina","Messi",234556662,1,"delantero");
		Jugador alvarez= new Jugador("Julian","Argentina","Alvarez",234556663,2,"delantero");
		Jugador pezzella= new Jugador("German","Argentina","Pezzella",234556664,3,"defensor");
		Jugador martinez= new Jugador("Lautaro","Argentina","Martinez",234556665,4,"defensor");
		Jugador armani= new Jugador("Franco","Argentina","Armani",234556666,5,"arquero");
		cargoTorneo.registrarMiembro(scalonni);
		cargoTorneo.registrarMiembro(messi);
		cargoTorneo.registrarMiembro(alvarez);
		cargoTorneo.registrarMiembro(pezzella);
		cargoTorneo.registrarMiembro(martinez);
		cargoTorneo.registrarMiembro(armani);	
	}
	
	public void cargarEquipoArabia(Torneo cargoTorneo) {
		Dt renard=new Dt("Herve","Arabia","Renard ",234556661);
		Jugador faraj= new Jugador("Salman","Arabia","Al-Faraj",234556662,1,"delantero");
		Jugador buraikan= new Jugador("Firas","Arabia","Al-Buraikan",234556663,2,"delantero");
		Jugador malki= new Jugador("Abdulellah","Arabia","Al-Malki",234556664,3,"defensor");
		Jugador shahran= new Jugador("Yasir","Arabia","Al-Shahran",234556665,4,"defensor");
		Jugador aqidi= new Jugador("Nawaf","Arabia","Al-Aqidi",234556666,5,"arquero");
		cargoTorneo.registrarMiembro(renard);
		cargoTorneo.registrarMiembro(faraj);
		cargoTorneo.registrarMiembro(buraikan);
		cargoTorneo.registrarMiembro(malki);
		cargoTorneo.registrarMiembro(shahran);
		cargoTorneo.registrarMiembro(aqidi);	
	}
}
