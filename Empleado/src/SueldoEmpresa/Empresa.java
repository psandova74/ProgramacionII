package SueldoEmpresa;

import java.util.LinkedList;

public class Empresa {
	private String cuit;
	private String razonSocial;
	private LinkedList <Empleado> listaEmpleados= new LinkedList<Empleado>();
	
	public Empresa(String cuit, String razonSocial) {
		this.cuit=cuit;
		this.razonSocial=razonSocial;
	}
	
	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	

	public void agregarEmpleado(Empleado empleado) {
		this.listaEmpleados.add(empleado);
	}
	
	public Double totalSueldoEmpresa() {
		Double totalSueldo=0.0;
		for (Empleado empleado : listaEmpleados) {
			totalSueldo+=empleado.obtenerSueldo();
        }
		return totalSueldo;
	}
	

}
