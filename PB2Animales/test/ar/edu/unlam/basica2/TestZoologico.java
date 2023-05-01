package ar.edu.unlam.basica2;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestZoologico {

	@Test
	public void testQueVerificaQueAlAcuarioSoloSePuedanIngresarNadadores() {
		ArrayList<Animal> animales = new ArrayList<Animal>();
		ArrayList<Nadador> acuario = new ArrayList<Nadador>();
		
		animales.add(new Pez("Peque�a", "De muchos colores", "De colores"));
		animales.add(new Pez("Con dientes filosos", "Largo", "Largas"));
		animales.add(new Carnivoro("Con melena", "Con pelo corto", "Cuatro patas y cola"));
		animales.add(new Anfibio("Redonda", "Redondo", "Cortas"));
		
		for(Animal actual: animales) {
			acuario.add((Nadador)actual);
			if(actual instanceof Nadador) {
				acuario.add((Nadador)actual);
			}
		}
	}
	
	@Test
	public void testNullPointerException(){
		Animal zoologicoDeBuenosAires[];
		
		// El compilador no nos deja cometer errores
		//zoologico[2] = new Anfibio("", "", "");
		
		zoologicoDeBuenosAires = TestNaturaleza.ingresarAnimales();

		System.out.println("Los animales en este zoologico son:");
		for(Animal a:zoologicoDeBuenosAires){
			System.out.println(a.toString());
		}
		// Se podr�a resolver este problea con lenght?
		
		
	}
	
	@Test
	public void testManejarElNullPointerException(){
		// Capturando la excepci�n
		Animal zoologicoDeMendoza[];
		
		zoologicoDeMendoza = TestNaturaleza.ingresarAnimales();
		
		System.out.println("Los animales en este zoologico son:");
		try{
			for(Animal a:zoologicoDeMendoza){
				System.out.println(a.toString());
			}
		}catch(NullPointerException e){
			System.err.println("**** El zoologico no est� completo *****");
		}catch(Exception e){
			System.err.println("Excepci�n no determinada");
		}finally{
			// Bloque de c�digo que se ejecuta siempre
			// Ocurra la excepci�n o no.
			// Cerrar archivos abiertos, cerrar la conexi�n con la base de datos
			System.out.println("Chau");
		}
		
	}
}
