package Practico03Cubo;

public class Cubo {
	//Atributos
	private float longitudLado;
	
	//Constructores
	public Cubo(float lado) {
		this.longitudLado=lado;	
	}
	//Metodos

	public float getLongitudLado() {
		return longitudLado;
	}

	public void setLongitudLado(float longitudLado) {
		this.longitudLado = longitudLado;
	}
	
	public float getSuperficieCara() {
		return (float) Math.pow(longitudLado, 2);	
	}
	
	public float getVolumen() {
		return (float) Math.pow(longitudLado, 3);	
	}
}
