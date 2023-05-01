package Figura;

public class Punto {
	private Double ejeX;
	private Double ejeY;
	
	public Punto(Double pEjeX, Double pEjeY) {
		this.setEjeX(pEjeX);
		this.setEjeY(pEjeY);
	}

	public Double getEjeX() {
		return ejeX;
	}

	public void setEjeX(Double ejeX) {
		this.ejeX = ejeX;
	}

	public Double getEjeY() {
		return ejeY;
	}

	public void setEjeY(Double ejeY) {
		this.ejeY = ejeY;
	}
}
