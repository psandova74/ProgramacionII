package transporte;

import org.junit.Test;

import junit.framework.Assert;


public class testEmpresaTransporte {
	@Test
	public void queAutobusIngresePasajeros() {
		EmpresaTransporte ideal=new EmpresaTransporte("Ideal");
		Vehiculo autobus=cargoAutobusConPasajeros(10);
		Integer vo=autobus.cantidadPasajeros();
		Integer ve=10;
		Assert.assertEquals(ve, vo);
		
		
	}
	
	@Test
	public void queVehiculoIngresePasajeros() {
		EmpresaTransporte ideal=new EmpresaTransporte("Ideal");
		Vehiculo automovil=cargoAutomovilConPasajeros(2);
		Integer vo=automovil.cantidadPasajeros();
		Integer ve=2;
		Assert.assertEquals(ve, vo);	
	}
	
	@Test
	public void queVehiculoNoSupereMaximoPasajeros() {
		EmpresaTransporte ideal=new EmpresaTransporte("Ideal");
		Vehiculo automovil=cargoAutomovilConPasajeros(10);
		Integer vo=automovil.cantidadPasajeros();
		Integer ve=3;
		Assert.assertEquals(ve, vo);	
	}
	
	@Test
	public void queAutobusNoSupereMaximoPasajeros() {
		EmpresaTransporte ideal=new EmpresaTransporte("Ideal");
		Vehiculo autobus=cargoAutobusConPasajeros(40);
		Integer vo=autobus.cantidadPasajeros();
		Integer ve=20;
		Assert.assertEquals(ve, vo);
		
		
	}
	
	
	@Test
	public void queMotocicletaNoSupereMaximoPasajeros() {
		EmpresaTransporte ideal=new EmpresaTransporte("Ideal");
		Persona chofer= new Persona(1, "Felipe", TipoPersona.CHOFER);
		Vehiculo motocicleta=new Motocicleta(chofer);
		Persona pasajero1=new Persona(1,"Pasajero 1", TipoPersona.PASAJERO);
		Persona pasajero2=new Persona(2,"Pasajero 2", TipoPersona.PASAJERO);
		
		motocicleta.agregarPasajero(pasajero1);
		motocicleta.agregarPasajero(pasajero2);
		Integer vo=motocicleta.cantidadPasajeros();
		Integer ve=1;
		Assert.assertEquals(ve, vo);
		
		
	}
	
	
	
	public Vehiculo cargoAutomovilConPasajeros(Integer cantidad) {
		Persona chofer= new Persona(1, "Felipe", TipoPersona.CHOFER);
		Vehiculo vehiculo=new Automovil(chofer);
		for (Integer i=0;i<cantidad;i++) {
			Persona pasajero=new Persona((i+1),"Pasajero", TipoPersona.PASAJERO);
			vehiculo.agregarPasajero(pasajero);
		}
		return vehiculo;
	}
	
	public Vehiculo cargoAutobusConPasajeros(Integer cantidad) {
		Persona chofer= new Persona(1, "Felipe", TipoPersona.CHOFER);
		Vehiculo vehiculo=new Autobus(chofer);
		for (Integer i=0;i<cantidad;i++) {
			Persona pasajero=new Persona((i+1),"Pasajero", TipoPersona.PASAJERO);
			vehiculo.agregarPasajero(pasajero);
		}
		return vehiculo;
	}

}
