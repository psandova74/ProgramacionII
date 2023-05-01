package trabajoPractico01;

public class PruebaAlumno {
	public static void main(String[] args) {
	//Calcular el promedio de las notas de un alumno
/*	String nombre="Patricia";
	float nota1 = 10.0F;
	float nota2 = 8.0F;
	float promedio =(nota1+nota2)/2;
	System.out.print("El promedio del Alumno: " + nombre +  " es: " + promedio);
	*/
	//POO
	Alumno patricia;// Declaramos la variable de tipo objeto Alumno
	patricia = new Alumno(); // Instanciamos la variable. Reservamos el espacio en memoria
	patricia.setNombre("Patricia"); 
	patricia.setNota1(7.0F); 
	patricia.setNota2(8.0F); 
	System.out.print("El promedio del alumno: " + patricia.getNombre() + "es " + patricia.calcularElPromedio());
			
	}
}
