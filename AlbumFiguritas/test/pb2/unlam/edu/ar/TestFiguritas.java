package pb2.unlam.edu.ar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class TestFiguritas {
	
	@Test
	public void queSePuedaCrearUnaFigurita() {
		Figurita figurita=new Figurita(1,'C', "Argentina","Lionel Messi",1000000.0);
		assertNotNull(figurita);
	}
	
	@Test
	public void queSePuedaCrearUnAdministrador() {
		Administrar usuarioAdm=new Administrador("Patricia");
		assertNotNull(usuarioAdm);
	}
	
	@Test
	public void queSePuedaCrearUnUsuarioFinal() {
		Coleccionar usuarioFinal=new UsuarioFinal("Hector");
		assertNotNull(usuarioFinal);		
	}
	
	@Test
	public void queUnAdministradorPuedaAgregarUnaFigurita() throws CodigoExistenteException {
		Administrar usuarioAdm=new Administrador("Patricia");
		Figurita figurita=new Figurita(1,'C', "Argentina","Lionel Messi",1000000.0);
		usuarioAdm.agregarUnaFigurita(figurita);
		assertEquals(new Integer (1),usuarioAdm.cantidadFiguritasExistentes());
	}
	
	@Test
	public void queUnUsuarioFinalPuedaAgregarUnaFigurita() throws CodigoExistenteException, FiguritaInexistenteException{
		Administrar usuarioAdm=new Administrador("Patricia");
		Figurita figurita=new Figurita(1,'C', "Argentina","Lionel Messi",1000000.0);
		usuarioAdm.agregarUnaFigurita(figurita);
		
		
		Coleccionar usuarioFinal=new UsuarioFinal("Hector");
		figurita=new Figurita(1,'C', "Argentina","Lionel Messi",1000000.0);
		usuarioFinal.agregarUnaFiguritaStock(usuarioAdm,figurita);
		assertEquals(new Integer (1),usuarioFinal.cantidadFiguritasStock());
		
	}
	
	@Test
	public void queLasFiguritasAgregadasDeFormaDesordenadaQuedenOrdenadas() throws CodigoExistenteException {
		Administrar usuarioAdm=new Administrador("Patricia");
		Figurita figurita=new Figurita(1,'C', "Argentina","Lionel Messi",1000000.0);
		usuarioAdm.agregarUnaFigurita(figurita);
		figurita=new Figurita(5,'H', "Portugal","Cristiano Ronaldo",1000000.0);
		usuarioAdm.agregarUnaFigurita(figurita);
		figurita=new Figurita(5,'D', "Francia","Hugo Lloris",1000000.0);
		usuarioAdm.agregarUnaFigurita(figurita);
		figurita=new Figurita(5,'E', "Alemania","Manuel Neuer",1000000.0);
		usuarioAdm.agregarUnaFigurita(figurita);
		figurita=new Figurita(5,'E', "Espana","Sergio Busquets",1000000.0);
		usuarioAdm.agregarUnaFigurita(figurita);
		figurita=new Figurita(5,'C', "Arabia","Abdulellah Al-Malki",1000000.0);
		usuarioAdm.agregarUnaFigurita(figurita);
		assertEquals(new Integer (6),usuarioAdm.cantidadFiguritasExistentes());
		//Posicion: 1 Grupo: C Seleccion: Arabia Id: 5
		assertEquals("Abdulellah Al-Malki",usuarioAdm.obtenerFiguritaExistentePorPosicion(new Integer(1)).getNombre());
		//Posicion: 2 Grupo: C Seleccion: Argentina Id: 1
		assertEquals("Lionel Messi",usuarioAdm.obtenerFiguritaExistentePorPosicion(new Integer(2)).getNombre());
		//Posicion: 3 Grupo: D Seleccion: Francia Id: 5
		assertEquals("Hugo Lloris",usuarioAdm.obtenerFiguritaExistentePorPosicion(new Integer(3)).getNombre());
		//Posicion: 4 Grupo: E Seleccion: Alemania Id: 5
		assertEquals("Manuel Neuer",usuarioAdm.obtenerFiguritaExistentePorPosicion(new Integer(4)).getNombre());
		//Posicion: 5 Grupo: E Seleccion: Espana Id: 5
		assertEquals("Sergio Busquets",usuarioAdm.obtenerFiguritaExistentePorPosicion(new Integer(5)).getNombre());
		//Posicion: 6 Grupo: H Seleccion: Portugal Id: 5
		assertEquals("Cristiano Ronaldo",usuarioAdm.obtenerFiguritaExistentePorPosicion(new Integer(6)).getNombre());
	}
	
	@Test
	public void queUnAdministradorNoPuedaAgregarUnaFiguritaExistente() throws CodigoExistenteException {
		Administrar usuarioAdm=new Administrador("Patricia");
		Figurita figurita=new Figurita(1,'C', "Argentina","Lionel Messi",1000000.0);
		usuarioAdm.agregarUnaFigurita(figurita);
		figurita=new Figurita(1,'C', "Argentina","Pepito",1000.0);
		assertEquals(new Integer (1),usuarioAdm.cantidadFiguritasExistentes());	
	}
	
	@Test
	public void queUnUsuarioFinalSiPuedaAgregarFiguritasExistentes() throws FiguritaInexistenteException, CodigoExistenteException {
		Administrar usuarioAdm=new Administrador("Patricia");
		Figurita figurita=new Figurita(1,'C', "Argentina","Lionel Messi",1000000.0);
		usuarioAdm.agregarUnaFigurita(figurita);
		
		Coleccionar usuarioFinal=new UsuarioFinal("Hector");
		figurita=new Figurita(1,'C', "Argentina","Lionel Messi",1000000.0);
		usuarioFinal.agregarUnaFiguritaStock(usuarioAdm,figurita);
		usuarioFinal.agregarUnaFiguritaStock(usuarioAdm,figurita);
		assertEquals(new Integer (2),usuarioFinal.cantidadFiguritasStock());
	}
	
	@Test
	public void queUnUsuarioFinalPuedaPegarUnaFigurita() throws FiguritaNoDisponibleException, FiguritaRepetidaException, CodigoExistenteException, FiguritaInexistenteException {
		Administrar usuarioAdm=new Administrador("Patricia");
		Figurita figurita=new Figurita(1,'C', "Argentina","Lionel Messi",1000000.0);
		usuarioAdm.agregarUnaFigurita(figurita);
		figurita=new Figurita(5,'D', "Francia","Hugo Lloris",1000000.0);
		usuarioAdm.agregarUnaFigurita(figurita);
		
		Coleccionar usuarioFinal=new UsuarioFinal("Hector");
		figurita=new Figurita(1,'C', "Argentina","Lionel Messi",1000000.0);
		usuarioFinal.agregarUnaFiguritaStock(usuarioAdm,figurita);
		usuarioFinal.agregarUnaFiguritaStock(usuarioAdm,figurita);
		figurita=new Figurita(5,'D', "Francia","Hugo Lloris",1000000.0);
		usuarioFinal.agregarUnaFiguritaStock(usuarioAdm,figurita);
		usuarioFinal.agregarFiguritaAlAlbum(figurita);
		
		assertEquals(new Integer (1),usuarioFinal.cantidadFiguritasAlbum());
		
	}
	
	@Test  (expected=FiguritaRepetidaException.class)
	public void queUnUsuarioFinalNoPuedaPegarUnaFiguritaRepetida() throws FiguritaNoDisponibleException, FiguritaRepetidaException, CodigoExistenteException, FiguritaInexistenteException {
		Administrar usuarioAdm=new Administrador("Patricia");
		Figurita figurita=new Figurita(1,'C', "Argentina","Lionel Messi",1000000.0);
		usuarioAdm.agregarUnaFigurita(figurita);
		figurita=new Figurita(5,'D', "Francia","Hugo Lloris",1000000.0);
		usuarioAdm.agregarUnaFigurita(figurita);
		
		Coleccionar usuarioFinal=new UsuarioFinal("Hector");
		figurita=new Figurita(1,'C', "Argentina","Lionel Messi",1000000.0);
		usuarioFinal.agregarUnaFiguritaStock(usuarioAdm,figurita);
		usuarioFinal.agregarUnaFiguritaStock(usuarioAdm,figurita);
		
		figurita=new Figurita(5,'D', "Francia","Hugo Lloris",1000000.0);
		usuarioFinal.agregarUnaFiguritaStock(usuarioAdm,figurita);
		usuarioFinal.agregarUnaFiguritaStock(usuarioAdm,figurita);
		
		usuarioFinal.agregarFiguritaAlAlbum(figurita);
		usuarioFinal.agregarFiguritaAlAlbum(figurita);
		assertEquals(new Integer (1),usuarioFinal.cantidadFiguritasAlbum());
	}
	
	@Test
	public void queSePuedaRealizarElIntercambioDeFiguritasEntreDosUsuariosFinales() throws FiguritaNoDisponibleException, FiguritaInexistenteException, CodigoExistenteException {
		Administrar usuarioAdm=new Administrador("Patricia");
		Figurita figurita1=new Figurita(1,'C', "Argentina","Lionel Messi",1000000.0);
		Figurita figurita2=new Figurita(5,'D', "Francia","Hugo Lloris",1000000.0);
		usuarioAdm.agregarUnaFigurita(figurita1);
		usuarioAdm.agregarUnaFigurita(figurita2);
		
		Coleccionar usuarioFinal1=new UsuarioFinal("Lourdes");
		usuarioFinal1.agregarUnaFiguritaStock(usuarioAdm,figurita1);
		assertEquals("Lionel Messi",usuarioFinal1.devolverPrimerFigurita().getNombre());
		
		Coleccionar usuarioFinal2=new UsuarioFinal("Milagros");
		usuarioFinal2.agregarUnaFiguritaStock(usuarioAdm,figurita2);
		assertEquals("Hugo Lloris",usuarioFinal2.devolverPrimerFigurita().getNombre());
		
		usuarioFinal1.intercambioFiguritaTo(usuarioAdm,figurita1,usuarioFinal2,figurita2);
		
		assertEquals("Hugo Lloris",usuarioFinal1.devolverPrimerFigurita().getNombre());
		assertEquals("Lionel Messi",usuarioFinal2.devolverPrimerFigurita().getNombre());
		
	}
	
	@Test (expected=FiguritaNoDisponibleException.class)
	public void queNoSePuedaIntercambiarUnaFiguritaDeUnUsuarioQueNoLaTenga() throws FiguritaNoDisponibleException, FiguritaInexistenteException, CodigoExistenteException {
		Administrar usuarioAdm=new Administrador("Patricia");
		Figurita figurita1=new Figurita(1,'C', "Argentina","Lionel Messi",1000000.0);
		Figurita figurita2=new Figurita(5,'D', "Francia","Hugo Lloris",1000000.0);
		usuarioAdm.agregarUnaFigurita(figurita1);
		usuarioAdm.agregarUnaFigurita(figurita2);
		
		Coleccionar usuarioFinal1=new UsuarioFinal("Lourdes");
		usuarioFinal1.agregarUnaFiguritaStock(usuarioAdm,figurita1);
		assertEquals("Lionel Messi",usuarioFinal1.devolverPrimerFigurita().getNombre());
		Coleccionar usuarioFinal2=new UsuarioFinal("Milagros");
		usuarioFinal1.intercambioFiguritaTo(usuarioAdm,figurita1,usuarioFinal2,figurita2);
		
		assertEquals("Hugo Lloris",usuarioFinal1.devolverPrimerFigurita().getNombre());
		assertEquals("Lionel Messi",usuarioFinal2.devolverPrimerFigurita().getNombre());

	}
	
	@Test (expected=FiguritaNoDisponibleException.class)
	public void queNoSePuedaIntercambiarUnaFiguritaDeUnUsuarioQueYaLaHayaPegado() throws FiguritaNoDisponibleException, FiguritaRepetidaException, FiguritaInexistenteException, CodigoExistenteException {
		Administrar usuarioAdm=new Administrador("Patricia");
		Figurita figurita1=new Figurita(1,'C', "Argentina","Lionel Messi",1000000.0);
		Figurita figurita2=new Figurita(5,'D', "Francia","Hugo Lloris",1000000.0);
		usuarioAdm.agregarUnaFigurita(figurita1);
		usuarioAdm.agregarUnaFigurita(figurita2);
		
		Coleccionar usuarioFinal1=new UsuarioFinal("Lourdes");
		usuarioFinal1.agregarUnaFiguritaStock(usuarioAdm,figurita1);
		assertEquals("Lionel Messi",usuarioFinal1.devolverPrimerFigurita().getNombre());

		Coleccionar usuarioFinal2=new UsuarioFinal("Milagros");
		usuarioFinal2.agregarUnaFiguritaStock(usuarioAdm,figurita2);
		assertEquals("Hugo Lloris",usuarioFinal2.devolverPrimerFigurita().getNombre());
		usuarioFinal2.agregarFiguritaAlAlbum(figurita2);
			
		usuarioFinal1.intercambioFiguritaTo(usuarioAdm,figurita1,usuarioFinal2,figurita2);
		
		assertEquals("Hugo Lloris",usuarioFinal1.devolverPrimerFigurita().getNombre());
		assertEquals("Lionel Messi",usuarioFinal2.devolverPrimerFigurita().getNombre());
	}
	
}
