package Figura;

public abstract class Figura {

	private Punto posicion;
	private Double ladoMayor;
	private Double ladoMenor;

	public Figura(Punto pPunto, Double Mayor, Double Menor) {
		this.posicion = pPunto;
		this.ladoMayor = Mayor;
		this.ladoMenor = Menor;
	}
	
	public abstract Double calcularArea();

	public Punto getPosicion() {
		return posicion;
	}

	public void setPosicion(Punto posicion) {
		this.posicion = posicion;
	}

	public Double getLadoMayor() {
		return ladoMayor;
	}

	public void setLadoMayor(Double ladoMayor) {
		this.ladoMayor = ladoMayor;
	}

	public Double getLadoMenor() {
		return ladoMenor;
	}

	public void setLadoMenor(Double ladoMenor) {
		this.ladoMenor = ladoMenor;
	}
	
	public Integer compareTo(Figura o) {
		Integer resultado = 0;
		if (this.calcularArea() < o.calcularArea()) {
			resultado = -1;
		} else if (this.calcularArea() > o.calcularArea()) {
			resultado = 1;
		}
		return resultado;
	}

	public void mover(Double deltaX, Double deltaY) {
		Punto nuevoPunto = getPosicion();
		nuevoPunto.setEjeX(nuevoPunto.getEjeX() + deltaX);
		nuevoPunto.setEjeY(nuevoPunto.getEjeY() + deltaY);
		setPosicion(nuevoPunto);
	}


}
