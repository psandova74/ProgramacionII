package Figura;

public class Circulo extends Elipse {

	/*
	 * pPunto es el punto del centro
	 * radio2 puede ser cualquier valor
	 */
	public Circulo(Punto pPunto, Double radio, Double radio2) {
		super(pPunto, radio, radio);
	}
	
	public Circulo(Punto pPunto, Double radio) {
		super(pPunto, radio, radio);
	}

}
