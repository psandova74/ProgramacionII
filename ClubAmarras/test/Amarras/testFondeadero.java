package Amarras;

import org.junit.Test;

import Amarras.Fondeadero;
import Amarras.Yate;
import Amarras.YateMotor;
import Amarras.YateVela;
import junit.framework.Assert;

public class testFondeadero {
	@Test
	public void queCreeYateMotor() {	
		Yate yateMotor=creaYateMotor("AZ1","Andres Borgeat",18.87,5.15,119.0,37,5500,5959,"2 x motores disel MAN RK2805",9000, 23,6500);
		Assert.assertNotNull(yateMotor);
		Double valorObtenido=yateMotor.obtenerPrecioDeAmarre();
		Double valorEsperado=13000.0;
		Assert.assertEquals(valorObtenido, valorEsperado);
	}
	@Test
	public void queCreeYateVela() {	
		Yate yateVela=creaYateVela("XXR","Sebastián Pardo", 6.90 ,2.7,13.45,5,1400,21.5,85, 133);
		Assert.assertNotNull(yateVela);
		Double valorObtenido=yateVela.obtenerPrecioDeAmarre();
		Double valorEsperado=11000.0;
		Assert.assertEquals(valorObtenido, valorEsperado);	
	}
	@Test
	public void queSeCreeFondeaderoVacio() {
		Fondeadero clubBlack=new Fondeadero(70);
		Integer valorObtenido=clubBlack.obtenerCantidadDeYatesAmarrados();
		Integer valorEsperado=0;
		Assert.assertNotNull(clubBlack);	
		Assert.assertEquals(valorObtenido, valorEsperado);
	}
	
	@Test
	public void queSeCreeFondeaderoIngresar2Yates() {	
		Fondeadero clubBlack=new Fondeadero(70);
		Yate yateMotor=creaYateMotor("AZ1","Andres Borgeat",18.87,5.15,119.0,37,5500,5959,"2 x motores disel MAN RK2805",9000, 23,6500);
		Yate yateVela=creaYateVela("XXR","Sebastián Pardo", 6.90 ,2.7,13.45,5,1400,21.5,85, 133);
		clubBlack.amararYate(yateMotor);
		clubBlack.amararYate(yateVela);
		Integer valorObtenido=clubBlack.obtenerCantidadDeYatesAmarrados();
		Integer valorEsperado=2;	
		Assert.assertEquals(valorObtenido, valorEsperado);
		Double recaudacionObtenida= clubBlack.obtenerRecaudacionTotal();
		Double recaudacionEsperada=24000.0;
		Assert.assertEquals(recaudacionObtenida, recaudacionEsperada);
		
	}	
	
	@Test
	public void queNoDejeIngresarMasYatesQueElLimite() {	
		Fondeadero clubBlack=new Fondeadero(1);
		Yate yateMotor=creaYateMotor("AZ1","Andres Borgeat",18.87,5.15,119.0,37,5500,5959,"2 x motores disel MAN RK2805",9000, 23,6500);
		Yate yateVela=creaYateVela("XXR","Sebastián Pardo", 6.90 ,2.7,13.45,5,1400,21.5,85, 133);
		clubBlack.amararYate(yateMotor);
		clubBlack.amararYate(yateVela);
		Integer valorObtenido=clubBlack.obtenerCantidadDeYatesAmarrados();
		Integer valorEsperado=1;	
		Assert.assertEquals(valorObtenido, valorEsperado);
	}
	
	@Test
	public void queNoPermitaIngresarDuplicados() {
		Fondeadero clubBlack=new Fondeadero(70);
		Yate yateMotor=creaYateMotor("AZ1","Andres Borgeat",18.87,5.15,119.0,37,5500,5959,"2 x motores disel MAN RK2805",9000, 23,6500);
		Yate yateVela=creaYateVela("XXR","Sebastián Pardo", 6.90 ,2.7,13.45,5,1400,21.5,85, 133);
		Yate yateMotor2=creaYateMotor("AZ1","Andres Borgeat",18.87,5.15,119.0,37,5500,5959,"2 x motores disel MAN RK2805",9000, 23,6500);
		clubBlack.amararYate(yateMotor);
		clubBlack.amararYate(yateVela);
		clubBlack.amararYate(yateMotor2);
		Integer valorObtenido=clubBlack.obtenerCantidadDeYatesAmarrados();
		Integer valorEsperado=2;	
		Assert.assertEquals(valorObtenido, valorEsperado);
	}

	@Test
	public void queElimineUnElemetoElegido() {
		Fondeadero clubBlack=new Fondeadero(70);
		Yate yateMotor=creaYateMotor("AZ1","Andres Borgeat",18.87,5.15,119.0,37,5500,5959,"2 x motores disel MAN RK2805",9000, 23,6500);
		Yate yateVela=creaYateVela("XXR","Sebastián Pardo", 6.90 ,2.7,13.45,5,1400,21.5,85, 133);
		Yate yateMotor2=creaYateMotor("AZ1","Andres Borgeat",18.87,5.15,119.0,37,5500,5959,"2 x motores disel MAN RK2805",9000, 23,6500);
		clubBlack.amararYate(yateMotor);
		clubBlack.amararYate(yateVela);
		clubBlack.desamarrarYate(yateMotor2);
		Integer valorObtenido=clubBlack.obtenerCantidadDeYatesAmarrados();
		Integer valorEsperado=1;	
		Assert.assertEquals(valorObtenido, valorEsperado);
	}
	
	private static Yate creaYateMotor(String nombre, String duenio, Double manga, Double calado, Double stola, Integer tripulacion,Integer pesoTonelada, Integer desplazamintoTonelada, String propulsion, Integer potenciaKW,Integer veicudadNudo, Integer autonomiaMN) {
		Yate yateMotor=new YateMotor(nombre, duenio, manga, calado, stola, tripulacion, pesoTonelada, desplazamintoTonelada, propulsion, potenciaKW,veicudadNudo,  autonomiaMN);
		return yateMotor;
	}
	
	private static Yate creaYateVela(String nombre, String duenio, Double manga, Double calado, Double stola, Integer tripulacion,Integer pesoKilo, Double alturaMastil,Integer superficieVelica,Integer superficieTotal) {
		Yate yateVela=new YateVela(nombre, duenio, manga, calado, stola, tripulacion, pesoKilo,  alturaMastil,superficieVelica,  superficieTotal);
		return yateVela;
	}
}
