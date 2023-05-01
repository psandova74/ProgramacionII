package TV;

public class Televisor {
	private final byte VOLUMEN_MAXIMO = 100;
	private final byte VOLUMEN_MINIMO = 0;
	private final int CANAL_MINIMO = 0;
	private final int CANAL_MAXIMO_AIRE;
	private final int CANAL_MAXIMO_CABLE;
	private final int UNIDAD_DE_MIL = 1000;
	private final byte CENTENA = 100;
	private final byte DECENA = 10;
	private byte volumen;
	private TipoDeEntrada modoDeEntrada;
	private Canal canalesAire[];
	private Canal canalesCable[];
	private boolean encendidoOApagado;
	private int canalActual;
	private int canalAnterior;
	private long  numeroDeSerie;
	private static long numeroDeSerieTotal = 0;

	public Televisor() {
		CANAL_MAXIMO_AIRE = 127;
		CANAL_MAXIMO_CABLE = 32767;
		volumen = 0;
		modoDeEntrada = TipoDeEntrada.TELEVISION_DE_CABLE;
		canalesAire = new Canal[CANAL_MAXIMO_AIRE];
		canalesCable = new Canal[CANAL_MAXIMO_CABLE];
		encendidoOApagado = false;
		canalAnterior = 0;
		canalActual = 0;
		numeroDeSerieTotal++;
		numeroDeSerie = numeroDeSerieTotal;
		inicializarCanalesDeAire();
		inicializarCanalesDeCable();
	}

	public Televisor(int canalMaximoAire, int canalMaximoCable) {
		CANAL_MAXIMO_AIRE = canalMaximoAire;
		CANAL_MAXIMO_CABLE = canalMaximoCable;
		volumen = 0;
		modoDeEntrada = TipoDeEntrada.TELEVISION_DE_CABLE;
		canalesAire = new Canal[CANAL_MAXIMO_AIRE];
		canalesCable = new Canal[CANAL_MAXIMO_CABLE];
		encendidoOApagado = false;
		canalAnterior = 0;
		canalActual = 0;
		numeroDeSerieTotal++;
		numeroDeSerie = numeroDeSerieTotal;
		inicializarCanalesDeAire();
		inicializarCanalesDeCable();
	}

	public long  getNumeroDeSerie() {
		return numeroDeSerie;
	}

	public void inicializarCanalesDeAire() {
		Canal canalACargar;
		for (int i = 0; i < CANAL_MAXIMO_AIRE; i++) {
			canalACargar = new Canal(i, "S/N", false, true);
			canalesAire[i] = canalACargar;
		}
	}

	public void inicializarCanalesDeCable() {
		Canal canalACargar;
		for (int i = 0; i < CANAL_MAXIMO_CABLE; i++) {
			canalACargar = new Canal(i, "S/N", false, true);
			canalesCable[i] = canalACargar;
		}
	}

	public TipoDeEntrada getmodoDeEntrada() {
		return modoDeEntrada;
	}
	
	public Canal getInformacionCanalActual() {
		if (isEncendido() && modoDeEntrada==TipoDeEntrada.TELEVISION_DE_AIRE) {
			return canalesAire[canalActual];
		}
		if (isEncendido() && modoDeEntrada==TipoDeEntrada.TELEVISION_DE_CABLE) {
			return canalesCable[canalActual];
		}
		return null;
	}

	public int getCanalActual() {
		return canalActual;
	}

	public void seleccionarEntrada(TipoDeEntrada modoDeEntrada) {
		if (isEncendido()) {
			if (TipoDeEntrada.TELEVISION_DE_AIRE == modoDeEntrada
					|| TipoDeEntrada.TELEVISION_DE_CABLE == modoDeEntrada) {
				canalActual = 0;
				canalAnterior = 0;
			}
			this.modoDeEntrada = modoDeEntrada;
		}
	}

	public byte getVolumen() {
		return volumen;
	}

	public void setVolumen(byte volumen) {
		this.volumen = volumen;
	}

	public Canal[] getCanalesAire() {
		return canalesAire;
	}

	public void setCanalesAire(Canal[] canalesAire) {
		this.canalesAire = canalesAire;
	}

	public Canal[] getCanalesCable() {
		return canalesCable;
	}

	public void setCanalesCable(Canal[] canalesCable) {
		this.canalesCable = canalesCable;
	}

	public byte getVOLUMEN_MAXIMO() {
		return VOLUMEN_MAXIMO;
	}

	public byte getVOLUMEN_MINIMO() {
		return VOLUMEN_MINIMO;
	}

	public int getCANAL_MINIMO() {
		return CANAL_MINIMO;
	}

	public int getCANAL_MAXIMO_AIRE() {
		return CANAL_MAXIMO_AIRE;
	}

	public int getCANAL_MAXIMO_CABLE() {
		return CANAL_MAXIMO_CABLE;
	}

	public boolean isEncendido() {
		return encendidoOApagado;
	}

	public void encenderOApagar() {
		if (isEncendido()) {
			encendidoOApagado = false;
		} else {
			encendidoOApagado = true;
			modoDeEntrada = TipoDeEntrada.TELEVISION_DE_CABLE;
			canalAnterior = 0;
			canalActual = 0;
		}
	}

	public String toString() {
		String display = "Televisor Apagado";
		if (isEncendido()) {
			switch (modoDeEntrada) {
			case TELEVISION_DE_CABLE:
				display = "Tipo de Entrada= " + this.modoDeEntrada + "\nCanal= " + this.canalActual + "\n"
						+ this.canalesCable[this.canalActual].getDescripcionCanal() + "\nVolumen= " + this.volumen;
				break;
			case TELEVISION_DE_AIRE:
				display = "Tipo de Entrada= " + this.modoDeEntrada + "\nCanal= " + this.canalActual + "\n"
						+ this.canalesAire[this.canalActual].getDescripcionCanal() + "\nVolumen= " + this.volumen;
				break;
			case HDMI1:
			case HDMI2:
			case USB:
				display = "Tipo de Entrada= " + this.modoDeEntrada;
				break;
			}
		}
		return display;
	}

	public boolean subirOBajarAnalogicamente(char operacion) {
		boolean sePuedoRealizar = false;
		if (isEncendido() && (TipoDeEntrada.TELEVISION_DE_AIRE == modoDeEntrada
				|| TipoDeEntrada.TELEVISION_DE_CABLE == modoDeEntrada)) {
			switch (operacion) {
			case '+':
				if (volumen < VOLUMEN_MAXIMO) {
					volumen++;
					sePuedoRealizar = true;
				}
				break;
			case '-':
				if (volumen > VOLUMEN_MINIMO) {
					volumen--;
					sePuedoRealizar = true;
				}
				break;
			case '>':
				if (modoDeEntrada == TipoDeEntrada.TELEVISION_DE_CABLE) {
					if (canalActual < CANAL_MAXIMO_CABLE - 1) {
						canalAnterior = canalActual;
						canalActual++;
						sePuedoRealizar = true;
					}
				} else {
					if (canalActual < CANAL_MAXIMO_CABLE - 1) {
						canalAnterior = canalActual;
						canalActual++;
						sePuedoRealizar = true;
					}
				}
				break;
			case '<':
				if (canalActual > CANAL_MINIMO) {
					canalAnterior = canalActual;
					canalActual--;
					sePuedoRealizar = true;
				}
				break;
			}
		}
		return sePuedoRealizar;
	}

	public boolean cambiarCanal(byte canalDeseado) {
		boolean sePuedoRealizar = false;
		if (isEncendido() && TipoDeEntrada.TELEVISION_DE_CABLE == modoDeEntrada && canalDeseado >= CANAL_MINIMO
				&& canalDeseado < CANAL_MAXIMO_CABLE) {
			canalAnterior = canalActual;
			canalActual = canalDeseado;
			sePuedoRealizar = true;
		}
		if (isEncendido() && TipoDeEntrada.TELEVISION_DE_AIRE == modoDeEntrada && canalDeseado >= CANAL_MINIMO
				&& canalDeseado < CANAL_MAXIMO_AIRE) {
			canalAnterior = canalActual;
			canalActual = canalDeseado;
			sePuedoRealizar = true;
		}
		return sePuedoRealizar;
	}

	public boolean cambiarCanal(byte primerDigito, byte segundoDigito) {
		boolean sePuedoRealizar = false;
		int canalDeseado = primerDigito * DECENA + segundoDigito;
		if (isEncendido() && TipoDeEntrada.TELEVISION_DE_CABLE == modoDeEntrada && canalDeseado >= CANAL_MINIMO
				&& canalDeseado < CANAL_MAXIMO_CABLE) {
			canalAnterior = canalActual;
			canalActual = canalDeseado;
			sePuedoRealizar = true;
		}
		if (isEncendido() && TipoDeEntrada.TELEVISION_DE_AIRE == modoDeEntrada && canalDeseado >= CANAL_MINIMO
				&& canalDeseado < CANAL_MAXIMO_AIRE) {
			canalAnterior = canalActual;
			canalActual = canalDeseado;
			sePuedoRealizar = true;
		}
		return sePuedoRealizar;
	}

	public boolean cambiarCanal(byte primerDigito, byte segundoDigito, byte tercerDigito) {
		boolean sePuedoRealizar = false;
		int canalDeseado = primerDigito * CENTENA + segundoDigito * DECENA + tercerDigito;
		if (isEncendido() && TipoDeEntrada.TELEVISION_DE_CABLE == modoDeEntrada && canalDeseado >= CANAL_MINIMO
				&& canalDeseado < CANAL_MAXIMO_CABLE) {
			canalAnterior = canalActual;
			canalActual = canalDeseado;
			sePuedoRealizar = true;
		}
		if (isEncendido() && TipoDeEntrada.TELEVISION_DE_AIRE == modoDeEntrada && canalDeseado >= CANAL_MINIMO
				&& canalDeseado < CANAL_MAXIMO_AIRE) {
			canalAnterior = canalActual;
			canalActual = canalDeseado;
			sePuedoRealizar = true;
		}
		return sePuedoRealizar;
	}

	public boolean cambiarCanal(byte primerDigito, byte segundoDigito, byte tercerDigito, byte cuartoDigito) {
		boolean sePuedoRealizar = false;
		int canalDeseado = primerDigito * UNIDAD_DE_MIL + segundoDigito * CENTENA + tercerDigito * DECENA
				+ cuartoDigito;
		if (isEncendido() && TipoDeEntrada.TELEVISION_DE_CABLE == modoDeEntrada && canalDeseado >= CANAL_MINIMO
				&& canalDeseado < CANAL_MAXIMO_CABLE) {
			canalAnterior = canalActual;
			canalActual = canalDeseado;
			sePuedoRealizar = true;
		}
		if (isEncendido() && TipoDeEntrada.TELEVISION_DE_AIRE == modoDeEntrada && canalDeseado >= CANAL_MINIMO
				&& canalDeseado < CANAL_MAXIMO_AIRE) {
			canalAnterior = canalActual;
			canalActual = canalDeseado;
			sePuedoRealizar = true;
		}
		return sePuedoRealizar;
	}

	public boolean volverAlCanalAnterior() {
		boolean sePuedoRealizar = false;
		int canalAuxiliar;
		if (isEncendido() && (TipoDeEntrada.TELEVISION_DE_AIRE == modoDeEntrada
				|| TipoDeEntrada.TELEVISION_DE_CABLE == modoDeEntrada)) {
			canalAuxiliar = canalActual;
			canalActual = canalAnterior;
			canalAnterior = canalAuxiliar;
			sePuedoRealizar = true;
		}
		return sePuedoRealizar;
	}

	public boolean silenciar() {
		boolean sePuedoRealizar = false;
		if (isEncendido() && (TipoDeEntrada.TELEVISION_DE_AIRE == modoDeEntrada
				|| TipoDeEntrada.TELEVISION_DE_CABLE == modoDeEntrada)) {
			volumen = 0;
			sePuedoRealizar = true;
		}
		return sePuedoRealizar;
	}

	public boolean agregarCanal(Canal nuevoCanal) {
		boolean sePudoRealizar = false;
		if (isEncendido() && TipoDeEntrada.TELEVISION_DE_AIRE == modoDeEntrada
				&& nuevoCanal.getNumeroCanal() >= CANAL_MINIMO && nuevoCanal.getNumeroCanal() < CANAL_MAXIMO_AIRE) {
			canalesAire[nuevoCanal.getNumeroCanal()].setDescripcionCanal(nuevoCanal.getDescripcionCanal());
			canalesAire[nuevoCanal.getNumeroCanal()].setCloseCaption(nuevoCanal.isCloseCaption());
			canalesAire[nuevoCanal.getNumeroCanal()].setSonidoStereo(nuevoCanal.isSonidoStereo());
			sePudoRealizar = true;
		}
		if (isEncendido() && TipoDeEntrada.TELEVISION_DE_CABLE == modoDeEntrada
				&& nuevoCanal.getNumeroCanal() >= CANAL_MINIMO && nuevoCanal.getNumeroCanal() < CANAL_MAXIMO_CABLE) {
			canalesCable[nuevoCanal.getNumeroCanal()].setDescripcionCanal(nuevoCanal.getDescripcionCanal());
			canalesCable[nuevoCanal.getNumeroCanal()].setCloseCaption(nuevoCanal.isCloseCaption());
			canalesCable[nuevoCanal.getNumeroCanal()].setSonidoStereo(nuevoCanal.isSonidoStereo());
			;
			sePudoRealizar = true;
		}
		return sePudoRealizar;
	}
}
