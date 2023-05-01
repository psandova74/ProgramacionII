package montacarga;

import java.util.ArrayList;

public class Montacarga {
	private Double cargaMaximaPosible;
	private ArrayList <Carga> cargas;
	private Double pesoDescargado;
	private Integer cantidadDescargas;
	
	public Montacarga(Double cargaMaximaPosible) {
		this.cargaMaximaPosible = cargaMaximaPosible;
		this.pesoDescargado=0.0;
		this.cantidadDescargas=0;
		this.cargas= new ArrayList<Carga>();
	}
	
	
	protected Double getCargaMaximaPosible() {
		return cargaMaximaPosible;
	}

	protected Double getPesoDescargado() {
		return pesoDescargado;
	}

	protected Integer getCantidadDescargas() {
		return cantidadDescargas;
	}


	protected void setCantidadDescargas(Integer cantidadDescargas) {
		this.cantidadDescargas = cantidadDescargas;
	}


	public Double obtenerCarga() {
		Double cargaActual=0.0;
		for (Carga carga:this.cargas) {
			cargaActual+=carga.obtengoPesoDeLaCarga();
		}
		return cargaActual;
	}
	
	public Boolean cargar(Carga carga) {
		Boolean resultado=false;
		if(this.obtenerCarga()+carga.obtengoPesoDeLaCarga()<=this.cargaMaximaPosible) 
			return this.cargas.add(carga);
		return resultado;
	}
	
	public void descargar() {
		this.cantidadDescargas++;
		this.pesoDescargado+=this.obtenerCarga();
		this.cargas.clear();
	}
	
	public Integer cantidadDeCargaActual() {
		return this.cargas.size();
	}
	
	public Double obtenerCargaPromedio() {
		Double cargaPromedio=0.0;
		if (this.cantidadDescargas>0)
			cargaPromedio=this.pesoDescargado/this.cantidadDescargas;
		return cargaPromedio;

	}
}
