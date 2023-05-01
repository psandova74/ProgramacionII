package HomeroSimson;

import java.util.Scanner;
public class TeclaCualquiera {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		char respuesta='\0';
		
		System.out.println("Bienvenido al sistema de la planta nuclear");
		System.out.println("Ingrese una tecla para comenzar");
		teclado.next().charAt(0);
		while(true) {
			
			System.out.println("--------------------------------");
			System.out.println("Desea revisar la temperatura del nucleo?");
			System.out.println("s - Si");
			System.out.println("n - No");
			System.out.println("--------------------------------");
			respuesta=teclado.next().charAt(0);
			if (respuesta=='s' || respuesta=='S') {
				System.out.println("La temperatura es: ");
			}
			
			System.out.println("Desea Ventilar?");
	
			respuesta=teclado.next().charAt(0);
			if (respuesta=='s' || respuesta=='S') {
				System.out.println("Se ventila ");
			}
			else {
				System.out.println("Es peligroso no ventilar, esta seguro? ");
				System.out.println("Desea Ventilar?");
				respuesta=teclado.next().charAt(0);
				if (respuesta=='s' || respuesta=='S') {
					System.out.println("Se ventila ");
				}else {
					System.out.println("BOOM ");
					break;
				}
			}
		}
		teclado.close(); 
	}

}
