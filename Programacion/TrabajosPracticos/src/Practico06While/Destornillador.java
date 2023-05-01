package Practico06While;

public class Destornillador {
	private TipoDeCabeza tipoDeCabeza;

	public Destornillador(TipoDeCabeza tipoDeCabeza) {
		this.tipoDeCabeza=tipoDeCabeza;
	}
	
	
	
	public TipoDeCabeza getTipoDeCabeza() {
		return tipoDeCabeza;
	}

	public void destornillar(Tornillo tornilloActual) {
		boolean sePuedeSeguir=true;
		
		if(tornilloActual.getTipoDeCabeza()==tipoDeCabeza) {
			while(sePuedeSeguir) {
				sePuedeSeguir=tornilloActual.girar(SentidoDeGiro.ANTIHORARIO);
			}
		}		
	}
	
	public void  desatornillar(Tornillo tornilloActual, Tarugo tarugo) {
		boolean sePuedeSeguir=true;
		
		if((tornilloActual.getTipoDeCabeza()==tipoDeCabeza) && (tarugo.getLONGITUD()==tornilloActual.getLONGITUD())) {
			while(sePuedeSeguir) {
				sePuedeSeguir=tornilloActual.girar(SentidoDeGiro.ANTIHORARIO);
			}
		}	
	}
	
	public void atornillar(Tornillo tornilloActual) {
		boolean sePuedeSeguir=true;
		if(tornilloActual.getTipoDeCabeza()==tipoDeCabeza) {
			while (sePuedeSeguir) {
				sePuedeSeguir=tornilloActual.girar(SentidoDeGiro.HORARIO);
			}
		}
	}

	public void atornillar(Tornillo tornilloActual, Tarugo tarugo) {
		boolean sePuedeSeguir=true;
		if(tornilloActual.getTipoDeCabeza()==tipoDeCabeza&& tarugo.getLONGITUD()==tornilloActual.getLONGITUD()) {
			while(sePuedeSeguir) {
				sePuedeSeguir=tornilloActual.girar(SentidoDeGiro.HORARIO);
			}
		}
	}
	
	
	
}
