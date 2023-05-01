package Practico04Letra;
import java.util.Scanner;
public class PruebaLetra {

	public static void main(String[] args) {
		Letra letraNueva;
		char letraIngresada='\0';
		Scanner Teclado=new Scanner(System.in);
		System.out.println("Ingresar vocal");
		letraIngresada=Teclado.next().charAt(0);
		letraNueva= new Letra(letraIngresada);
		
		if (letraNueva.esVocal()) 
			System.out.println("La letra es la vocal: "+letraNueva.getLetra());
		else
			System.out.println("La letra es No es vocal");
		Teclado.close();
	}
}
