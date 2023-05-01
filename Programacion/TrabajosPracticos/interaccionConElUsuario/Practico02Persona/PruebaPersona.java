package Practico02Persona;

public class PruebaPersona {
	public static void main(String[] args) {
		Persona Sofia= new Persona("Sofia","Mujer",23891669,2.8F,0.5F);
		System.out.println(Sofia);
		//trabajoPractico02.Persona@5a07e868
		System.out.println("Su edad es: "+Sofia.getEdad());
		System.out.println("Su peso es: "+Sofia.getPeso());
		System.out.println("Su altura es: "+Sofia.getAltura());	
		if (Sofia.isViva())
			System.out.println("Esta viva");
		else
			System.out.println("No esta viva");			
		Sofia.crecer(0.5F);
		Sofia.alimentar(1.0F);
		Sofia.cumplirAnos();
		System.out.println("Su peso es: "+Sofia.getPeso());
		System.out.println("Su altura es: "+Sofia.getAltura());
		System.out.println("Su edad es: "+Sofia.getEdad());
		Sofia.morir();
		
		if (Sofia.isViva())
			System.out.println("Esta viva");
		else
			System.out.println("No esta viva");				
	}
}
