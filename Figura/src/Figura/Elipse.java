package Figura;

public class Elipse extends Figura{
	/*
	 * pPunto es el punto del centro lmayor es el semieje mayor lmenor es el semieje
	 * menor
	 */
	public Elipse(Punto pPunto, Double lMenor, Double lMayor) {
		super(pPunto, lMenor, lMayor);
	}

	/*
	 * Area = Pi * semiejeMayor * semiejeMenor
	 */
	@Override
	public Double calcularArea() {
		return Math.PI * getLadoMayor() * getLadoMenor();
	}

}
