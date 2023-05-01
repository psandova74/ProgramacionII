package Figura2;

import static org.junit.Assert.*;
import org.junit.Test;

import Figura.Punto;

public class testFigura {

	@Test
	public void creoPunto() {
		Double x=1.0,y=5.0;
		Punto newPunto=crearPunto(x,y);
		assertNotNull(newPunto);
	}
	
	private Punto  crearPunto(Double x, Double y) {
		Punto newPunto=new Punto(x, y);
		return newPunto;		
	}
}