package ar.edu.unlam.basica2.clase12;

import static org.junit.Assert.*;

import ar.edu.unlam.basica2.Anfibio;
import ar.edu.unlam.basica2.Animal;
import ar.edu.unlam.basica2.Pez;
import ar.edu.unlam.basica2.TestNaturaleza;
import ar.edu.unlam.basica2.clase11.*;

import org.junit.Test;

public class TestArrays {
	
	/* Beneficios: Eficiencia y tipo (Se crean para un tipo espec�fico). �nica opci�n para guardar tipos de datos primitivos
		Contras: Tama�o limitado
	*/
	@Test
	public void test() {
		//Distintas formas de inicializaci�n
		
		Animal deRio[]; // Referencia Null
		Animal zoologico[] = new Animal[100]; 
				
		for(int i=0; i<zoologico.length; i++){
			zoologico[i] = TestNaturaleza.crearAnimales();
		}
		
		deRio = new Animal[] {new Pez("", "", ""), new Anfibio("", "", "")};
		
		// Eficiencia
		System.out.println("Quinto animal del zoologico: " + zoologico[4]);	
	}

}
