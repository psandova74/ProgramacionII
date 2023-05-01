package ColaSupermercado;

import org.junit.Assert;
import org.junit.Test;

public class TestSupermercado {

	@Test
	public void queLaColaEstaVacia() {
		Supermercado supermercado = dadoQueExisteSupermercado();
		Integer cantidad=cuandoConsultoCola(supermercado);
		entoncesLaColaEstaVacia(cantidad);
	}
	
	@Test
	public void queHayaClientesEnLaCola() {
		Supermercado supermercado = dadoQueExisteSupermercado();
		dadoQueIngresanClientesALaCola(supermercado,4);
		Integer cantidad=cuandoConsultoCola(supermercado);
		entoncesHayClientesEnLaCola(4,cantidad);
	}
	
	@Test
	public void queAlHabilitarLaColaRapidaSeReasignenClientes() {
		Supermercado supermercado = dadoQueExisteSupermercado();
		dadoQueIngresanClientesALaCola(supermercado,10);
		validoCantidadPorColas(supermercado, 10,0);		
		supermercado.aperturaColaRapida();
		validoCantidadPorColas(supermercado, 6,4);
		
	}
	
	private void entoncesHayClientesEnLaCola(Integer esperado, Integer cantidad) {
		Assert.assertTrue(cantidad.equals(esperado));
	}
	private void dadoQueIngresanClientesALaCola (Supermercado supermercado,Integer cantidad) {
		for (int i=0;i<cantidad;i++) {
			supermercado.agregarClienteALaCola(new Cliente(i,i+1));
		}
	}
	
	private void entoncesLaColaEstaVacia(Integer cantidad) {
		Assert.assertEquals(new Integer(0),cantidad);
	}
	
	private Supermercado dadoQueExisteSupermercado() {
		return new Supermercado();
	}
	
	private Integer cuandoConsultoCola(Supermercado supermercado) {
		Integer cantidad = supermercado.cantidadDeClientesEnCola();
		return cantidad;
	}
	
	private Integer cuandoConsultoColaRapida(Supermercado supermercado) {
		Integer cantidad = supermercado.cantidadDeClientesEnColaRapida();
		return cantidad;
	}
	
	private void validoCantidadPorColas(Supermercado supermercado, Integer cola, Integer colaRapida) {
		
		Integer cantidad=cuandoConsultoCola(supermercado);
		Integer cantidadRapida=cuandoConsultoColaRapida(supermercado);
		entoncesHayClientesEnLaCola(cola,cantidad);
		entoncesHayClientesEnLaCola(colaRapida,cantidadRapida);
	}

}
