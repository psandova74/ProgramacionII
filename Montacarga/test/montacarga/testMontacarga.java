package montacarga;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testMontacarga {
	@Test
	public void testObtenerCargaConMotacargasVacio() {
		Montacarga newMontacarga= new Montacarga(1000.0);
		Double pesoActual=newMontacarga.obtenerCarga();
		Double valorEsperado=0.0;
		assertEquals(valorEsperado,pesoActual);	
	}
	
	@Test
	public void testObtenerCargaConUnaCargaRealizada() {
		Montacarga newMontacarga= new Montacarga(1000.0);
		Carga primerCarga=new Carga("Fideos",10.0);
		newMontacarga.cargar(primerCarga);
		Double cantidadDeCargasActual=newMontacarga.obtenerCarga();
		Double valorEsperado=10.0;
		assertEquals(valorEsperado,cantidadDeCargasActual);
		
	}
	
	@Test
	public void testPesoMaximoNoPermiteSuperarCarga() {
		Montacarga newMontacarga= new Montacarga(1000.0);
		Carga primerCarga=new Carga("Fideos",500.0);
		Carga segundaCarga=new Carga("Fideos",501.0);
		newMontacarga.cargar(primerCarga);
		newMontacarga.cargar(segundaCarga);
		Double pesoActual=newMontacarga.obtenerCarga();
		Double valorEsperado=500.0;
		assertEquals(valorEsperado,pesoActual);
		
	}

	@Test
	public void testObtenerCargaConMotacargasConCarga() {
		Montacarga newMontacarga= new Montacarga(1000.0);
		Carga primerCarga=new Carga("Fideos",10.0);
		newMontacarga.cargar(primerCarga);
		Double pesoActual=newMontacarga.obtenerCarga();
		Double valorEsperado=10.0;
		assertEquals(valorEsperado,pesoActual);	
	}
	@Test
	public void testObtenerCargaSiMePasoCarga() {
		Montacarga newMontacarga= new Montacarga(1000.0);
		Carga primerCarga=new Carga("Fideos",1000.0);
		newMontacarga.cargar(primerCarga);
		Double pesoActual=newMontacarga.obtenerCarga();
		Double valorEsperado=1000.0;
		assertEquals(valorEsperado,pesoActual);	
		newMontacarga.cargar(primerCarga);
		pesoActual=newMontacarga.obtenerCarga();
		assertEquals(valorEsperado,pesoActual);	
	}
	@Test
	public void queMePermitaObtenerPromedioSinHaberDescargado() {
		Montacarga newMontacarga= new Montacarga(1000.0);
		Carga primerCarga=new Carga("Fideos",10.0);
		newMontacarga.cargar(primerCarga);
		Double pesoPromedioActual=newMontacarga.obtenerCargaPromedio();
		Double valorEsperado=0.0;
		assertEquals(valorEsperado,pesoPromedioActual);
	}
	@Test
	public void queMePermitaObtenerPromedioHabiendoDescargado() {
		Montacarga newMontacarga= new Montacarga(1000.0);
		Carga primerCarga=new Carga("Fideos",10.0);
		newMontacarga.cargar(primerCarga);
		newMontacarga.descargar();
		Double pesoPromedioActual=newMontacarga.obtenerCargaPromedio();
		Double valorEsperado=10.0;
		assertEquals(valorEsperado,pesoPromedioActual);	
	}
	@Test
	public void queMePermitaObtenerPromedioYaDescargadoYvueltoACargar() {
		Montacarga newMontacarga= new Montacarga(1000.0);
		Carga primerCarga=new Carga("Fideos",10.0);
		newMontacarga.cargar(primerCarga);
		newMontacarga.descargar();
		newMontacarga.cargar(primerCarga);
		Double pesoPromedioActual=newMontacarga.obtenerCargaPromedio();
		Double valorEsperado=10.0;
		assertEquals(valorEsperado,pesoPromedioActual);			
	}
	
}
