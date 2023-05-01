package Figura;
public class Rectangulo extends Figura  {
	/*
	 * pPunto es el punto de la esquina inferior derecha lmayor es el lado mayor
	 * lmenor es el lado menor
	 */
	public Rectangulo(Punto pPunto, Double lMayor, Double lMenor) {
		super(pPunto, lMayor, lMenor);
		calcularEsqSupDer();
	}

	private Punto calcularEsqSupDer() {
		Double ejeX = getPosicion().getEjeX() + getLadoMayor();
		Double ejeY = getPosicion().getEjeY() + getLadoMenor();
		Punto punto = new Punto(ejeX, ejeY);
		return punto;
	}

	/*
	 * Area = base * altura
	 */
	@Override
	public Double calcularArea() {
		return getLadoMayor() * getLadoMenor();
	}

	public Punto getEsquinaSupDer() {
		return calcularEsqSupDer();
	}

	@Override
	public void setPosicion(Punto pPunto) {
		super.setPosicion(pPunto);

	}
}
