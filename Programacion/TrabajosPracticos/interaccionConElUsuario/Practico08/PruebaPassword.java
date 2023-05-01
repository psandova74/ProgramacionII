package Practico08;

public class PruebaPassword {

	public static void main(String[] args) {
		
		Password pruebaPass=new Password((byte) 12,"123437ABCfd");
		if (pruebaPass.isFuerte())
			System.out.println("Es una password Fuerte");
		else
			System.out.println("No es una password Fuerte");

	}

}
