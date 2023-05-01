package Practico03Nota;

public class PruebaNota {

	public static void main(String[] args) {

	//	a. Instancia la clase Nota con el valor 3
		Nota notaAlumno = new Nota(3);
	//	b. Evaluá dicho valor a través del método getValor()
		System.out.println("El valor de la nota es:"+notaAlumno.getValor());
	//	c. Al consultar el método aprobado, verifica que devuelva false
		System.out.println(notaAlumno.aprobado());
	//	d. Instancia la clase Nota con el valor 7
		Nota notaAlumno2 = new Nota(7);
	//	e. Al consultar el método aprobado, verifica que el resultado es true
		System.out.println("El valor de la nota es:"+notaAlumno2.getValor());
		System.out.println(notaAlumno2.aprobado());		
	//	f. Instancia la clase Nota con el valor 2. Luego recuperá con el valor 8 y verifica que el
	//	método aprobado devuelva true
		Nota notaAlumno3 = new Nota(2);
		System.out.println("El valor de la nota es:"+notaAlumno3.getValor());
		notaAlumno3.recuperar(8);
		System.out.println("El valor de la nota es:"+notaAlumno3.getValor());
		System.out.println(notaAlumno3.aprobado());
	}
}
