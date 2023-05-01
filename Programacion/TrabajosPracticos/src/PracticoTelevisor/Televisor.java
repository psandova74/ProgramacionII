package PracticoTelevisor;


public class Televisor {
	private final int VOLUMEN_MAXIMO = 100;
	private final int VOLUMEN_MINIMO = 0;
	private final int CANAL_MAXIMO_AIRE;
	private final int CANAL_MAXIMO_CABLE;
	private final int CANAL_MINIMO = 0;
	private static int  generoNumeroDeSerie=1;
	private int numeroDeSerie;
	private boolean encenderOApagar;
	private TipoEntrada entradaTV;
	private Canal canalActual;
	private Canal canalAnterior;
	private int volumen;
	private Canal canalesAire[];
	private Canal canalesCable[];

	public Televisor() {
		this.numeroDeSerie=generoNumeroDeSerie++;
		this.encenderOApagar = false;
		this.volumen=1;
		entradaTV=TipoEntrada.TV_AIRE;
		CANAL_MAXIMO_AIRE = 127;
		CANAL_MAXIMO_CABLE=32767;
		canalesAire=new Canal[CANAL_MAXIMO_AIRE];
		canalesCable=new Canal[CANAL_MAXIMO_CABLE];
		this.canalActual = canalesAire[0];
		this.canalAnterior = canalesAire[0];
		
	}
	
	public Televisor(int canalMaximoTelevisionAbierta, int canalMaximoTelevisionPorCable) {
		this.numeroDeSerie=generoNumeroDeSerie++;
		this.encenderOApagar = false;
		this.volumen=1;
		entradaTV=TipoEntrada.TV_AIRE;
		CANAL_MAXIMO_AIRE = canalMaximoTelevisionAbierta;
		CANAL_MAXIMO_CABLE=canalMaximoTelevisionPorCable;
		canalesAire=new Canal[CANAL_MAXIMO_AIRE];
		canalesCable=new Canal[CANAL_MAXIMO_CABLE];
		this.canalActual = canalesAire[0];
		this.canalAnterior = canalesAire[0];
	}

	public int getCANAL_MAXIMO_AIRE() {
		return CANAL_MAXIMO_AIRE;
	}
	public int getCANAL_MAXIMO_CABLE() {
		return CANAL_MAXIMO_CABLE;
	}
	public boolean encenderOApagar() {
		encenderOApagar=!encenderOApagar;
		return encenderOApagar;
	}

	public void seleccionarEntrada(TipoEntrada entradaNueva) {
		entradaTV=entradaNueva;
	}
	
	
	public boolean isEncendido() {
		return encenderOApagar;
	}
	
	public int getNumeroDeSerie() {
		return numeroDeSerie;
	}

	public void subirOBajarAnalogicamente(char opcionSeleccionada){
		if  (entradaTV==TipoEntrada.TV_AIRE || entradaTV ==TipoEntrada.TV_CABLE) {
			switch (opcionSeleccionada) {
			case '+': //Sube el volumen
				if (volumen<VOLUMEN_MAXIMO) 
					volumen++;
				break;
			case '-': //Baja el volumen
				if(volumen>VOLUMEN_MINIMO)
					volumen--;
				break;
			case '>'://Sube de canal
				break;
			case '<'://Baja de canal
				break;
			}
		}		
	}
	
	public void volverAlCanalAnterior() {
		Canal valorAuxiliar;
		valorAuxiliar=canalActual;
		canalActual=canalAnterior;
		canalAnterior=valorAuxiliar;
	}
	
	public void silenciar() {
		volumen=0;
	}	
	
	public TipoEntrada getEntradaActual(){
		return entradaTV;
	}
	public Canal getCanalActual() {
		return canalActual;
	}
	
	public int getVolumenActual(){
		return volumen;
	}
	
	public void cambiarDeCanal(int canalDeseado) {
		switch (entradaTV) {
		case TV_AIRE:	

			break;
		case TV_CABLE:

			break;
		default:
			
		}
	}
	
	public void cambiarDeCanal(int primerDigito, int segundoDigito) {		
		cambiarDeCanal(primerDigito*10+segundoDigito);
	}
	
	public void cambiarDeCanal(int primerDigito, int segundoDigito, int tercerDigito) {
		cambiarDeCanal(primerDigito*100+segundoDigito*10+tercerDigito);
	}
	
	public void cambiarDeCanal(int primerDigito, int segundoDigito, int tercerDigito, int cuartoDigito) {
		cambiarDeCanal(primerDigito*1000+segundoDigito*100+tercerDigito*10+cuartoDigito);
	}
	
	public Canal configurarNuevoCanal(int numeroCanal, String descripcionCanal, boolean closedCaption, boolean sonidoStereo) {
		Canal nuevoCanal=new Canal(numeroCanal,descripcionCanal,closedCaption,sonidoStereo);
		return nuevoCanal;
	}
	
	public boolean agregarCanalAire(Canal nuevoCanal) {
		if (nuevoCanal.getNumeroCanal()>=CANAL_MINIMO && nuevoCanal.getNumeroCanal()<=CANAL_MAXIMO_AIRE)
		for (int i=0;i<canalesAire.length;i++) {
			if (canalesAire[i]==null) {
				canalesAire[i]=nuevoCanal;
				return true;
			}
		}
		return false;
	}
	
	public boolean agregarCanalCable(Canal nuevoCanal) {
		if (nuevoCanal.getNumeroCanal()>=CANAL_MINIMO && nuevoCanal.getNumeroCanal()<=CANAL_MAXIMO_CABLE)
		for (int i=0;i<canalesCable.length;i++) {
			if (canalesCable[i]==null) {
				canalesCable[i]=nuevoCanal;
				return true;
			}
		}
		return false;
	}
}
