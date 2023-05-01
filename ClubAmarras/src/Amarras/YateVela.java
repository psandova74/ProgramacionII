package Amarras;

public class YateVela extends Yate{
	private static Integer COSTO_VELA=9000;
	private Integer pesoKilo;
	private Double alturaMastil;
	private Integer superficieVelica;
	private Integer superficieTotal;//Vela Mayor y foque
	public YateVela(String nombre, String duenio, Double manga, Double calado, Double stola, Integer tripulacion,Integer pesoKilo, Double alturaMastil, Integer superficieVelica,Integer superficieTotal) {
		super(nombre, duenio, manga, calado, stola, tripulacion);
		this.pesoKilo = pesoKilo;
		this.alturaMastil = alturaMastil;
		this.superficieVelica=superficieVelica;
		this.superficieTotal = superficieTotal;
	}
	
	@Override
	public Double obtenerPrecioDeAmarre() {
		Double precioAmarre=0.0;
		precioAmarre+=COSTO_VELA;
		if (super.getStola()>20)
			precioAmarre+=super.getPRECIO_ESTOLA_MAYOR_20M();
		else 
			precioAmarre+=super.getPRECIO_ESTOLA_20M();
		return precioAmarre;
	}
}
