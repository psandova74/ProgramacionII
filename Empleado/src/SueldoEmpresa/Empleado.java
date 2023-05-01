package SueldoEmpresa;

public abstract class Empleado {
	private Boolean casado;
	private Integer HorasTrabajadas;
	private Integer cantHijosACargo;
	private static Double VALOR_HIJO=2000.0;
	private static Double VALOR_CONYUGE=1000.0;

	 
	
	public Empleado(Boolean casado, Integer horasTrabajadas, Integer cantHijosACargo) {
		super();
		this.casado = casado;
		HorasTrabajadas = horasTrabajadas;
		this.cantHijosACargo = cantHijosACargo;
	}

	public abstract Double obtenerSueldo();
	
	public Double getSalarioFamiliar() {
		Double salarioFamiliar=this.cantHijosACargo *VALOR_HIJO;
		if (this.casado) {
			salarioFamiliar+=VALOR_CONYUGE;
		}
		return salarioFamiliar;
	}

	protected Integer getHorasTrabajadas() {
		return HorasTrabajadas;
	}


	
	
}
