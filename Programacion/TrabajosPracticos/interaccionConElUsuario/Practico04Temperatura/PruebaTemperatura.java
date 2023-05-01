package Practico04Temperatura;
import java.util.Scanner;
public class PruebaTemperatura {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		float temperatura;
		Temperatura pruebaTemperatura;
		System.out.println("Ingresar la temperatura: ");
		temperatura= teclado.nextFloat();
		pruebaTemperatura=new Temperatura(temperatura);
		System.out.println("La temperatura ingresada es: "+pruebaTemperatura.getValor()+" C");
		System.out.println("La temperatura en Farenheit es: "+pruebaTemperatura.convertir(pruebaTemperatura.FARENHEIT)+" F");
		System.out.println("La temperatura en Kelvin es: "+pruebaTemperatura.convertir(pruebaTemperatura.KELVIN)+" K");
		pruebaTemperatura.setValor(86.0, pruebaTemperatura.FARENHEIT);
		System.out.println("La temperatura ingresada es: "+pruebaTemperatura.getValor()+" C");
		pruebaTemperatura.setValor(303.15, pruebaTemperatura.KELVIN);
		System.out.println("La temperatura ingresada es: "+pruebaTemperatura.getValor()+" C");
		
		teclado.close();
	}

}
