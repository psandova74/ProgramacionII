package SueldoEmpresa;

public class EmpleadoGerente extends EmpleadoPlantaPermanente {
	private static Double VALOR_HORA=4000.0;
	private static Double VALOR_ANIO_ANTIGUEDAD=1500.0;
	
	public EmpleadoGerente(Boolean casado, Integer horasTrabajadas, Integer cantHijosACargo, Integer antiguedad) {
		super(casado, horasTrabajadas, cantHijosACargo, antiguedad);
	}
	@Override
	public Double obtenerSueldo() {

		return VALOR_HORA* this.getHorasTrabajadas() + super.getAntiguedad() * VALOR_ANIO_ANTIGUEDAD + super.getSalarioFamiliar();
	}

}
