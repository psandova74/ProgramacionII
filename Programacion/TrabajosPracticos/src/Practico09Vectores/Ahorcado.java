package Practico09Vectores;

public class Ahorcado {

	private char palabraOculta[]=new char[10];
	private char palabraDescubierta[]=new char[10];
	private int intentosFallidos;
	private int intentosPalabra;
	
	public Ahorcado() {
		intentosFallidos=6;
		intentosPalabra=2;
		inicializoVectores();
	}
	
	public void inicializoVectores() {
		for (int i=0;i<10;i++) {
			palabraOculta[i]='\0';
			palabraDescubierta[i]='\0';
		}
	}
	
	public String getPalabraDescubierta() {
		String mostrarPalabra="";
		for (int i=0;i<palabraDescubierta.length && palabraDescubierta[i]!='\0';i++)
			mostrarPalabra+=palabraDescubierta[i]+" ";
		return mostrarPalabra;
	}

	public int getIntentosFallidos() {
		return intentosFallidos;
	}


	public int getIntentosPalabra() {
		return intentosPalabra;
	}

	public boolean  adivinoPalabra() {
		boolean acierto=true;
		for (int i=0;i<palabraOculta.length && palabraOculta[i]!='\0';i++) {
			if (palabraDescubierta[i]!=palabraOculta[i]) 
				acierto=false;
		}	
		return acierto;
	}
	public void ingresarPalabraOculta(String palabraNueva) {
		inicializoVectores();
		for (int i=0;i<palabraNueva.length();i++) {
			palabraOculta[i]=palabraNueva.charAt(i);
			palabraDescubierta[i]='_';
		}
	}
	
	public boolean arriesgarPalabra(String palabraArriesgada) {
		boolean acierto=false;
		if (String.valueOf(palabraOculta).contentEquals(palabraArriesgada))
			acierto=true;
		else
			intentosPalabra--;
		return acierto;
	}
	
	public boolean arriesgarLetra(char letraArriesgada) {
		boolean acierto=false;
		for (int i=0;i<palabraOculta.length && palabraOculta[i]!='\0';i++) {
			if (letraArriesgada==palabraOculta[i]) {
				acierto=true;
				palabraDescubierta[i]=palabraOculta[i];
			}
		}
		if (!acierto)
			intentosFallidos--;
		return acierto;
	}

}
