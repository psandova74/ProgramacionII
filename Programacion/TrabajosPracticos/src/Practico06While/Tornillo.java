package Practico06While;

public class Tornillo {
	private TipoDeCabeza tipoDeCabeza;
	private final int LONGITUD;
	private final int CANTIDAD_DE_ROSCA;
	private int posicionActual;

	public Tornillo(TipoDeCabeza tipoDeCabeza,int longitud, int cantidadDeRoscas) {
		this.tipoDeCabeza =tipoDeCabeza;
		this.LONGITUD=longitud;
		this.CANTIDAD_DE_ROSCA=cantidadDeRoscas;
		this.posicionActual=0;
	}

	public int getPosicionActual() {
		return posicionActual;
	}

	public void setPosicionActual(int posicionActual) {
		this.posicionActual = posicionActual;
	}

	public void setTipoDeCabeza(TipoDeCabeza tipoDeCabeza) {
		this.tipoDeCabeza = tipoDeCabeza;
	}

	public TipoDeCabeza getTipoDeCabeza() {
		return tipoDeCabeza;
	}

	public int getLONGITUD() {
		return LONGITUD;
	}

	public int getCANTIDAD_DE_ROSCA() {
		return CANTIDAD_DE_ROSCA;
	}
	
	public boolean girar(SentidoDeGiro sentido) {
		boolean sePudoGirar = false;
		
		switch(sentido) {
		case HORARIO:
			if(posicionActual<CANTIDAD_DE_ROSCA) {
				posicionActual++;
				sePudoGirar=true;
			}else {
				sePudoGirar=false;
			}
			break;
		case ANTIHORARIO:
			if(posicionActual>0) {
				posicionActual--;
				sePudoGirar=true;
			}else {
				sePudoGirar=false;
			}
			break;
		default:
			sePudoGirar=false;
				
		}
			
		return sePudoGirar;
	}

	}
