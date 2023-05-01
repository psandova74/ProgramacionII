package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;
import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Club {

	private String nombre;
	private Set<Deportista> socios;
	private Map<String, Evento> competencias;
	
	
	public Club(String nombre) {
		this.nombre = nombre;
		socios = new HashSet<Deportista>();
		competencias = new HashMap<String, Evento>();
	}
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Boolean agregarDeportista(Deportista deportista) {
		
		return socios.add(deportista);
	}
	
	public Integer getCantidadSocios() {
		return socios.size();
	}
	

	public void crearEvento(TipoDeEvento tipoEvento, String nombre) {
		Evento nuevoEvento = new Evento(tipoEvento, nombre);
		competencias.put(nombre, nuevoEvento);
	}
	
	private Evento getEvento(String nombreEvento) {
		return this.competencias.get(nombreEvento);
	}

	public Integer inscribirEnEvento(String nombreEvento, Deportista deportista) throws NoEstaPreparado {
		Evento evento = getEvento(nombreEvento);

		switch (evento.getTipoEvento()) {			
		case CARRERA_5K:
		case CARRERA_10K:
		case CARRERA_21K:
		case CARRERA_42K:
			if (deportista instanceof ICorredor) 
				return evento.agregarDeportistaAlEvento(deportista);
			else
				throw new NoEstaPreparado();
			
		case CARRERA_NATACION_EN_PICINA:
		case CARRERA_NATACION_EN_AGUAS_ABIERTAS:
			if (deportista instanceof INadador) 
				return evento.agregarDeportistaAlEvento(deportista);
			else
				throw new NoEstaPreparado();
		case DUATLON:
			if (deportista instanceof ICorredor && deportista instanceof ICiclista) 
				return evento.agregarDeportistaAlEvento(deportista);	
			else
				throw new NoEstaPreparado();
		case ACUATLON:
			if (deportista instanceof ICorredor && deportista instanceof INadador) 
				return evento.agregarDeportistaAlEvento(deportista);	
			else
				throw new NoEstaPreparado();
		case TRIATLON_SHORT:
		case TRIATLON_OLIMPICO:
		case TRIATLON_MEDIO:
		case TRIATLON_IRONMAN:
			if (deportista instanceof ICiclista && deportista instanceof ICorredor && deportista instanceof INadador) 
				return evento.agregarDeportistaAlEvento(deportista);
			else
				throw new NoEstaPreparado();
		default:
			break;
		}

		return 0;
	}
}
