package Futsal;

public class PartidoDeFutbol {
	private EquipoDeFutbol local;
	private EquipoDeFutbol visitante;
	private final int CANTIDAD_MAXIMA_EVENTOS=20;
	private Evento goles[];
	private Evento amonestados[];
	private Evento expulsados[];
	private int golesLocal;
	private int golesVisitante;
	private int expulsadosLocal;
	private int expulsadosVisitante;
	private int amolestadosLocal;
	private int amolestadosVisitante;
	
	
	public PartidoDeFutbol(EquipoDeFutbol local, EquipoDeFutbol visitante) {
		this.local = local;
		this.visitante = visitante;
		goles=new Evento[CANTIDAD_MAXIMA_EVENTOS];
		amonestados=new Evento[CANTIDAD_MAXIMA_EVENTOS];
		expulsados=new Evento[CANTIDAD_MAXIMA_EVENTOS];
		golesLocal=0;
		golesVisitante=0;
		expulsadosLocal=0;
		expulsadosVisitante=0;
		amolestadosLocal=0;
		amolestadosVisitante=0;
	}
	
	
	
	public int getGolesLocal() {
		return golesLocal;
	}



	public void setGolesLocal(int golesLocal) {
		this.golesLocal = golesLocal;
	}



	public int getGolesVisitante() {
		return golesVisitante;
	}



	public void setGolesVisitante(int golesVisitante) {
		this.golesVisitante = golesVisitante;
	}



	public int getExpulsadosLocal() {
		return expulsadosLocal;
	}



	public void setExpulsadosLocal(int expulsadosLocal) {
		this.expulsadosLocal = expulsadosLocal;
	}



	public int getExpulsadosVisitante() {
		return expulsadosVisitante;
	}



	public void setExpulsadosVisitante(int expulsadosVisitante) {
		this.expulsadosVisitante = expulsadosVisitante;
	}



	public int getAmolestadosLocal() {
		return amolestadosLocal;
	}



	public void setAmolestadosLocal(int amolestadosLocal) {
		this.amolestadosLocal = amolestadosLocal;
	}



	public int getAmolestadosVisitante() {
		return amolestadosVisitante;
	}



	public void setAmolestadosVisitante(int amolestadosVisitante) {
		this.amolestadosVisitante = amolestadosVisitante;
	}



	/*
	 * Se debe marcar un nuevo Gol 
	 * Dependiendo del autor (seg�n al equipo que pertenezca) y del tipo (si es a favor o en contra) se sabr� a quien contabilizarlo
	 */
	public void marcar(Evento gol) {
		Jugador buscoJugador;
		for (int i=0;i<goles.length;i++) {
			if (goles[i]==null) {
				goles[i]=gol;
				break;
			}
		}
			
		buscoJugador=local.buscarJugador(gol.getAutor());
		if (buscoJugador!=null) {
			if (gol.getTipo().equals(TipoDeEvento.GOL_A_FAVOR)  ) {
				golesLocal++;
			}else {
				golesVisitante++;
			}
		} else {
			buscoJugador=visitante.buscarJugador(gol.getAutor());
			if (buscoJugador!=null) {
				if (gol.getTipo().equals(TipoDeEvento.GOL_A_FAVOR) ) {
					golesVisitante++;
				}else {
					golesLocal++;
				}
			}
		}	
	}
	
	public Jugador buscarAmolestado(Jugador jugadorBuscado) {
		for (int i=0;i<amonestados.length;i++) {
			if (amonestados[i]!=null && amonestados[i].getAutor().equals(jugadorBuscado) ) {
				return amonestados[i].getAutor();
			}
		}
		return null;
	}
	
	/*
	 * Se registra un nuevo amonestado en el partido. 
	 * Si el mismo ya pose�a una amonestaci�n previa, se lo debe expulsar. 
	 * 
	 */
	public void amonestar(Evento amonestado) {
		Jugador buscoJugador;
		Boolean localAmonestado=false;
		Boolean visitanteAmonestado=false;
		Boolean amonestacionPrevia=false;
		
		if (buscarAmolestado(amonestado.getAutor())!=null) {
			amonestacionPrevia=true;
		}
				
		buscoJugador=local.buscarJugador(amonestado.getAutor());
		if (buscoJugador!=null) {
			localAmonestado=true;
		}
		
		buscoJugador=visitante.buscarJugador(amonestado.getAutor());
		if (buscoJugador!=null) {
			visitanteAmonestado=true;
		}
		
		if (localAmonestado ||visitanteAmonestado) {
			if (amonestacionPrevia) {
				expulsar(amonestado);
			}else {
				for (int i=0;i<amonestados.length;i++) {
					if (amonestados[i]==null) {
						amonestados[i]=amonestado;
						break;
					}
				}
				if (localAmonestado) {
					amolestadosLocal++;
				}else {
					expulsadosVisitante++;
				}
			}
		}
	}
	
	/*
	 * Se registra un nuevo expulsado en el partido. 
	 */
	public void expulsar(Evento expulsado) {
		Jugador buscoJugador;
		for (int i=0;i<expulsados.length;i++) {
			if (expulsados[i]==null) {
				expulsados[i]=expulsado;
				break;
			}
		}	

		buscoJugador=local.buscarJugador(expulsado.getAutor());
		if (buscoJugador!=null) {
			this.expulsadosLocal++;
		} else {
			buscoJugador=visitante.buscarJugador(expulsado.getAutor());
			if (buscoJugador!=null) {
				this.expulsadosVisitante++;
			}
		}	
		
	}
	
	/*
	 * Se cuentan la cantidad de goles por equipo (Se debe considerar si el gol result� a favor o en contra), y devuelve el equipo ganador (Si hubo un empate retorna null) 
	 */
	public EquipoDeFutbol getGanador() {
		if (golesLocal>golesVisitante) {
			return this.local;
		}else if (golesLocal<golesVisitante) {
			return this.visitante;
		}
		return null;
	}
	
	/*
	 * El m�todo toString debe describir el ESTADO del partido (Equipos que se enfrentan, los goles realizados, los amonestado y expulsados).
	 */
	public String toString() {
		String resultado = "Equipo Local: "+ this.local.getNombre()+"  goles: "+this.golesLocal+"  Amolestados: "+this.amolestadosLocal+"  Expulsados: "+this.expulsadosLocal;
		resultado+="\nEquipo Visitante: "+this.visitante.getNombre()+"  goles: "+this.golesVisitante+"  Amolestados: "+this.amolestadosVisitante+"  Expulsados: "+this.expulsadosVisitante;
		return resultado;
	}

	public EquipoDeFutbol getLocal() {
		return local;
	}

	public EquipoDeFutbol getVisitante() {
		return visitante;
	}

}
