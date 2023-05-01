package Practico04Distancia;

import java.util.Scanner;

public class PruebaDistancia {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		double distancia;
		Distancia pruebaDistancia;
		System.out.println("Ingresar la Distancia: ");
		distancia= teclado.nextDouble();
		pruebaDistancia=new Distancia(distancia);
		System.out.println("La distancia ingresada es: "+pruebaDistancia.getValor()+" C");
		
		//DECAMETRO 1 decametro son 10 metros.
		System.out.println("La distancia en Decametro es: "+pruebaDistancia.convertir(pruebaDistancia.DECAMETRO)+" Dm");
		//HECTOMETRO  1 hectometro son 100 metros
		System.out.println("La distancia en Hectometro es: "+pruebaDistancia.convertir(pruebaDistancia.HECTOMETRO)+" Hm");
		//KILOMETRO 1 kilometro son 1000 metros
		System.out.println("La distancia en Kilometros es: "+pruebaDistancia.convertir(pruebaDistancia.KILOMETRO)+" Km");
		
		pruebaDistancia.setValor(86.0, pruebaDistancia.DECAMETRO);
		System.out.println("La distancia ingresada es: "+pruebaDistancia.getValor()+" m");
		pruebaDistancia.setValor(303.15, pruebaDistancia.HECTOMETRO);
		System.out.println("La distancia ingresada es: "+pruebaDistancia.getValor()+" m");
		pruebaDistancia.setValor(303.15, pruebaDistancia.HECTOMETRO);
		System.out.println("La distancia ingresada es: "+pruebaDistancia.getValor()+" m");
		
		teclado.close();

	}

}
