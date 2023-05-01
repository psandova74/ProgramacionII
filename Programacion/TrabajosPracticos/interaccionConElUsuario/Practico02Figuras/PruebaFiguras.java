package Practico02Figuras;
import java.util.Scanner;

public class PruebaFiguras {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Figuras circulo1= new Figuras();
		Figuras circulo2;
		double radio1=5.2;
		double radio2;
		double base=0.0;
		double altura=0.0;
		
		circulo1.setRadio(radio1);
		
	    System.out.println("Ingrese el radio del circulo: ");
	    radio2=teclado.nextDouble();
	    System.out.println("Ingrese la base del rectangulo: ");
	    base=teclado.nextDouble();
	    System.out.println("Ingrese la altura del rectangulo: ");
	    altura=teclado.nextDouble();
	    circulo2= new Figuras(radio2, base, altura);
	    
	    System.out.println("El valor de PI es: "+circulo1.getPI());
	    
	    System.out.println("El radio del circulo 1 es: "+circulo1.getRadio());
	    System.out.println("El perimetro del circulo 1 es: "+circulo1.calculoPerimetroCirculo());
	    System.out.println("El area del circulo 1 es: "+circulo1.calculoAreaCirculo());

	    System.out.println("El perimetro del rectangulo 1 es: "+circulo1.calculoPerimetroRectangulo());
	    System.out.println("El area del rectangulo 1 es: "+circulo1.calculoAreaRectangulo());
	    
	    System.out.println("El radio del circulo 2 es: "+circulo2.getRadio());
	    System.out.println("El perimetro del circulo 2 es: "+circulo2.calculoPerimetroCirculo());
	    System.out.println("El area del circulo 2 es: "+circulo2.calculoAreaCirculo());
	    

	    System.out.println("El perimetro del rectangulo 2 es: "+circulo2.calculoPerimetroRectangulo());
	    System.out.println("El area del rectangulo 2 es: "+circulo2.calculoAreaRectangulo());
	    teclado.close();
	}

}
