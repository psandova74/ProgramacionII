package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Evento {
	private TipoDeEvento tipoEvento;
	private String nombreEvento;
	static Integer numeroDeInscripcion=0;
	private Map<Integer, Deportista> participantes;
	
	public Evento(TipoDeEvento tipoEvento,String nombreEvento) {
		this.tipoEvento = tipoEvento;
		this.nombreEvento=nombreEvento;
		participantes= new HashMap<Integer, Deportista>();
	}
	
	protected TipoDeEvento getTipoEvento() {
		return tipoEvento;
	}

	protected void setTipoEvento(TipoDeEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	protected String getNombreEvento() {
		return nombreEvento;
	}

	protected void setNombreEvento(String nombreEvento) {
		this.nombreEvento = nombreEvento;
	}


	protected Integer getNumeroDeInscripcion() {
		return numeroDeInscripcion;
	}


	public Integer agregarDeportistaAlEvento(Deportista nuevoDeportista) {
		numeroDeInscripcion++;
		participantes.put(numeroDeInscripcion, nuevoDeportista);
		return numeroDeInscripcion;
		
	}
	
}
