package Practico04Temperatura;

public class Temperatura {
	public final byte CELSIUS=0;
	public final byte FARENHEIT=1;
	public final byte KELVIN=2;
	private double valor; //Celsius

	public Temperatura(double valor) {
		this.valor=valor;
	}
	public Temperatura() {
		this.valor=0.0;
	}
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void setValor(double valor, byte tipoTemperatura ) {
		switch (tipoTemperatura) {
		case FARENHEIT:
			this.valor=(valor-32)* 5/9;
			break;
		case KELVIN:
			this.valor=valor-273.15;
			break;
		default:
			this.valor=valor;				
		}
	}

	public double convertir(byte tipoTemperatura ) {
		double valorRetornar=this.valor;
		switch (tipoTemperatura) {
		case FARENHEIT:
			valorRetornar=this.valor* 9/5+32;
			break;
		case KELVIN:
			valorRetornar=valor+273.15;				
		}
		return valorRetornar;
	}
}
