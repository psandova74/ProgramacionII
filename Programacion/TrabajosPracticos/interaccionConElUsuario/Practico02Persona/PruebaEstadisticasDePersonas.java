package Practico02Persona;

import java.util.Scanner;


public class PruebaEstadisticasDePersonas {
// Practico 06 - Ejercicio 4
	public static void main(String[] args) {

		Persona nueva;
		Scanner teclado = new Scanner(System.in);
		int numeroDePersona=1, cantidadDePersonasConBajoPeso=0, cantidadDePersonasConPesoNormal=0, cantidadDePersonasConSobrePeso=0, sumatoriaDeLaEdadConBajoPeso=0, sumatoriaDeLaEdadConSobrePeso=0;
		final int MUESTRA = 5;
		double sumatoriaDelPeso = 0.0, pesoPromedio = 0.0, promedioEdadConBajoPeso=0.0, promedioEdadConSobrePeso=0.0;
		
		while(numeroDePersona<=MUESTRA) {
			nueva = ingresarUnaNuevaPersona(teclado);
			sumatoriaDelPeso += nueva.getPeso();
			switch(nueva.calcularIMC()) {
			case BAJO_PESO:
				cantidadDePersonasConBajoPeso++;
				sumatoriaDeLaEdadConBajoPeso+=nueva.getEdad();
				break;
			case NORMO_PESO:
				cantidadDePersonasConPesoNormal++;
				break;
			case SOBRE_PESO:
				cantidadDePersonasConSobrePeso++;
				sumatoriaDeLaEdadConSobrePeso+=nueva.getEdad();
				break;
			}
			System.out.println(nueva.calcularIMC());
			numeroDePersona++;
		}
		if(numeroDePersona!=0) {
			pesoPromedio = sumatoriaDelPeso / numeroDePersona;
		}
		if(cantidadDePersonasConBajoPeso!=0) {
			promedioEdadConBajoPeso = sumatoriaDeLaEdadConBajoPeso/cantidadDePersonasConBajoPeso;
		}
		if(cantidadDePersonasConSobrePeso!=0) {
			promedioEdadConSobrePeso = sumatoriaDeLaEdadConSobrePeso/cantidadDePersonasConSobrePeso;
		}

		System.out.println("Peso promedio: " + pesoPromedio);
		System.out.println("Cantidad de personas bajo peso: " + cantidadDePersonasConBajoPeso);
		System.out.println("Cantidad de personas normo peso: " + cantidadDePersonasConPesoNormal);
		System.out.println("Cantidad de personas sobre peso: " + cantidadDePersonasConSobrePeso);
		System.out.println("Edad promedio de personas con bajo peso: " + promedioEdadConBajoPeso);
		System.out.println("Edad promedio de personas con sobre peso: " + promedioEdadConSobrePeso);
		teclado.close();
	}
	
	private static Persona ingresarUnaNuevaPersona(Scanner teclado) {
		int  edad;
		double peso, altura;
		
		Persona actual;
		
		System.out.println("Ingrese el peso:");
		peso = teclado.nextDouble();
		System.out.println("Ingrese la altura:");
		altura = teclado.nextDouble();
		System.out.println("Ingrese la edad:");
		edad = teclado.nextInt();
		actual = new Persona(peso, altura, edad);

		return actual;
	}
}
