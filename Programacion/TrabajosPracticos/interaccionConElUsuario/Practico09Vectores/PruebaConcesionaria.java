package Practico09Vectores;

import java.util.Scanner;
import Practico02Coche.Auto;

public class PruebaConcesionaria {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		char letraIngresada='\0';
		String marca ="";
		float precio=0.0F;
		int posision=0;
		Auto nuevoAuto;
		Concesionaria rotter;
		rotter = new Concesionaria();
		
	
		do {
			System.out.println("------------------------");
			System.out.println("Practico 9 - Ejercicio 7");
			System.out.println("------------------------");
			System.out.println("a. Ingresar un nuevo Vehiculo ");
			System.out.println("b. Mostrar listado de vehiculos ");
			System.out.println("c. Mostrar datos de un vehiculo");
			System.out.println("s. Salir ");
			System.out.println("------------------------");
			letraIngresada=teclado.next().charAt(0);
			switch (letraIngresada) {
			case 'a':
			case 'A':
				System.out.println("------------------------");
				System.out.println("Datos del Auto");
				System.out.println("------------------------");
				System.out.println("Ingrese la marca");
				marca=teclado.next();
				System.out.println("Ingrese el precio");
				precio=teclado.nextFloat();
				nuevoAuto=new Auto(marca, precio);
				if (rotter.agregarAuto(nuevoAuto)) {
					System.out.println("Se logro ingresar el Auto exitosamente");
				} else {
					System.out.println("No se ingreso el Auto. La concesionaria esta completa");
				}
				
				break;
			case 'b':
			case 'B':
				System.out.println("------------------------");
				System.out.println("Indice    marca     precio");
				System.out.println("------------------------");
				for (int i=0;i<rotter.cantidadMaxima();i++) {
					nuevoAuto=rotter.getAuto(i);
					if (nuevoAuto!=null) {
						System.out.println(i + "  "+nuevoAuto.getMarca() +"       " + nuevoAuto.getPrecio());
					}
				}
				System.out.println("------------------------");
				break;
			case 'c':
			case 'C':
				System.out.println("------------------------");
				System.out.println("Ingrese la posision del auto a chequear");
				System.out.println("------------------------");
				posision=teclado.nextInt();
				nuevoAuto=rotter.getAuto(posision);
				System.out.println("------------------------");
				if (nuevoAuto!=null) {
					
					System.out.println("Indice    marca     precio");
					System.out.println("------------------------");
					System.out.println(posision + "  "+nuevoAuto.getMarca() +"       " + nuevoAuto.getPrecio());
				}else {
					System.out.println("La posision no tiene asignado un auto");
				}
					
				System.out.println("------------------------");				
				break;
			case 's':
			case 'S':
				System.out.println("Saliendo");
				break;
			default:
				System.out.println("Opcion erronea ");
				
			}
			
		} while (letraIngresada!='S' && letraIngresada!='s');
		teclado.close();	

	}

}
