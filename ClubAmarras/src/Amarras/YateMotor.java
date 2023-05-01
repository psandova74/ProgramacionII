package Amarras;

public class YateMotor extends Yate{
	private static Integer COSTO_MOTOR=10000;
	private Integer pesoTonelada;
	private Integer desplazamintoTonelada;
	private String propulsion;
	private Integer potenciaKW;
	private Integer veicudadNudo;
	private Integer autonomiaMN;
	public YateMotor(String nombre, String duenio, Double manga, Double calado, Double stola, Integer tripulacion,Integer pesoTonelada, Integer desplazamintoTonelada, String propulsion, Integer potenciaKW,Integer veicudadNudo, Integer autonomiaMN) {
		super(nombre, duenio, manga, calado,  stola,  tripulacion);
		this.pesoTonelada = pesoTonelada;
		this.desplazamintoTonelada = desplazamintoTonelada;
		this.propulsion = propulsion;
		this.potenciaKW = potenciaKW;
		this.veicudadNudo = veicudadNudo;
		this.autonomiaMN = autonomiaMN;
	}
	
	@Override
	public Double obtenerPrecioDeAmarre() {
		Double precioAmarre=0.0;
		precioAmarre+=COSTO_MOTOR;
		if (super.getStola()>20)
			precioAmarre+=super.getPRECIO_ESTOLA_MAYOR_20M();
		else 
			precioAmarre+=super.getPRECIO_ESTOLA_20M();
		return precioAmarre;
	}
	
}
