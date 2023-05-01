package Practico06While;

import java.util.Scanner;

public class LaMaquinaQueAtornilla {

	public static void main(String[] args) {
		Scanner teclado =new Scanner(System.in);
		int opcionDeseada=0;
		Tornillo tornilloActual =null;
		Destornillador destornilladorActual=null;
		Tarugo tarugoActual =null;
		
		do {
			mostrarMenu();
			
			System.out.println("Ingrese la opcion deseada: ");
			opcionDeseada = teclado.nextInt();
			
			switch(opcionDeseada) {
			case 1:
				destornilladorActual=cargarUnDestornillador(teclado,destornilladorActual);
				break;
			case 2:
				tornilloActual = crearUnTornillo(teclado,tornilloActual);
				break;
			case 3:
				tarugoActual = crearUnTarugo(teclado, tarugoActual);
				break;
			case 4:
				atornillar(teclado, tornilloActual, destornilladorActual);
				break;
			case 5:
				desatornillar(teclado,tornilloActual, destornilladorActual);
				break;	
			}	
		}while (opcionDeseada!=9);
	}
	
	private static void mostrarMenu() {
		System.out.println("Bienvenido a la ferreteria");
		System.out.println("1 - Cargar el destornillador");
		System.out.println("2 - Seleccionar un nuevo Tornillo");
		System.out.println("3 - Seleccionar un nuevo Tarugo");
		System.out.println("4 - Atornillar");
		System.out.println("5 - Desatornillar");
		System.out.println("9 - Salir");
	}
	
	public static void atornillar(Scanner teclado, Tornillo tornilloActual,Destornillador destornilladorActual) {
		if(tornilloActual!=null && destornilladorActual!=null) 
			destornilladorActual.atornillar(tornilloActual);
		else
			System.out.println("Verificar si el Tornillo o el Destornillador estan seleccionados");
			
	}
	
	public static void desatornillar(Scanner teclado, Tornillo tornilloActual,Destornillador destornilladorActual) {
		if(tornilloActual!=null && destornilladorActual!=null) 
			destornilladorActual.destornillar(tornilloActual);
		else
			System.out.println("Verificar si el Tornillo o el Destornillador estan seleccionados");
	}
	
	public static Destornillador cargarUnDestornillador(Scanner teclado, Destornillador destornilladorActual) {
		int opcionElegida=0;
		do {
		System.out.println("Tipo de cabeza del destornillador");
		System.out.println("1 - PHILLIPS");
		System.out.println("2 - PLANA");
		System.out.println("3 - ALLEN");
		System.out.println("4 - TORK");
		System.out.println("Ingrese una de las opciones indicadas: ");
		opcionElegida=teclado.nextInt();
		switch(opcionElegida) {
		case 1:
			destornilladorActual= new Destornillador(TipoDeCabeza.PHILLIPS);
			break;
		case 2:
			destornilladorActual= new Destornillador(TipoDeCabeza.PLANA);
			break;
		case 3:
			destornilladorActual= new Destornillador(TipoDeCabeza.ALLEN);
			break;
		case 4:
			destornilladorActual= new Destornillador(TipoDeCabeza.TORK);
			break;
		default:
			System.out.println("Eleccion de opcion incorrecta");
		}
		}while (opcionElegida!=1 && opcionElegida!=2 && opcionElegida!=3 && opcionElegida!=4);
		return destornilladorActual;
	}
	
	public static Tarugo crearUnTarugo(Scanner teclado, Tarugo nuevoTarugo) {
		int opcionLongitud=0;
		System.out.println("Ingrese la longitud del Tarugo");
		opcionLongitud=teclado.nextInt();
		nuevoTarugo=new Tarugo(opcionLongitud);
		return nuevoTarugo;
	}
	public static Tornillo crearUnTornillo(Scanner teclado, Tornillo nuevoTornillo) {
		int opcionElegida=0;	
		int opcionLongitud=0;
		int opcionCantidadDeRoscas=0;
		
		System.out.println("Ingrese la longitud del Tornillo");
		opcionLongitud=teclado.nextInt();
		System.out.println("Ingrese la cantidad de Roscas del Tornillo");
		opcionCantidadDeRoscas=teclado.nextInt();
		
		do {
		System.out.println("Tipo de cabeza de Tornillo");
		System.out.println("1 - PHILLIPS");
		System.out.println("2 - PLANA");
		System.out.println("3 - ALLEN");
		System.out.println("4 - TORK");
		System.out.println("Ingrese una de las opciones indicadas: ");
		opcionElegida=teclado.nextInt();
		switch(opcionElegida) {
		case 1:
			nuevoTornillo= new Tornillo(TipoDeCabeza.PHILLIPS,opcionLongitud,opcionCantidadDeRoscas);
			break;
		case 2:
			nuevoTornillo= new Tornillo(TipoDeCabeza.PLANA,opcionLongitud,opcionCantidadDeRoscas);
			break;
		case 3:
			nuevoTornillo= new Tornillo(TipoDeCabeza.ALLEN,opcionLongitud,opcionCantidadDeRoscas);
			break;
		case 4:
			nuevoTornillo= new Tornillo(TipoDeCabeza.TORK,opcionLongitud,opcionCantidadDeRoscas);
			break;
		default:
			System.out.println("Eleccion de opcion incorrecta");
		}
		}while (opcionElegida!=1 && opcionElegida!=2 && opcionElegida!=3 && opcionElegida!=4);
		return nuevoTornillo;
	}

}

