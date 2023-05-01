package ar.edu.unlam.pb2.eva03;

public class PolizaDeAuto extends SegurosGenerales{
	private Auto auto;

	public PolizaDeAuto(Integer numeroDePoliza, Persona asegurado, Double sumaAsegurada, Double prima) {
		super(numeroDePoliza, asegurado, sumaAsegurada, prima);
	}

	@Override
	public Auto getAuto() {
		return this.auto;
	}

	@Override
	public void agregarBienAsegurado(Auto auto) {
		this.auto=auto;
		
	}

	public boolean fueRobado() {
		return this.isSiniestro();
	}

}
