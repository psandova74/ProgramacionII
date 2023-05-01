package pb2.unlam.edu.ar;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TestAeropuerto {
	@Test
	public void queSePuedaRegistrarPasajero() {
		Empresa ezeiza=new Empresa("Ezeiza");
		Pasajero nuevoPasajero=new Pasajero(23355,"Patricia");
		ezeiza.RegistarPasajero(nuevoPasajero);
		assertNotNull(ezeiza);
		assertNotNull(nuevoPasajero);
	}
	
	@Test
	public void queSePuedaRegistrarVuelo() {
		Empresa ezeiza=new Empresa("Ezeiza");
		Pasajero nuevoPasajero=new Pasajero(23355,"Patricia");
		ezeiza.RegistarPasajero(nuevoPasajero);
		assertNotNull(ezeiza);
		assertNotNull(nuevoPasajero);
	}
	
	@Test
	public void queSePuedaRegistrarPasajero() {
		Empresa ezeiza=new Empresa("Ezeiza");
		Pasajero nuevoPasajero=new Pasajero(23355,"Patricia");
		ezeiza.RegistarPasajero(nuevoPasajero);
		assertNotNull(ezeiza);
		assertNotNull(nuevoPasajero);
	}

}
