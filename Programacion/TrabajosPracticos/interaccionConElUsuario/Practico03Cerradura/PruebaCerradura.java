package Practico03Cerradura;
import java.util.Scanner;

public class PruebaCerradura {
	public static void main(String[] args) {
		Cerradura llaveNueva = new Cerradura();
		int claveNueva=0;
		int claveIngreso=0;
		Scanner ingreso = new Scanner(System.in);
		System.out.println("Alta de cerradura");
		System.out.println("Ingrese la clave nueva: ");
		claveNueva=ingreso.nextInt();
		llaveNueva.setClaveDeApertura(claveNueva);
		System.out.println("Ingreso cerradura");
		System.out.println("Ingrese la clave: ");
		claveIngreso=ingreso.nextInt();		
		if (llaveNueva.abrir(claveIngreso))
			System.out.println("Ingreso correctamente");
		else {
			System.out.println("Error en clave. "+llaveNueva.getIntentosFallidos()+" intentos fallidos");
			System.out.println("Ingreso cerradura");
			System.out.println("Ingrese la clave: ");
			claveIngreso=ingreso.nextInt();
			if (llaveNueva.abrir(claveIngreso))
				System.out.println("Ingreso correctamente");
			else {
				System.out.println("Error en clave. "+llaveNueva.getIntentosFallidos()+" intentos fallidos");
				System.out.println("Ingreso cerradura");
				System.out.println("Ingrese la clave: ");
				claveIngreso=ingreso.nextInt();
				
				if (llaveNueva.abrir(claveIngreso))
					System.out.println("Ingreso correctamente");
				else {
					System.out.println("Error en clave. "+llaveNueva.getIntentosFallidos()+" intentos fallidos");
					System.out.println("Ingreso cerradura");
					System.out.println("Ingrese la clave: ");
					claveIngreso=ingreso.nextInt();
					if (llaveNueva.abrir(claveIngreso))						System.out.println("Ingreso correctamente");
					else {
						if(llaveNueva.fueBloqueada())
							System.out.println("La clave fue bloqueada");
					}
				}
			}	
		}	
		ingreso.close();
	}

}
