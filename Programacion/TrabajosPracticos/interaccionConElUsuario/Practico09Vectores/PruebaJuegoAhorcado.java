package Practico09Vectores;

import java.util.Scanner;
public class PruebaJuegoAhorcado {

	public static void main(String[] args) {
		String palabraIngresada="";
		Scanner teclado=new Scanner(System.in);
		char letraIngresada='\0';
		Ahorcado nuevoJuego=new Ahorcado();
		System.out.println("-----------------------------------");
		System.out.println("Bienvenido al juego del Ahorcado");
		System.out.println("Ingrese palabra sin que mire tu competidor: ");
		palabraIngresada=teclado.next();
		nuevoJuego.ingresarPalabraOculta(palabraIngresada);
		System.out.println("-----------------------------------");
		do {
			
			do {
				System.out.println("-----------------------------------");
				System.out.println("Juego del Ahorcado");
				System.out.println(nuevoJuego.getPalabraDescubierta());
				System.out.println("1. Adivinar una letra");
				System.out.println("2. Arriesgar");
				System.out.println("-----------------------------------");
				letraIngresada=teclado.next().charAt(0);
			} while(letraIngresada!='1' && letraIngresada!='2');
			
			if (letraIngresada=='2') {
				System.out.println("Ingrese la palabra que arriesga");
				palabraIngresada=teclado.next().toUpperCase();
				if (nuevoJuego.arriesgarPalabra(palabraIngresada)) {
					System.out.println("Correcto, acerto la palabra");
				}else {
					System.out.println("Incorrecto. Le quedan "+nuevoJuego.getIntentosPalabra()+" para arriesgar la palabra" );
				}
			} else {
				System.out.println(nuevoJuego.getPalabraDescubierta());
				System.out.println("Ingresar una letra: ");
				letraIngresada=teclado.next().charAt(0);
				if (nuevoJuego.arriesgarLetra(letraIngresada)) {
					System.out.println("Correcto, acerto la letra");
				}else {
					System.out.println("Incorrecto. Le quedan "+nuevoJuego.getIntentosFallidos()+" para arriesgar letras" );
				}
			}
		} while (!nuevoJuego.adivinoPalabra() && nuevoJuego.getIntentosPalabra()!=0 && nuevoJuego.getIntentosFallidos()!=0 );
		
		System.out.println("-----------------------------------");
		if (nuevoJuego.adivinoPalabra())
			System.out.println("Felicitaciones, Gano el juego");
		else
			System.out.println("Game over");
		System.out.println("-----------------------------------");
		teclado.close();
	}
	
	public static void limpiarPantalla() {
		for (int i=0;i<100;i++) {
			System.out.println();
		}
		
	}

}
