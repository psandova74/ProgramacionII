package Figura;

import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Test;

public class testFiguras {

	@Test
	public void creoPunto() {
		Double x=1.0,y=5.0;
		Punto newPunto=crearPunto(x,y);
		assertNotNull(newPunto);
	}
	
	@Test
	public void creoRectangulo() {
		Rectangulo newRectangulo=crearRectangulo();
		assertNotNull(newRectangulo);
	}
	
	@Test
	public void creoCuadrado() {
		Cuadrado newCuadrado=crearCuadrado();
		assertNotNull(newCuadrado);
	}
	
	@Test
	public void creoElipse() {
		Elipse newElipse=crearElipse();
		assertNotNull(newElipse);
	}

	@Test
	public void creoCirculo() {
		Circulo newCirculo=crearCirculo();
		assertNotNull(newCirculo);
	}

	@Test
	public void calculoSuperficieElipse() {
		Elipse newElipse=crearElipse();
		Double supElipse=newElipse.calcularArea();
		Double ve=628.32;
		validoResultado(ve,supElipse);
	}
	
	@Test
	public void calculoSuperficieCirculo() {
		Circulo newCirculo=crearCirculo();
		Double supCirculo=newCirculo.calcularArea();
		Double ve=314.16;
		validoResultado(ve,supCirculo);
	}
	
	@Test
	public void calculoSuperficieRectangulo() {
		Rectangulo newRectangulo=crearRectangulo();
		Double supRectangulo=newRectangulo.calcularArea();
		Double ve=200.0;
		validoResultado(ve,supRectangulo);
	}

	@Test
	public void calculoSuperficieCuadrado() {
		Cuadrado newCuadrado=crearCuadrado();
		Double supCuadrado=newCuadrado.calcularArea();
		Double ve=100.0;
		validoResultado(ve,supCuadrado);
	}
	
	@Test
	public void MoverRectangulo() {
		Rectangulo newRectangulo=crearRectangulo();
		validoResultado(1.0,newRectangulo.getPosicion().getEjeX());
		validoResultado(5.0,newRectangulo.getPosicion().getEjeY());
		validoResultado(21.0,newRectangulo.getEsquinaSupDer().getEjeX());
		validoResultado(15.0,newRectangulo.getEsquinaSupDer().getEjeY());
		
		newRectangulo.mover(5.0,4.0);

		validoResultado(6.0,newRectangulo.getPosicion().getEjeX());
		validoResultado(9.0,newRectangulo.getPosicion().getEjeY());
		validoResultado(26.0,newRectangulo.getEsquinaSupDer().getEjeX());
		validoResultado(19.0,newRectangulo.getEsquinaSupDer().getEjeY());

	}	
	
	@Test
	public void MoverCuadrado() {
		Cuadrado newCuadrado=crearCuadrado();
		validoResultado(1.0,newCuadrado.getPosicion().getEjeX());
		validoResultado(5.0,newCuadrado.getPosicion().getEjeY());
		validoResultado(11.0,newCuadrado.getEsquinaSupDer().getEjeX());
		validoResultado(15.0,newCuadrado.getEsquinaSupDer().getEjeY());
		
		newCuadrado.mover(5.0,4.0);

		validoResultado(6.0,newCuadrado.getPosicion().getEjeX());
		validoResultado(9.0,newCuadrado.getPosicion().getEjeY());
		validoResultado(16.0,newCuadrado.getEsquinaSupDer().getEjeX());
		validoResultado(19.0,newCuadrado.getEsquinaSupDer().getEjeY());

	}	
	
	@Test
	public void moverElipse() {
		Elipse newElipse=crearElipse();
		newElipse.mover(5.0,4.0);
		validoResultado(6.0,newElipse.getPosicion().getEjeX());
		validoResultado(9.0,newElipse.getPosicion().getEjeY());

	}
	
	@Test
	public void moverCirculo() {
		Circulo newCirculo=crearCirculo();
		newCirculo.mover(5.0,4.0);
		validoResultado(6.0,newCirculo.getPosicion().getEjeX());
		validoResultado(9.0,newCirculo.getPosicion().getEjeY());

	}
	
	private void validoResultado(Double ve, Double vo) {
		Assert.assertEquals(ve, vo,0.01);

	}

	private Elipse crearElipse() {
		Double x=1.0,y=5.0;
		Punto newPunto=crearPunto(x,y);
		Double radioA=10.0;
		Double radioB=20.0;
		Elipse newElipse=new Elipse( newPunto, radioA,  radioB);
		return newElipse;
	}
	
	private Circulo crearCirculo() {
		Double x=1.0,y=5.0;
		Punto newPunto=crearPunto(x,y);
		Double radioA=10.0;
		Double radioB=10.0;
		Circulo newElipse=new Circulo( newPunto, radioA,  radioB);
		return newElipse;
	}
	
	private Rectangulo crearRectangulo() {
		Double x=1.0,y=5.0;
		Punto newPunto=crearPunto(x,y);
		Double LadoMayor=20.0;
		Double LadoMenor=10.0;
		Rectangulo newRectangulo=new Rectangulo(newPunto,LadoMayor,LadoMenor);
		return newRectangulo;
	}
	
	private Cuadrado crearCuadrado() {
		Double x=1.0,y=5.0;
		Punto newPunto=crearPunto(x,y);
		Double LadoMayor=10.0;
		Double LadoMenor=10.0;
		Cuadrado newCuadrado=new Cuadrado(newPunto,LadoMayor,LadoMenor);
		return newCuadrado;
	}
	
	private Punto  crearPunto(Double x, Double y) {
		Punto newPunto=new Punto(x, y);
		return newPunto;		
	}
	
}
