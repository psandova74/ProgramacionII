package Practico04Dia;
import java.util.Scanner;
public class PruebaDia {

	public static void main(String[] args) {
		Dia pruebaDia;
		Scanner teclado=new Scanner(System.in);
		int diaIngresado;
		System.out.println("Ingrese numero de la semana: ");
		diaIngresado=teclado.nextInt();
		pruebaDia=new Dia(diaIngresado);
		
		if (pruebaDia.diaDeLaSemana().equals("Error"))
			System.out.println("Ingreso un dia erroneo");
		else
			System.out.println("Dia de la semana "+pruebaDia.getDia()+" es "+pruebaDia.diaDeLaSemana());
		teclado.close();
	}
}
