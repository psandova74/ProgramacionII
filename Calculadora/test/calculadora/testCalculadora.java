package calculadora;

import org.junit.Assert;
import org.junit.Test;

public class testCalculadora {
	
	@Test
	public void queSePuedaDividir() throws Exception {
		Integer valorEsperado=2;
		Calculadora calc = new Calculadora();
		Integer valorObtenido =calc.dividir(4,2);
		Assert.assertEquals(valorEsperado,valorObtenido);
	}

	@Test (expected = Exception.class)
	public void queSePuedaDividirPorCero() throws Exception {
		Integer valorEsperado=0;
		Calculadora calc = new Calculadora();
		Integer valorObtenido =calc.dividir(4,0);
		Assert.assertEquals(valorEsperado,valorObtenido);
	}
	
	@Test (expected = Exception.class)
	public void queElDividendoSeaCeroDivisorCeroLanzaException() throws Exception {
		Integer valorEsperado=0;
		Calculadora calc = new Calculadora();
		Integer valorObtenido =calc.dividir(0,0);
		Assert.assertEquals(valorEsperado,valorObtenido);
	}
	
	@Test
	public void queElDividendoSeaCero() throws Exception {
		Integer valorEsperado=0;
		Calculadora calc = new Calculadora();
		Integer valorObtenido =calc.dividir(0,4);
		Assert.assertEquals(valorEsperado,valorObtenido);
	}
	
	@Test void queTratoLaException() {
		Calculadora calc = new Calculadora();
		try {
			calc.dividir(4, 0);
		} catch (Exception e) {
			System.out.println("El error es: "+ e.getMessage());
		} 
		finally {
			calc =null;
		}
	}

	


}
