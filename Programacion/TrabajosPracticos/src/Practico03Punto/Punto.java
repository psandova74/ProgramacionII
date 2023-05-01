package Practico03Punto;

public class Punto {
	private float x;
	private float y;

	public Punto(float x, float y) {
		this.x=x;
		this.y=y;	 
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	public boolean isOrigenCoordenadas() {
		return (x==0 && y==0);
	}
		
	public boolean isEjeX() {
		return (y==0);
	}

	public boolean isEjeY() {
		return (x==0);
	}
	
}
