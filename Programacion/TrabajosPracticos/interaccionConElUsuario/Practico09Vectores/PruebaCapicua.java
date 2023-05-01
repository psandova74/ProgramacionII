package Practico09Vectores;
import java.util.Scanner;
public class PruebaCapicua {

	public static void main(String[] args) {
		String numeroIngresado="";
		char opcionIngresada='\0';
		Scanner teclado=new Scanner(System.in);
				
		do {
			System.out.println("--------------------------");
			System.out.println("Validamos los CAPICUAS");
			System.out.println("--------------------------");
			System.out.println("a - Ingrese numero a evaluar");
			System.out.println("s - Salir");
			System.out.println("--------------------------");
			
			opcionIngresada=teclado.next().charAt(0);
			if ((opcionIngresada=='A' || opcionIngresada=='a')) {
				System.out.println("Ingrese el numero a evaluar");
				numeroIngresado=teclado.next();
				if (validoCapicua(numeroIngresado)) {
					System.out.println("El numero es Capicua");
				}else {
					System.out.println("El numero NO es Capicua");
				}
					
			}
			
		}while (opcionIngresada!='S' && opcionIngresada!='s');
		
		
		teclado.close();

	}
	public static boolean validoCapicua(String valorIngresado) {
		boolean validoCapicua=true;
		char numero[]=valorIngresado.toCharArray();
		for (int i=0,j=numero.length-1;i<=j ;i++,j--) {
			if (numero[i]!=numero[j]) {
				validoCapicua=false;
			}
		}
		return validoCapicua;
	}
}
