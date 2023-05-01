package ar.edu.unlam.pb2.igualdad;

import org.junit.Assert;
import org.junit.Test;

public class FechaTest {
	
	@Test 
	public void testQueDosFechasSeanIdenticas(){
		//Preparacion
		Fecha fecha =new Fecha(6,9,2022);
		Fecha fecha2 =new Fecha(6,9,2022);
		//Ejecucion
		Boolean respuesta=fecha.equals(fecha2);
		//Contrastaccion
		Assert.assertTrue(respuesta);
	}
}