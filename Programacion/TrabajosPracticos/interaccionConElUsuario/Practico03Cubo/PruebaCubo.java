package Practico03Cubo;

import java.util.Scanner;

public class PruebaCubo {

	public static void main(String[] args) {
		float longitud=0.0F;
		Cubo pruebaCubo = new Cubo(0.0F);
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese la longitud del lado del Cubo: ");
		longitud = teclado.nextFloat();
		pruebaCubo.setLongitudLado(longitud);
		System.out.println("La superficie de una cara es: "+pruebaCubo.getSuperficieCara());
		System.out.println("El Volumen del cubo es: "+pruebaCubo.getVolumen());

		teclado.close();

	}

}
