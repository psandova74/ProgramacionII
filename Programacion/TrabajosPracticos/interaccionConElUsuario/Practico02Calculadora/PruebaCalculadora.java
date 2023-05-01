package Practico02Calculadora;

import java.util.Scanner;

public class PruebaCalculadora {
	public static void main(String[] args) {
		double operador1=0.0;
		double operador2=0.0;
		int operador=0;
		int potencia=0;
				
		char opcion='\0';
		Calculadora calculadoraCasio = new Calculadora();
		//Calculadora laCalculadoraDelCelu = new Calculadora(23.6,78.2);
		Scanner teclado = new Scanner(System.in) ;
		
		while(opcion!='s' && opcion!='S') {
			System.out.println("Bienvenidos a la calculadora Casio ");
			System.out.println("a - Suma");
			System.out.println("b - Resta");
			System.out.println("c - Multiplicacion");
			System.out.println("d - Division");
			System.out.println("e - Potencia");
			System.out.println("f - Sumatoria");
			System.out.println("g - Factorial");
			System.out.println("h - Divisores");
			System.out.println("s - Salir");
			opcion = teclado.next().charAt(0);
			
			switch(opcion) {
			case 'a':
			case 'A':			
				System.out.println("Ingrese el operador 1: ");
				operador1= teclado.nextDouble();
				System.out.println("Ingrese el operador 2: ");
				operador2= teclado.nextDouble();
				System.out.println("La suma es: "+ calculadoraCasio.sumar(operador1,operador2));
				break;
			case 'b':
			case 'B':
				System.out.println("Ingrese el operador 1: ");
				operador1= teclado.nextDouble();
				System.out.println("Ingrese el operador 2: ");
				operador2= teclado.nextDouble();
				System.out.println("La resta es: "+ calculadoraCasio.restar(operador1,operador2));
				break;
			case 'c':
			case 'C':
				System.out.println("Ingrese el operador 1: ");
				operador1= teclado.nextDouble();
				System.out.println("Ingrese el operador 2: ");
				operador2= teclado.nextDouble();
				System.out.println("La multiplicacion es: "+ calculadoraCasio.multiplicar(operador1,operador2));
				break;
			case 'd':
			case 'D':
				System.out.println("Ingrese el dividendo: ");
				operador1= teclado.nextDouble();
				System.out.println("Ingrese el divisor: ");
				operador2= teclado.nextDouble();
				if (calculadoraCasio.getOperador2()==0.0) 
					System.out.println("No se puede realizar division por cero");
				else
					System.out.println("La division es: "+ calculadoraCasio.dividir(operador1,operador2));
				break;
			case 'e':
			case 'E':
				System.out.println("Ingrese el operador: ");
				operador= teclado.nextInt();
				System.out.println("Ingrese el potencia: ");
				potencia= teclado.nextInt();
				System.out.println("La Potencia es: "+ calculadoraCasio.potencia(operador,potencia));
				break;
			case 'f':
			case 'F':
				System.out.println("Ingrese el limite: ");
				operador= teclado.nextInt();
				System.out.println("La Sumatoria es: "+ calculadoraCasio.sumatoria(operador));
				break;
			case 'g':
			case 'G':
				System.out.println("Ingrese el limite: ");
				operador= teclado.nextInt();
				System.out.println("El Factorial es: "+ calculadoraCasio.factorial(operador));
				break;	
			case 'h':
			case 'H':
				System.out.println("Ingrese el limite: ");
				operador= teclado.nextInt();
				System.out.println("La cantidad de Divisores es: "+ calculadoraCasio.contarDivisores(operador));
				break;
			case 's':
			case 'S':
				System.out.println("Saliendo de Calculadora");
				break;
			default:
				System.out.println("Error: la opcion seleccionada es incorrecta");
			}	
		}
		teclado.close();
	}
}
