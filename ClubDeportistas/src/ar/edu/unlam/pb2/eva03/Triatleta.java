package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;
import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Triatleta extends Deportista implements ICiclista, ICorredor, INadador{
	private String distanciaPreferida;
	private Integer kilometrosEntrenados;
	private TipoDeBicicleta tipoDeBicicleta;
	public Triatleta(Integer numeroDeSocio, String nombre ,String distanciaPreferida, TipoDeBicicleta tipoDeBicicleta) {
		super(numeroDeSocio, nombre);
		this.distanciaPreferida=distanciaPreferida;
		this.tipoDeBicicleta=tipoDeBicicleta;
	}
	public String getDistanciaPreferida() {
		return distanciaPreferida;
	}
	public void setDistanciaPreferida(String distanciaPreferida) {
		this.distanciaPreferida = distanciaPreferida;
	}
	public TipoDeBicicleta getTipoDeBicicleta() {
		return tipoDeBicicleta;
	}
	public void setTipoDeBicicleta(TipoDeBicicleta tipoDeBicicleta) {
		this.tipoDeBicicleta = tipoDeBicicleta;
	}

	@Override
	public void setCantidadDeKilometrosEntrenados(Integer kilometrosEntrenados) {
		this.kilometrosEntrenados = kilometrosEntrenados;
		
	}
	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		return kilometrosEntrenados;
	}
	
	
	
}
