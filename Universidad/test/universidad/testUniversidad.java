package universidad;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class testUniversidad {
	@Test
	public void agregarProfesor() {
		Universidad unlam=new Universidad("UNLAM");
		Profesor juan=new Profesor(1, "Juan");
		assertTrue(unlam.agregarProfesor(juan));
	}
	@Test
	public void queNoPermitaAgregarProfesorDuplicado() {
		Universidad unlam=new Universidad("UNLAM");
		Profesor juan=new Profesor(1, "Juan");
		Profesor otro=new Profesor(1, "Juan");
		unlam.agregarProfesor(juan);
		assertFalse(unlam.agregarProfesor(otro));
	}	
	@Test
	public void queSePuedaBorrarUnaMateria() {
		Universidad unlam=new Universidad("UNLAM");
		Materia programacion=new Materia(1, "Programacion");
		Materia informatica=new Materia(2, "Informatica");
		Integer ve=0;
		assertEquals(ve, unlam.sizeMateria());
		unlam.agregarMateria(informatica);
		unlam.agregarMateria(programacion);
		ve=2;
		assertEquals(ve, unlam.sizeMateria());
		assertTrue(unlam.eliminarMateria(2));
		ve=1;
		assertEquals(ve, unlam.sizeMateria());
	}
	
	@Test
	public void queAgregeCurso() {
		Universidad unlam=new Universidad("UNLAM");
		Profesor juan=new Profesor(1, "Juan");
		Profesor otro=new Profesor(2, "Pedro");
		Materia programacion=new Materia(1, "Programacion");
		unlam.agregarMateria(programacion);
		unlam.agregarProfesor(juan);
		unlam.agregarProfesor(otro);
		Curso curso =new Curso(1,"Programacion",programacion);
		assertNotNull(curso);
	}	

}
