package Practico03Punto;

public class PruebaPunto {

	public static void main(String[] args) {
		Punto newPunto = new Punto(0,0);
		System.out.println("x: "+newPunto.getX()+ " y: "+newPunto.getY());
		System.out.println("Origen de Coordenadas: " + newPunto.isOrigenCoordenadas());
		System.out.println("Punto en el eje x: " + newPunto.isEjeX());
		System.out.println("Punto en el eje y: " + newPunto.isEjeY());
		
		Punto newPunto2 = new Punto(2,0);
		System.out.println("x: "+newPunto2.getX()+ " y: "+newPunto2.getY());
		System.out.println("Origen de Coordenadas: " + newPunto2.isOrigenCoordenadas());
		System.out.println("Punto en el eje x: " + newPunto2.isEjeX());
		System.out.println("Punto en el eje y: " + newPunto2.isEjeY());
		
		Punto newPunto3 = new Punto(0,6);
		System.out.println("x: "+newPunto3.getX()+ " y: "+newPunto3.getY());
		System.out.println("Origen de Coordenadas: " + newPunto3.isOrigenCoordenadas());
		System.out.println("Punto en el eje x: " + newPunto3.isEjeX());
		System.out.println("Punto en el eje y: " + newPunto3.isEjeY());
		
		Punto newPunto4 = new Punto(6,7);
		System.out.println("x: "+newPunto4.getX()+ " y: "+newPunto4.getY());
		System.out.println("Origen de Coordenadas: " + newPunto4.isOrigenCoordenadas());
		System.out.println("Punto en el eje x: " + newPunto4.isEjeX());
		System.out.println("Punto en el eje y: " + newPunto4.isEjeY());

	}

}
