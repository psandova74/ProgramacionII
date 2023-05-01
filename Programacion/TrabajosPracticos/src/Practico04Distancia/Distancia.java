package Practico04Distancia;

public class Distancia {
	 public final byte DECAMETRO;
	 public final byte HECTOMETRO;
	 public final byte KILOMETRO;
	 private double valor;

	public Distancia() {
		this.DECAMETRO =1;
		this.HECTOMETRO=2;
		this.KILOMETRO=3;
		this.valor=0;
	}
	
	public Distancia(double valor) {
		this.DECAMETRO =1;
		this.HECTOMETRO=2;
		this.KILOMETRO=3;
		this.valor=valor;
	}

	public double getValor() {
		//Valor en metros
		return valor;
	}

	public void setValor(double valor) {
		// Valor en metros
		this.valor = valor;
	}
	
	public void setValor(double valor, byte unidad) {
		// Valor en metros
			switch (unidad) {
		case 1://DECAMETRO 1 decametro son 10 metros.
			this.valor = valor*10;
			break;
		case 2://HECTOMETRO  1 hectometro son 100 metros
			this.valor = valor*100;
			break;
		case 3://KILOMETRO 1 kilometro son 1000 metros
			this.valor = valor*1000;
		}
	}
	
	public double convertir(byte unidad) {
		double valorRespuesta=this.valor;
		switch (unidad) {
		case 1://DECAMETRO 1 decametro son 10 metros.
			this.valor = valor/10;
			break;
		case 2://HECTOMETRO  1 hectometro son 100 metros
			this.valor = valor/100;
			break;
		case 3://KILOMETRO 1 kilometro son 1000 metros
			this.valor = valor/1000;		
		}
		return valorRespuesta;
	}
}
