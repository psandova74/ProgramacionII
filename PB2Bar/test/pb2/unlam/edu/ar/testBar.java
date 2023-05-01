package pb2.unlam.edu.ar;

import org.junit.Assert;
import org.junit.Test;

public class testBar {
	@Test
	public void quIngresenClientesAlBar() {
		Bar bar = new Bar();
		Cliente juan = new Cliente("Juan");
		bar.ingresarCliente(juan);
		Integer valorEsperado = 1;
		Assert.assertEquals(valorEsperado, bar.clientesActuales());
	}
	
	@Test
	public void queNoSeAdmitenDuplicados() {
		//para pasar de un linkedlist a treeset
		//el CONTAINS usa el equals del objeto
	}
	
	@Test
	public void queAlAlbrirElBarEstaVacio() {
		Bar bar = new Bar();
		Integer valorEsperado = 0;
		Assert.assertEquals(valorEsperado, bar.clientesActuales());
	}
	
	@Test
	public void queSePresentenOrdenadosPorNombre() {
		String primero = "Jos�";
		String ultimo = "Juan";
		Bar bar = new Bar();
		Cliente juan = new Cliente("Juan",25);
		Cliente jose = new Cliente("Jos�",24);
		bar.ingresarCliente(juan);
		bar.ingresarCliente(jose);
		//Integer valorEsperado = 2;
		String primeroObtenido = bar.presentarClientes().first().getNombre();
		String ultimoObtenido = bar.presentarClientes().last().getNombre();
		Assert.assertEquals(primero, primeroObtenido);
	}
	
	@Test
	public void queSePresentenOrdenadosPorEdad() {
		String primero = "Martin";
		String ultimo = "Jos�";
		Bar bar = new Bar();
		Cliente juan = new Cliente("Juan",21);
		Cliente jose = new Cliente("Jos�",24);
		Cliente martin = new Cliente("Martin",18);
	
		bar.ingresarCliente(juan);
		bar.ingresarCliente(jose);
		bar.ingresarCliente(martin);
		
		//Integer valorEsperado = 2;
		String primeroObtenido = bar.presentarClientesOrdenadasPorEdad().first().getNombre();
		String ultimoObtenido = bar.presentarClientesOrdenadasPorEdad().last().getNombre();
		Assert.assertEquals(primero, primeroObtenido);
	}

}
