package SueldoEmpresa;

public class EmpleadoPlantaPermanente extends Empleado {
	private Integer antiguedad;
	private static Double VALOR_HORA =3000.00;
	private static Double VALOR_ANIO_ANTIGUEDAD=1000.0;
	
	
	
	public EmpleadoPlantaPermanente(Boolean casado, Integer horasTrabajadas, Integer cantHijosACargo,Integer antiguedad) {
		super(casado, horasTrabajadas, cantHijosACargo);
		this.antiguedad=antiguedad;
	}

	public Integer getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(Integer antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	@Override
	public Double obtenerSueldo() {
		Double salario=0.0;
		salario = VALOR_HORA* super.getHorasTrabajadas() + this.antiguedad *VALOR_ANIO_ANTIGUEDAD + super.getSalarioFamiliar();
		return salario;
	}
	
}
