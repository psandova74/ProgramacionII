package SueldoEmpresa;

public class EmpleadoPlantaTemporaria extends Empleado {
	private static Double VALOR_HORA=2000.0;
		
	public EmpleadoPlantaTemporaria(Boolean casado, Integer horasTrabajadas, Integer cantHijosACargo) {
		super(casado, horasTrabajadas, cantHijosACargo);
	}


	@Override
	public Double obtenerSueldo() {
		return super.getHorasTrabajadas()* VALOR_HORA + super.getSalarioFamiliar();
	}

}
