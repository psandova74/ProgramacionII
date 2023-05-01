package Practico02DiscoRigido;


public class PruebaDiscoRigido {

	public static void main(String[] args) {
		DiscoRigido disco = new DiscoRigido();
		//Ingreso de Discos en Tb.
		
		disco.setTamanio(10.0);
		System.out.println("El seagate tiene:  "+disco.getTamanio()+" TB");
		System.out.println("Equivale a: "+disco.equivalenteCantidadDVD()+" DVDs");
		System.out.println("Equivale a: "+disco.equivalenteCantidadBlueRay()+" Blue Rey");
		
		disco.setTamanio(20.0);
		System.out.println("El hitachi tiene:  "+disco.getTamanio()+" TB");
		System.out.println("Equivale a: "+disco.equivalenteCantidadDVD()+" DVDs");
		System.out.println("Equivale a: "+disco.equivalenteCantidadBlueRay()+" Blue Rey");
		
		disco.setTamanio(32.0);
		System.out.println("El westernDigital tiene:  "+disco.getTamanio()+" TB");
		System.out.println("Equivale a: "+disco.equivalenteCantidadDVD()+" DVDs");
		System.out.println("Equivale a: "+disco.equivalenteCantidadBlueRay()+" Blue Rey");
		
		disco.setTamanio(48.0);
		System.out.println("El toshiba tiene:  "+disco.getTamanio()+" TB");
		System.out.println("Equivale a: "+disco.equivalenteCantidadDVD()+" DVDs");
		System.out.println("Equivale a: "+disco.equivalenteCantidadBlueRay()+" Blue Rey");

	}

}
