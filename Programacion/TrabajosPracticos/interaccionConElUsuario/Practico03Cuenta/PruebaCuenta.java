package Practico03Cuenta;

import java.util.Scanner;
public class PruebaCuenta {

	public static void main(String[] args) {
		Cuenta usuario_1 = new Cuenta();
		Cuenta usuario_2 = new Cuenta();
		int numeroDeCuenta=0;
		double importeIngresado=0.0;
		Cuenta cuentaSeleccionada=null;
		Scanner teclado=new Scanner(System.in);
		char opcion='\0';
		
		while (numeroDeCuenta!=1 && numeroDeCuenta!=2){
			System.out.println("Ingrese la cuenta a operar ");
			System.out.println("1 - Cuenta 1 ");
			System.out.println("2 - Cuenta 2 ");
			
			numeroDeCuenta=teclado.nextInt();
			
			switch (numeroDeCuenta) {
			case 1:
				cuentaSeleccionada=usuario_1;
				break;
			case 2:
				cuentaSeleccionada=usuario_2;
				break;
			default:
				System.out.println("Opcion incorrecta ");
				
			}
		}
		
		while (opcion!='s') {
			System.out.println("----------------------------");
			System.out.println("a - Depositar en cuenta:");
			System.out.println("b - Extraer de una cuenta:");
			System.out.println("c - Ver saldo de la cuenta:");
			System.out.println("s - Salir");
			System.out.println("----------------------------");
			
			opcion=teclado.next().charAt(0);
			switch(opcion) {
			case 'a':
			case 'A':
				System.out.println("Ingrese el importe a depositar ");
				importeIngresado=teclado.nextDouble();
				cuentaSeleccionada.depositar(importeIngresado);
				break;
			case 'b':
			case 'B':
				System.out.println("Ingrese el importe a extraer ");
				importeIngresado=teclado.nextDouble();
				cuentaSeleccionada.retirar(importeIngresado);
				break;
			case 'c':
			case 'C':
				System.out.println("Ver saldo: "+cuentaSeleccionada.getSaldo());
				
				break;
			case 's':
			case 'S':
				System.out.println("Salir");
				break;
			default :
				System.out.println("Opcion erronea");
			}
		}
		
	teclado.close();
	}
}
