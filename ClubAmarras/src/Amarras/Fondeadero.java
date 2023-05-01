package Amarras;

import java.util.LinkedList;

public class Fondeadero {
	private Integer cantidadAmarras;
	 private LinkedList <Yate> amarras= new LinkedList<Yate>();
	
	public Fondeadero(Integer cantidadAmarras) {
		this.cantidadAmarras = cantidadAmarras;
	}
	
	public Integer obtenerCantidadDeYatesAmarrados() {
		return this.amarras.size();
	}
	public Integer obtenerCantidadDeAmarrasDisponibles() {
		return  cantidadAmarras- amarras.size();
	}
	
	public Boolean amararYate(Yate yate) {
		if (!this.obtenerCantidadDeAmarrasDisponibles().equals(0))
			if (!amarras.contains(yate))
				return amarras.add(yate);
		return false;
	}
	
	public Boolean desamarrarYate(Yate yate) {
		return amarras.remove(yate);
	}
	
	public Double obtenerRecaudacionTotal() {
		Double totalRecaudacion=0.0;
		for (Yate yate : amarras) {
			totalRecaudacion+=yate.obtenerPrecioDeAmarre();
        }
		return totalRecaudacion;
	}
}
