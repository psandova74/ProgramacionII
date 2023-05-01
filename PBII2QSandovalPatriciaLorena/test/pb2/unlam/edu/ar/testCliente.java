package pb2.unlam.edu.ar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Calendar;

import org.junit.Test;

public class testCliente {

	//• Añadir un cliente (nuevoCliente).
	@Test
	public void queSePuedaDarDeAltaCliente() {
		ServicioMecanico servicioMecanico=new ServicioMecanico("La tuerca loca");
		Calendar calendar = Calendar.getInstance();
		Long horaIngreso=Calendar.getInstance().getTimeInMillis()/60000;
		Cliente nuevoCliente=new Cliente(1, "Patricia", "1111111111");
		assertNotNull(nuevoCliente);
		servicioMecanico.ingresarClienteEspera(nuevoCliente, horaIngreso);
		assertEquals(servicioMecanico.cantidadColaEspera(),new Integer(1));
		

	}
	//• Atender a un cliente (atenderCliente). Retorna el cliente atendido y lanzará
	//una Exception en el caso de no haber clientes que atender.
	@Test
	public void queSePuedaAtenderUnCliente() throws NoHayClienteParaAtenderException {
		ServicioMecanico servicioMecanico=new ServicioMecanico("La tuerca loca");
		Calendar calendar = Calendar.getInstance();
		Cliente nuevoCliente1=new Cliente(1, "Patricia", "1111111111");
		Cliente nuevoCliente2=new Cliente(2, "Sivia", "2222222222");
		Cliente nuevoCliente3=new Cliente(3, "Alejandra", "33333333333");
		Cliente nuevoCliente4=new Cliente(4, "Soledad", "4444444444");
		Cliente nuevoCliente5=new Cliente(4, "Soledad", "4444444444");
		Long horaIngreso=Calendar.getInstance().getTimeInMillis()/60000;
		servicioMecanico.ingresarClienteEspera(nuevoCliente1, horaIngreso);
		horaIngreso=Calendar.getInstance().getTimeInMillis()/60000;
		servicioMecanico.ingresarClienteEspera(nuevoCliente2, horaIngreso);
		horaIngreso=Calendar.getInstance().getTimeInMillis()/60000;
		servicioMecanico.ingresarClienteEspera(nuevoCliente3, horaIngreso);
		horaIngreso=Calendar.getInstance().getTimeInMillis()/60000;
		servicioMecanico.ingresarClienteEspera(nuevoCliente4, horaIngreso);
		//No deja entrar repetido el cliente
		horaIngreso=Calendar.getInstance().getTimeInMillis()/60000;
		servicioMecanico.ingresarClienteEspera(nuevoCliente5, horaIngreso);
		assertEquals(servicioMecanico.cantidadColaEspera(),new Integer(4));
		//Se atiende un cliente descuenta la cola de espera. Ingresa a la de Atendidos
		horaIngreso=Calendar.getInstance().getTimeInMillis()/60000;
		servicioMecanico.atenderUnCliente(horaIngreso);	
		
		assertEquals(servicioMecanico.cantidadColaEspera(),new Integer(3));
		assertEquals(servicioMecanico.cantidadColaAtendidos(),new Integer(1));
	}
	
	//• Obtener el tiempo medio de espera de los clientes que aún no han sido
	//atendidos (tiempoEsperaNoAtendidos). Expresado en minutos.
	@Test
	public void queSePuedaHacerTiempoEsperaPromedioNoAtendidos() throws NoHayClienteParaAtenderException {
		ServicioMecanico servicioMecanico=new ServicioMecanico("La tuerca loca");
		Calendar calendar = Calendar.getInstance();
		Cliente nuevoCliente1=new Cliente(1, "Patricia", "1111111111");
		Cliente nuevoCliente2=new Cliente(2, "Sivia", "2222222222");
		Cliente nuevoCliente3=new Cliente(3, "Alejandra", "33333333333");
		Cliente nuevoCliente4=new Cliente(4, "Soledad", "4444444444");
		Cliente nuevoCliente5=new Cliente(4, "Soledad", "4444444444");
		Long horaIngreso=Calendar.getInstance().getTimeInMillis()/60000;
		servicioMecanico.ingresarClienteEspera(nuevoCliente1, horaIngreso);
		horaIngreso=Calendar.getInstance().getTimeInMillis()/60000;
		servicioMecanico.ingresarClienteEspera(nuevoCliente2, horaIngreso);
		horaIngreso=Calendar.getInstance().getTimeInMillis()/60000;
		servicioMecanico.ingresarClienteEspera(nuevoCliente3, horaIngreso);
		horaIngreso=Calendar.getInstance().getTimeInMillis()/60000;
		servicioMecanico.ingresarClienteEspera(nuevoCliente4, horaIngreso);
		//• Obtener cantidad de clientes en espera
		//(obtenerCantidadClientesEnEspera).
		assertEquals(servicioMecanico.cantidadColaEspera(),new Integer(4));
		horaIngreso=Calendar.getInstance().getTimeInMillis()/60000;
		servicioMecanico.tiempoPromedioDeEspera(horaIngreso);
		assertEquals(servicioMecanico.tiempoPromedioDeEspera(horaIngreso),new Long (0));		
	}
	
	
	//• Obtener el tiempo medio de espera de los clientes ya atendidos (tiempoEsperaAtendidos).
	@Test
	public void queSePuedaHacerTiempoEsperaPromedioDeAtendidos() throws NoHayClienteParaAtenderException {
		ServicioMecanico servicioMecanico=new ServicioMecanico("La tuerca loca");
		Calendar calendar = Calendar.getInstance();
		Cliente nuevoCliente1=new Cliente(1, "Patricia", "1111111111");
		Cliente nuevoCliente2=new Cliente(2, "Sivia", "2222222222");
		Cliente nuevoCliente3=new Cliente(3, "Alejandra", "33333333333");
		Cliente nuevoCliente4=new Cliente(4, "Soledad", "4444444444");
		Cliente nuevoCliente5=new Cliente(4, "Soledad", "4444444444");
		Long horaIngreso=Calendar.getInstance().getTimeInMillis()/60000;
		servicioMecanico.ingresarClienteEspera(nuevoCliente1, horaIngreso);
		horaIngreso=Calendar.getInstance().getTimeInMillis()/60000;
		servicioMecanico.ingresarClienteEspera(nuevoCliente2, horaIngreso);
		horaIngreso=Calendar.getInstance().getTimeInMillis()/60000;
		servicioMecanico.ingresarClienteEspera(nuevoCliente3, horaIngreso);
		horaIngreso=Calendar.getInstance().getTimeInMillis()/60000;
		servicioMecanico.ingresarClienteEspera(nuevoCliente4, horaIngreso);
		assertEquals(servicioMecanico.cantidadColaEspera(),new Integer(4));
		//Se atiende un cliente descuenta la cola de espera
		horaIngreso=Calendar.getInstance().getTimeInMillis()/60000;
		servicioMecanico.atenderUnCliente(horaIngreso);	
		horaIngreso=Calendar.getInstance().getTimeInMillis()/60000;
		servicioMecanico.atenderUnCliente(horaIngreso);	
		horaIngreso=Calendar.getInstance().getTimeInMillis()/60000;
		servicioMecanico.atenderUnCliente(horaIngreso);	
		horaIngreso=Calendar.getInstance().getTimeInMillis()/60000;
		servicioMecanico.atenderUnCliente(horaIngreso);	
		
		//• Obtener cantidad de clientes atendidos (obtenerCantidadClientesAtenidos).
		assertEquals(servicioMecanico.cantidadColaAtendidos(),new Integer(4));
		assertEquals(servicioMecanico.tiempoPromedioDeEsperaDeAtendidos(),new Long(0));

	}

	@Test (expected = NoHayClienteParaAtenderException.class)
	public void queSeDeExcepcionCuandoIntentaQu() throws NoHayClienteParaAtenderException {
		ServicioMecanico servicioMecanico=new ServicioMecanico("La tuerca loca");
		Calendar calendar = Calendar.getInstance();
		Long horaIngreso=Calendar.getInstance().getTimeInMillis()/60000;
		Cliente nuevoCliente=new Cliente(1, "Patricia", "1111111111");
		assertNotNull(nuevoCliente);
		servicioMecanico.ingresarClienteEspera(nuevoCliente, horaIngreso);
		assertEquals(servicioMecanico.cantidadColaEspera(),new Integer(1));
		
		horaIngreso=Calendar.getInstance().getTimeInMillis()/60000;
		servicioMecanico.atenderUnCliente(horaIngreso);	
		assertEquals(servicioMecanico.cantidadColaEspera(),new Integer(0));
		horaIngreso=Calendar.getInstance().getTimeInMillis()/60000;
		servicioMecanico.atenderUnCliente(horaIngreso);	
		assertEquals(servicioMecanico.cantidadColaEspera(),new Integer(0));

	}
	
	
	
}
