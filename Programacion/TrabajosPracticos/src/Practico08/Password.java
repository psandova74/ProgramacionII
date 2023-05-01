package Practico08;

public class Password {
	private String contrasenia;
	private  byte longitud;
	
	public Password() {
		this.contrasenia="";
		this.longitud=10;
		
	}
	
	public Password(byte longitud, String contrasenia) {
		this.contrasenia=contrasenia;
		this.longitud=longitud;
	}
	
	public byte getLongitud() {
		return longitud;
	}
	public void setLongitud(byte longitud) {
		this.longitud = longitud;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void generarClave(String clave) {
		this.contrasenia = clave;
	}
	
	public boolean isFuerte() {
		boolean esFuerte=false;
		byte cantidadDeMayuscula=0, cantidadDeMinuscula=0, cantidadDeNumeros=0;
		int caracterAnalizado=0;
		char validoContrasenia[] = contrasenia.toCharArray();
			
		for (int i=0;i<validoContrasenia.length;i++) {
			caracterAnalizado=(int) validoContrasenia[i];
			if (caracterAnalizado>=48 && caracterAnalizado<=57) 
				cantidadDeNumeros++;
			if (caracterAnalizado>=97 && caracterAnalizado<=122) 
				cantidadDeMinuscula++;
			if (caracterAnalizado>=65 && caracterAnalizado<=90) 
				cantidadDeMayuscula++;
		}
		if (cantidadDeNumeros>5 && cantidadDeMayuscula>2 && cantidadDeMinuscula>1 )
			esFuerte=true;
		return esFuerte;
	}
	

}
