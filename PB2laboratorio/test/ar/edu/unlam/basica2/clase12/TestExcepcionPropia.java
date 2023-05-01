package ar.edu.unlam.basica2.clase12;

import org.junit.Test;

import ar.edu.unlam.basica2.clase12.ExceptionProgramacionBasica2;

public class TestExcepcionPropia {

	public void f() throws ExceptionProgramacionBasica2{
		System.out.println("Lanzando excepci�n sensilla");
		//throw new ExceptionProgramacionBasica2("No es un error, sino una prueba");
		throw new ExceptionProgramacionBasica2();
	}
	
	@Test
	public void testManejoExcepcion(){
		TestExcepcionPropia exc = new TestExcepcionPropia();
		try{
			exc.f();
		}catch(ExceptionProgramacionBasica2 e){
			e.printStackTrace();
			System.err.println("Esta es una prueba del lanzamiento de una excepci�n");
		}finally{
			// Bloque de c�digo que se ejecuta siempre..
		}
	}
}
