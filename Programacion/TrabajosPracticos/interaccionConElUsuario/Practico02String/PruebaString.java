package Practico02String;
public class PruebaString {
	
	public static void main(String[] args) {	
	// ej 12
	String palabra="      Escribo una palabra        ";
	String minuscula="java es case sensitive";
	String mayuscula=minuscula.toUpperCase();
	System.out.println("Valor de Minuscula: "+ minuscula);
	System.out.println("Valor de Mayuscula: "+ mayuscula+".");
	
	//ej 11
	System.out.println("a - Prueba de charAt(int index): "+ palabra.charAt(2)); // Devuelve el caracter de la posicion de la palabra, comienza de 0.
	System.out.println("b - Prueba de length(): "+ palabra.length());// Devuelve el tamanio del String
	System.out.println("c - Prueba de toLowerCase(): "+ palabra.toLowerCase()); // Devuelve la plabra en Minuscula
	System.out.println("d - Prueba de toUpperCase(): "+ palabra.toUpperCase());//Devuelve la plabra en Mayuscula
	System.out.println("e - Prueba de trim(): "+ palabra.trim()+palabra.trim());// Quita los espacios que estan al inicio y al final.

	double valor1, valor2;
	valor1=4.00;
	valor2=100.0;
	
	System.out.println("a - Prueba de pow(double a, double b): "+ Math.pow(valor1,valor2)); // Devuelve la potencia del primer valor1 elevado a valor2.
	System.out.println("b - Prueba de random(): "+ Math.random()); // Arroja un valor double al azar
	System.out.println("c - Prueba de sqrt(valor): "+ Math.sqrt(valor1)); //Arroja la raiz cuadrada del valor
	
	
	System.out.println("Prueba minuscula: "+minuscula);
	System.out.println("Prueba de length(): "+ minuscula.length());// Devuelve el tamanio del String
	mayuscula=minuscula.toUpperCase();
	System.out.println("Prueba de toUpperCase(): "+ mayuscula+".");//Devuelve la plabra en Mayuscula
	
	String nombre1= new String("Hola como estas");
	String nombre2=new String("Hola|Stackoverflow|en|español");
	if (nombre1==nombre2) 
		System.out.println("Estas palabras son iguales" );
	else 
		System.out.println("Estas palabras son distintas");
	
	System.out.println(nombre1);
	System.out.println(nombre2.toString());
	
	System.out.println("a. charAt(int index): El método de charat devuelve el carácter en el índice definido:  "+nombre1.charAt(2));//
	System.out.println("b. equals(String anotherString): Compara la cadena de texto contra un objeto. Devolverá true si las cadenas comparadas son iguales. En caso contrario devolverá false.: "+ nombre1.equals(nombre2));
	System.out.println("c. equalsIgnoreCase(String anotherString): Compara la cadena de texto contra un objeto ignorando mayúsculas y minúsculas. "+ nombre1.equalsIgnoreCase(nombre2));
	System.out.println("d. length(): longitud del Stream: " +nombre1.length());//Longitud del String
	System.out.println("e. substring(beginIndex, endIndex): Muestra la String desde el indice indicado: " +nombre1.substring(2,7));//Muestra la String desde el indice indicado.
	System.out.println("f. split(,)");

	//Se puede dividir por medio de comas o palabras
    String dias = "Lunes,Martes,Miercoles,Jueves,Viernes,Sabado,Domingo";
    String diaArray[] = dias.split(",");
		
    System.out.println("Ejemplo con coma ,");
    for(String dia : diaArray){
	System.out.println(dia);
    }

    //El punto se usa en las expresiones regulares por lo que 
    //si se desea usar como tal se debe definir con \\
    //Otros valors son + [ ] ? etc.
    String diasPunto = "Lunes.Martes.Miercoles.Jueves.Viernes.Sabado.Domingo";
    String diaPuntoArray[] = diasPunto.split("\\.");

    System.out.println("Ejemplo con punto .");
    for(String diaPunto : diaPuntoArray){
	System.out.println(diaPunto);
    }
		
    //Se pueden usar expresiones mas compleajas como la siguiente que busca
    //dominios .com
    String correos = "test1@dominio.com,test2@dominio.com,test3@dominio2.com,test4@dominio.net";
    String regEx = "@[A-Za-z0-9]+\\.com,";
		
    System.out.println("--Ejemplo 3--");
    for(String correoSinDominio : correos.split(regEx)){
	System.out.println(correoSinDominio);
    }
	
	System.out.println("");
	System.out.println("g. toLowerCase(): Muestra en minuscula: " +nombre1.toLowerCase());// Muestra en minuscula
	System.out.println("h. toUpperCase(): Muestra en Mayusculas: " +nombre1.toUpperCase());//Muestra en mayuscula
	System.out.println("i. trim(): Quita los espacios del inicio y del final: ;" +nombre1.trim()+nombre1.trim());//Quita los espacios del inicio y del final
	
	System.out.println("");
	System.out.println("Los metodos de la clase Math");
	
	System.out.println("a. abs(int a): El valor absoluto del número dado int. "+ Math.abs(-10));//El valor absoluto del número dado int
	System.out.println("b. abs(double a): El valor absoluto del número dado double. "+ Math.abs(-10.0));//El valor absoluto del número dado double
	System.out.println("c. abs(float a): El valor absoluto del número dado float. "+ Math.abs(-10.0F));//El valor absoluto del número dado float
	System.out.println("d. abs(long a): El valor absoluto del número dado long. "+ Math.abs(-1000000L));//El valor absoluto del número dado long
	System.out.println("e. pow(double a, double b): Potencia El exponente utilizado para elevar la  base. "+Math.pow(7, 2));//Potencia El exponente utilizado para elevar la  base. pow(base, exponente)
	System.out.println("f. random(): siempre devuelve un número menor que 1. "+Math.random());//siempre devuelve un número aleatorio menor que 1.
	System.out.println("g. round(float a): edondea un número al entero más cercano. "+Math.round(2342342.234534F));//El método Math.round() redondea un número al entero más cercano.
	System.out.println("h. round(double a): edondea un número al entero más cercano. "+Math.round(2342342.234534));//El método Math.round() redondea un número al entero más cercano.
	System.out.println("i. sqrt(double a): raiz cuadrada de un numero. "+ Math.sqrt(25));
	String digitoCanal="123";
	
	int entero ;
	String s1="1234";  
	String noNumerico="prueba";
	
	 if ( s1.chars().allMatch( Character::isDigit ))
		 System.out.println("Es numerico");
	 else
		 System.out.println("No es numerico");
	 if ( noNumerico.chars().allMatch( Character::isDigit ))
		 System.out.println("Es numerico");
	 else
		 System.out.println("No es numerico");
	 
	char[] ch=s1.toCharArray();  
	for(int i=0;i<ch.length;i++){  
	System.out.print(ch[i]+"  ");
	entero = Character.getNumericValue(ch[i]);
	System.out.print(" Valor Numerico:  " +entero+"\n");
	
	String saludo="Hola";
	String nombre="Mariela";
	System.out.println(saludo+nombre);
	}  
	
	}
	
}
