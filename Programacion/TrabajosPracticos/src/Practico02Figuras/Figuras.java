package Practico02Figuras;

public class Figuras {

	private double radio;
	private double base;
	private double altura;
	
	public Figuras() {
		radio=0.0;
		base=0.0;
		altura=0.0;
	}
	
	public Figuras(double radio, double base, double altura) {
		this.radio=radio;
		this.base=base;
		this.altura=altura;
	}
	
	public double getRadio() {
		return radio;
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPI() {
		return Math.PI;
	}
	
	public double calculoAreaCirculo() {
		return Math.PI * radio * radio;
	}
	
	public double  calculoPerimetroCirculo() {
		return Math.PI * 2 * radio;
	}
	
	public double calculoPerimetroRectangulo () {
		return 2*(this.base+this.altura);
	}
	
	public double calculoAreaRectangulo() {
		return this.base * this.altura;
	}
	
}
