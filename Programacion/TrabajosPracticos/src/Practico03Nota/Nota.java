package Practico03Nota;

public class Nota {
	private float valor;

	
	public Nota(float valorInicial) {
		this.valor = valorInicial;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public void recuperar(float nuevoValor) {
		this.valor = nuevoValor;
	}
	
	public boolean aprobado() {
		return this.valor>=4;
	}
}
