package Figura;

public class Cuadrado extends Rectangulo {

	/*
	 * 	pPunto es el punto de la esquina inferior derecha
	 *	lmayor es el lado mayor
	 *	lmenor es el lado menor
	 */
	public Cuadrado(Punto pPunto, Double lMayor, Double lMenor) {
		super(pPunto, lMayor, lMayor);
		
	}
	
	public Cuadrado(Punto pPunto, Double lMayor) {
		super(pPunto, lMayor, lMayor);
		
	}

}
