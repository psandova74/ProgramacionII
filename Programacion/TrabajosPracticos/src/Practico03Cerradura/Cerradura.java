package Practico03Cerradura;

public class Cerradura {
	private int cantidadDeFallosConsecutivosQueLaBloquean;
	private int claveDeApertura;
	private int intentosFallidos;
	private boolean abierta;
	private boolean bloqueada;


	public Cerradura(int claveDeApertura,int cantidadDeFallosConsecutivosQueLaBloquean) {
		this.cantidadDeFallosConsecutivosQueLaBloquean=cantidadDeFallosConsecutivosQueLaBloquean;
		this.claveDeApertura=claveDeApertura;
		this.intentosFallidos=0;
		this.abierta=false;
		this.bloqueada=false;
	}
	
	public Cerradura() {
		this.cantidadDeFallosConsecutivosQueLaBloquean=3;
		this.claveDeApertura=1234;
		this.intentosFallidos=0;
		this.abierta=false;
		this.bloqueada=false;
	}
	
	public int getIntentosFallidos() {
		return intentosFallidos;
	}

	public void setIntentosFallidos(int intentosFallidos) {
		this.intentosFallidos = intentosFallidos;
	}
	public void setClaveDeApertura(int claveNueva) {
		this.claveDeApertura=claveNueva;
		
	}
	public boolean abrir(int clave) {	
		boolean respuesta=false;
		if (this.estaAbierta()) {
			respuesta=true;
		} else {
			if (this.fueBloqueada()) {	
				respuesta=false;
			} else {
				if ( this.claveDeApertura==clave) {
					respuesta= true;
				} else {
					this.intentosFallidos++;
					if (this.intentosFallidos==this.cantidadDeFallosConsecutivosQueLaBloquean) {
						this.bloqueada=true;
					}
					respuesta=false;
				}
			}
		}
		return respuesta;
	}
	
	public void cerrar() {
		this.abierta=false;
	}
	
	public boolean estaAbierta() {
		return this.abierta;
	}
	
	public boolean fueBloqueada() {
		return this.bloqueada;
	}

	

}
