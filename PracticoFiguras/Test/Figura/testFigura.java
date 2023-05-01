package Figura;
import static org.junit.Assert.*;
import org.junit.Test;

public class testFigura {

	@Test
	public void creoPunto() {
		Double x=1.0,y=5.0;
		Punto newPunto=crearPunto(x,y);
		assertNotNull(newPunto);
	}
	
/*	@Test
	public void creoRectangulo() {
		Rectangulo newRectangulo=crearRectangulo();
		assertNotNull(newRectangulo);
	}
	
	@Test
	public void creoElipse() {
		Elipse newElipse=crearElipse();
		assertNotNull(newElipse);
	}
	
	private Elipse crearElipse() {
		Double x=1.0,y=5.0;
		Punto newPunto=crearPunto(x,y);
		Double radioA=10.0;
		Double radioB=20.0;
		Elipse newElipse=new Elipse( newPunto, radioA,  radioB);
		return newElipse;
	}
	
	private Rectangulo crearRectangulo() {
		Double x=1.0,y=5.0;
		Punto newPunto1=crearPunto(x,y);
		x=10.0;
		y=20.0;
		Punto newPunto2=crearPunto(x,y);
		Rectangulo newRectangulo=new Rectangulo(newPunto1,newPunto2);
		return newRectangulo;
	}*/
	
	private Punto  crearPunto(Double x, Double y) {
		Punto newPunto=new Punto(x, y);
		return newPunto;		
	}

}
