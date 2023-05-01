package LosNoHomero;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

public class BartTest {
	@Test
	public void queNoDejeIngresarClientesSiElBarEstaCerrado() throws ClienteNoEncontradoException {
		Bar bar = new Bar("Bar de Homero");
		Persona c1 = new Persona("Patricia", 23);
		assertFalse(bar.agregarCliente(c1));
	}

	@Test
	public void quePermitaCerrarElBarSoloSiEsteEstaVacio() throws ClienteNoEncontradoException {
		Bar bar = new Bar("Bar de Homero");
		Persona c1 = new Persona("Patricia", 25);
		bar.abrirBar();
		bar.agregarCliente(c1);
		bar.cerrarBar();
		assertTrue(bar.getAbierto());
	}

	@Test
	public void queNoHayaDosClientesIguales() {
		Persona c1 = new Persona("Patricia", 25);
		Persona c2 = new Persona("Patricia", 25);
		assertEquals(c1.getNombre(), c2.getNombre());
	}

	@Test 
	public void queSePuedaBuscarUnClientePorSuNombre() throws ClienteNoEncontradoException {
		Bar bar = new Bar("Bar de Homero");
		Persona c1 = new Persona("Patricia", 25);
		Persona cbuscar = new Persona("Patricia", 25);
		bar.abrirBar();
		bar.agregarCliente(c1);
		assertEquals(bar.buscarCliente("Patricia"), cbuscar);
	}

	@Test
	public void queNoPuedanIngresarDosClientesConElMismoNombre() throws ClienteNoEncontradoException {
		Bar bar = new Bar("Bar de Homero");
		Persona c1 = new Persona("Patricia", 25);
		Persona c2 = new Persona("Patricia", 44);
		bar.abrirBar();
		bar.agregarCliente(c1);
		assertFalse(bar.agregarCliente(c2));
	}

	@Test
	public void queSePuedaEliminarUnCliente() throws ClienteNoEncontradoException {
		Bar bar = new Bar("Bar de Homero");
		Persona c1 = new Persona("Patricia", 25);
		Persona cEliminar = new Persona("Patricia", 25);
		bar.abrirBar();
		bar.agregarCliente(c1);
		bar.quitarCliente(c1);
		assertNotEquals(bar.buscarCliente("Patricia"), cEliminar);
	}

	@Test
	public void queSePuedanOrdenarClientesAlfabeticamente() throws ClienteNoEncontradoException {
		Bar bar = new Bar("Bar de Homero");
		Persona c1 = new Persona("Ag", 15);
		Persona c2 = new Persona("Br", 11);
		Persona c3 = new Persona("Cr", 19);
		Persona c4 = new Persona("Dl", 22); 
		Persona c5 = new Persona("Fp", 18);
		Set <Persona> clientes = new HashSet<>();
		clientes.add(c1);
		clientes.add(c2);
		clientes.add(c3);
		clientes.add(c4);
		clientes.add(c5);
		
		//Persona [] arrayClientes = new Persona[clientes.size()];
		//bar.getClientes().toArray(arrayClientes);
		//Persona [] arrayClientes.to ?????
		
		//assertTrue(arrayClientes[0].getNombre().contentEquals("Ag")  );	

	}
}
