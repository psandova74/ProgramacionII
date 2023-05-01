package Practico03Ascensor;
import java.util.Scanner;
public class PruebaAscensor {

	public static void main(String[] args) {
		Scanner teclado =new Scanner(System.in);
		Ascensor ascensorActual;
		int pisoMinimo=0,pisoMaximo=0,opcionDeseada=0;
		double pesoMaximo=0.0;
		
		System.out.println("Estamos instalando el ascensor");
		System.out.println("Ingrese el piso minimo que va a tener");
		pisoMinimo=teclado.nextInt();
		System.out.println("ingrese el piso maximo que va a tener");
		pisoMaximo=teclado.nextInt();
		System.out.println("ingrese el peso maximo que va a tener");
		pesoMaximo=teclado.nextDouble();
		
		ascensorActual=new Ascensor(pisoMinimo,pisoMaximo,pesoMaximo);
		
		do {
			mostrarMenuDeOpciones(ascensorActual);
			opcionDeseada = teclado.nextInt();
			
			switch(opcionDeseada) {
			case 1:
				abrirPuerta(teclado,ascensorActual);
				break;
			case 2:
				cerrarPuerta(teclado,ascensorActual);
				break;
			case 3:
				ingresar(teclado,ascensorActual);
				break;
			case 4:
				subir(teclado,ascensorActual);
				break;
			case 5:
				bajar(teclado,ascensorActual);
				break;
			case 6:
				salir(teclado,ascensorActual);
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
				default:
					System.out.println("Funcionalidad en construccion");
			}
		}while (opcionDeseada!=9);
		
	}
	
	private static void mostrarMenuDeOpciones(Ascensor actual) {
		System.out.println("--------------------");
		System.out.println("Panel de control");
		System.out.println(actual);
		System.out.println("1 - Abrir la puerta");
		System.out.println("2 - Cerrar la puerta");
		System.out.println("3 - Ingresar");
		System.out.println("4 - Subir");
		System.out.println("5 - Bajar");
		System.out.println("6 - Salir");
		System.out.println("7 - Ir al piso");
		System.out.println("9 - Finalizar");
		System.out.println("--------------------");
	}
	
	private static void abrirPuerta(Scanner teclado, Ascensor ascensorActual) {
		ascensorActual.abrirPuerta();
		if(ascensorActual.isPuertaAbierta()) 
			System.out.println("Se abrio la puerta");
		else
			System.out.println("La puerta no se pudo abrir");
	}
	
	private static void cerrarPuerta(Scanner teclado, Ascensor ascensorActual) {
		ascensorActual.cerrarPuerta();
		if(!ascensorActual.isPuertaAbierta()) 
			System.out.println("Se cerro la puerta");
		else
			System.out.println("La puerta no se pudo cerrar. Sobrepeso");
	}
	
	private static void subir(Scanner teclado, Ascensor ascensorActual) {
		ascensorActual.subir();
		
	}
	
	private static void bajar(Scanner teclado, Ascensor ascensorActual) {
		ascensorActual.bajar();
	}
	
	private static void ingresar(Scanner teclado, Ascensor ascensorActual) {
		ascensorActual.ingresar(0, 0);
	}
	
	private static void salir(Scanner teclado, Ascensor ascensorActual) {
		ascensorActual.salir(0);
	}

}
