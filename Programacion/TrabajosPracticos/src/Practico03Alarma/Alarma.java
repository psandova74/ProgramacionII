package Practico03Alarma;

public class Alarma {
	private boolean sensorDeMovimiento;
	private boolean sensorDeContacto;
	private boolean sensorDeSonido;
	private boolean encendida;
	private int codigoDeSeguridad;
	private int intentosFallidos;
	private int cantidadDeFallosConsecutivosQueLaActivan;

	public Alarma() {
		this.cantidadDeFallosConsecutivosQueLaActivan=3;
		this.sensorDeContacto=false;
		this.sensorDeMovimiento=false;
		this.sensorDeSonido=false;
		this.encendida=false;
		this.intentosFallidos=0;
		this.codigoDeSeguridad=1234;
	}
	
	public Alarma(int codigoDeSeguridad) {
		this.cantidadDeFallosConsecutivosQueLaActivan=3;
		this.sensorDeContacto=false;
		this.sensorDeMovimiento=false;
		this.sensorDeSonido=false;
		this.encendida=false;
		this.intentosFallidos=0;
		this.codigoDeSeguridad=codigoDeSeguridad;
	}

	public boolean isSensorDeMovimiento() {
		return sensorDeMovimiento;
	}

	public boolean isSensorDeContacto() {
		return sensorDeContacto;
	}

	public boolean isSensorDeSonido() {
		return sensorDeSonido;
	}

	public boolean isEncendida() {
		return encendida;
	}


	public void setCodigoDeSeguridad(int codigoDeSeguridad) {
		this.codigoDeSeguridad = codigoDeSeguridad;
	}

	public int getIntentosFallidos() {
		return intentosFallidos;
	}

	public void setIntentosFallidos(int intentosFallidos) {
		this.intentosFallidos = intentosFallidos;
	}

	public int getCantidadDeFallosConsecutivosQueLaActivan() {
		return cantidadDeFallosConsecutivosQueLaActivan;
	}

	public void setCantidadDeFallosConsecutivosQueLaActivan(int cantidadDeFallosConsecutivosQueLaActivan) {
		this.cantidadDeFallosConsecutivosQueLaActivan = cantidadDeFallosConsecutivosQueLaActivan;
	}


	/*
	 * Atributos

Constructores
+Alarma(codigoDeSeguridad: int)
Metodos
+encender(): void
+apagar(): void
+activada(): boolean
	 */
}
