package SueldoEmpresa;

import org.junit.Test;

import SueldoEmpresa.Empleado;
import SueldoEmpresa.EmpleadoGerente;
import SueldoEmpresa.EmpleadoPlantaPermanente;
import SueldoEmpresa.EmpleadoPlantaTemporaria;
import junit.framework.Assert;

public class empresaTest {

	@Test
	public void testEmpleadoPlantaTemporaria() {
	//Un empleado de Planta Temporaria con 80 horas trabajadas, con esposa y sin hijos.
		Empleado empleado =crearEmpleadoPlantaTemporaria();
		Double valorEsperado=161000.0;
		Assert.assertEquals(valorEsperado, empleado.obtenerSueldo(),0.01);
	}
	
	@Test
	public void testEmpleadoPlantaPermanente80Horas() {
		// Un empleado de Planta Permanente (que no sea gerente) con 80 horas trabajadas, con esposa, 2 hijos y 6 años de antigüedad.
		Empleado empleado =crearEmpleadoPlantaPermanente80Horas();
		Double valorEsperado=251000.0;
		Assert.assertEquals(valorEsperado, empleado.obtenerSueldo(),0.01);
		
	}
	
	@Test
	public void testEmpleadoPlantaPermanente160Horas() {
		// Un empleado de Planta Permanente (que no sea gerente) con 160 horas trabajadas, sin esposa, sin hijos y con 4 años de antigüedad.
		Empleado empleado=crearEmpleadoPlantaPermanente160Horas();
		Double valorEsperado=484000.0;
		Assert.assertEquals(valorEsperado, empleado.obtenerSueldo(),0.01);
	}

	@Test
	public void testEmpleadoGerente160Horas() {
		//Un Gerente con 160 horas trabajadas, con esposa, un hijo y 10 años de antigüedad.
		Empleado empleado=crearEmpleadoGerente160Horas();
		Double valorEsperado=658000.0;
		Assert.assertEquals(valorEsperado, empleado.obtenerSueldo(),0.01);
	}
	
	@Test
	public void testCrearEmpresa() {
		//Una empresa, con el CUIT y Razón Social que desee, y con los cuatro empleados de los escenarios anteriores.
		Empresa empresa=new Empresa("33-4556677-8","Nueva Razon Social");
		empresa.agregarEmpleado(crearEmpleadoPlantaTemporaria());
		empresa.agregarEmpleado(crearEmpleadoPlantaPermanente80Horas());
		empresa.agregarEmpleado(crearEmpleadoPlantaPermanente160Horas());
		empresa.agregarEmpleado(crearEmpleadoGerente160Horas());
		Double totalSueldoEmpresa=empresa.totalSueldoEmpresa();
		Double valorEsperado=1554000.0;
		Assert.assertEquals(valorEsperado, totalSueldoEmpresa,0.01);
	}
	 
	public Empleado crearEmpleadoPlantaTemporaria() {
		Integer horasTrabajadas=80;
		Integer hijosACargo=0;
		Boolean casado=true;
		Empleado empleado =new EmpleadoPlantaTemporaria(casado,horasTrabajadas,hijosACargo);
		return empleado;
	}
	
	public Empleado crearEmpleadoPlantaPermanente80Horas() {
		Integer horasTrabajadas=80;
		Integer hijosACargo=2;
		Boolean casado=true;
		Integer antiguedad=6;
		Empleado empleado =new EmpleadoPlantaPermanente(casado,horasTrabajadas,hijosACargo,antiguedad);
		return empleado;
	}
	
	public Empleado crearEmpleadoPlantaPermanente160Horas() {
		Integer horasTrabajadas=160;
		Integer hijosACargo=0;
		Boolean casado=false;
		Integer antiguedad=4;
		Empleado empleado =new EmpleadoPlantaPermanente(casado,horasTrabajadas,hijosACargo,antiguedad);
		return empleado;
	}
	
	public Empleado crearEmpleadoGerente160Horas() {
		Integer horasTrabajadas=160;
		Integer hijosACargo=1;
		Boolean casado=true;
		Integer antiguedad=10;
		Empleado empleado =new EmpleadoGerente(casado,horasTrabajadas,hijosACargo,antiguedad);
		return empleado;
	}
	
	

}
