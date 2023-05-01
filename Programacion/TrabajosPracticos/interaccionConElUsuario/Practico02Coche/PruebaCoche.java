package Practico02Coche;

public class PruebaCoche {
	public static void main(String[] args) {
		Coche miAuto = new Coche("Fiat", "Palio", 70000,2018, 1800000.0F);
		Coche tuAuto=new Coche("Fort","Sierra",900000.0F);
		
		
		System.out.println(miAuto);
		System.out.println(tuAuto);
		System.out.println("Mi auto es: "+miAuto.getMarca()+" Modelo: "+miAuto.getModelo());
		System.out.println("Tu auto es: "+tuAuto.getMarca()+" Modelo: "+tuAuto.getModelo());
		System.out.println("Mis Kilometros son : "+miAuto.getKilometros());
		miAuto.setKilometrosActuales(80000);
		System.out.println("Mis Kilometros son : "+miAuto.getKilometros());
		System.out.println("Mi auto tiene una antiguedad de : "+miAuto.calcularAntiguedad());
		//Automovil fiat=new Automovil();
		Auto ford = new Auto ("ford",34252);
		System.out.println("el auto instanciado es " + ford);

	}
	
}
