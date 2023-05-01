package trabajoPractico01;

public class ClaseDePrueba9 {
	public static void main (String args[]){
		int capacidadHdd = 1 ; // Expresada en TERA
		double capacidadDvd = 8.5; // Expresada en GIGA
		double capacidadBlueRay = 25.0; // Expresada en GIGA
		int conversionDeUnidad =1024;
		double cantidadDeDvdsParaBackupearHdd;
		double cantidadBlueRayParaBackupearHdd;
		
		// Ejercicio 9
		cantidadDeDvdsParaBackupearHdd = (int) ((capacidadHdd* conversionDeUnidad)/capacidadDvd);
		cantidadBlueRayParaBackupearHdd = (int)  ((capacidadHdd* conversionDeUnidad)/capacidadBlueRay);
		System.out.println("Cantidad de DVD que se necesitan para backupear el disco rigido:  " +  cantidadDeDvdsParaBackupearHdd);
		System.out.println("Cantidad de Blue Ray que se necesian para backupear el disco rigido: " + cantidadBlueRayParaBackupearHdd);
	}
}