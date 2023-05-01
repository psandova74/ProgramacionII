package ar.edu.unlam.basica2.clase12;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;

import org.junit.Test;

import ar.edu.unlam.basica2.clase12.ManejoContenedores;

public class TestMap {
	
	/*
	 * Map (Mapa): Grupo de pares de objetos clave-valor.
	 * Si bien a simple vista parecer�a una colecci�n de pares, cuando se la busca implementar de 
	 * esta manera su dise�o se vuelve complicado.
	 * Un mapa puede devolver un conjunto (Set) de sus claves, una colecci�n de sus valores, o un 
	 * conjunto de sus pares.
	 * Los mapas al igual que los arrays pueden extenderse a m�ltiples dimensiones, simplemente
	 * construyendo mapas cuyos valores son mapas.
	 */
	
	ManejoContenedores c;

	@Test
	public void testRellenarHasMap() {
		c = new ManejoContenedores();
		
		System.out.println(c.rellenar(new HashMap()));
	}

}
