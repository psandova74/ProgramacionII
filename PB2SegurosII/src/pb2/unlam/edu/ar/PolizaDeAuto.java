package pb2.unlam.edu.ar;

public class PolizaDeAuto extends SegurosGenerales implements InterfaseAuto{
	private Auto auto;

	public PolizaDeAuto(Integer numeroDePoliza, Persona asegurado, Double sumaAsegurada, Double prima) {
		super(numeroDePoliza, asegurado, sumaAsegurada, prima);
	}

	

	protected Auto getAuto() {
		return auto;
	}



	protected void setAuto(Auto auto) {
		this.auto = auto;
	}


	public boolean fueRobado() {
		return this.isSiniestro();
	}



	@Override
	public void agregarBienAsegurado(Auto auto) {
		this.auto=auto;
		
	}

}
