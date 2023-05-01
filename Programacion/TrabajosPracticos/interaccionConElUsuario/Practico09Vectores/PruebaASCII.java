package Practico09Vectores;

import java.util.Scanner;

public class PruebaASCII {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		char nuevaABC[];
		char nuevoNumerico[];
		char nuevoEspeciales[];
		char letraIngresada='\0';
		TablaASCII nuevoAscii= new TablaASCII();  
		
		
		
		do {
			System.out.println("------------------------");
			System.out.println("Practico 6 - Ejercicio 3");
			System.out.println("------------------------");
			System.out.println("a. Los caracteres numéricos ");
			System.out.println("b. Las letras minusculas ");
			System.out.println("c. Las letras mayusculas ");
			System.out.println("d. Los caracteres especiales ");
			System.out.println("s. Salir ");
			System.out.println("------------------------");
			letraIngresada=teclado.next().charAt(0);
			switch (letraIngresada) {
			case 'a':
			case 'A':
				System.out.println("------------------------");
				System.out.println("Valores Numericos:  ");
				nuevoAscii.cargarNumerico();;
				nuevoNumerico=nuevoAscii.getNumerico();
				System.out.println(nuevoNumerico);
				System.out.println(nuevoAscii.getValoresNumericos());
				System.out.println("------------------------");
				break;
			case 'b':
			case 'B':
				System.out.println("------------------------");
				System.out.println("Abecedario Minuscula:  ");
				nuevoAscii.cargarAbecedarioMinuscula();
				nuevaABC=nuevoAscii.getAbecedario();		
				System.out.println(nuevaABC);
				System.out.println(nuevoAscii.getAbecedarioMinuscula());
				System.out.println("------------------------");
				break;
			case 'c':
			case 'C':
				System.out.println("------------------------");
				System.out.println("Abecedario Mayuscula: ");
				nuevoAscii.cargarAbecedarioMayuscula();
				nuevaABC=nuevoAscii.getAbecedario();
				System.out.println(nuevaABC);
				System.out.println(nuevoAscii.getAbecedarioMayuscula());
				System.out.println("------------------------");
				break;
			case 'd':
			case 'D':
				System.out.println("------------------------");
				System.out.println("Caracteres Especiales:  ");
				nuevoAscii.cargarEspeciales();;
				nuevoEspeciales=nuevoAscii.getEspeciales();
				System.out.println(nuevoEspeciales);
				System.out.println(nuevoAscii.getValoresEspeciales());
				System.out.println("------------------------");
				break;
			case 's':
			case 'S':
				System.out.println("Saliendo");
				break;
			default:
				System.out.println("Opcion erronea ");
				
			}
			
		} while (letraIngresada!='S' && letraIngresada!='s');
		teclado.close();		
	}
	


	
}
