package Practico09Vectores;

public class TablaASCII {
	private char abc[];
	private char numerico[];
	private char especiales[];
	private String abecedarioMayuscula;
	private String abecedarioMinuscula;
	private String valoresNumericos;
	private String valoresEspeciales;

	public TablaASCII() {
		abc=new char[26];
		numerico=new char[10];
		especiales=new char[15];	
		abecedarioMayuscula="";
		abecedarioMinuscula="";
		valoresNumericos="";
		valoresEspeciales="";
	}
	
	public String getAbecedarioMayuscula() {
		return abecedarioMayuscula;
	}

	public String getAbecedarioMinuscula() {
		return abecedarioMinuscula;
	}

	public String getValoresNumericos() {
		return valoresNumericos;
	}

	public String getValoresEspeciales() {
		return valoresEspeciales;
	}
	
	public void cargarAbecedarioMayuscula() {
		int i=65;
		abc[i-65]=(char) i;
		abecedarioMayuscula=i+"-"+abc[i-65];
		i++;
		for (;i<abc.length+65;i++) {
			abc[i-65]=(char) i;
			abecedarioMayuscula+=","+i+"-"+abc[i-65];
			
		}
	}

	public void cargarAbecedarioMinuscula() {
		int i=97;
		abc[i-97]=(char) i;
		abecedarioMinuscula=i+"-"+abc[i-97];
		i++;
		for (;i<abc.length+97;i++) {
			abc[i-97]=(char) i;
			abecedarioMinuscula+=","+i+"-"+abc[i-97];
		}
	}
		
	public void cargarNumerico() {
		int i=48;
		abc[i-48]=(char) i;
		valoresNumericos=i+"-"+abc[i-48];
		i++;
		for (;i<numerico.length+48;i++) {
			numerico[i-48]=(char) i;
			valoresNumericos+=","+i+"-"+numerico[i-48];
		}
	}
	
	public void cargarEspeciales() {
		int i=33;
		abc[i-33]=(char) i;
		valoresEspeciales=i+"-"+especiales[i-33];
		i++;
		for (;i<especiales.length+33;i++) {
			especiales[i-33]=(char) i;
			valoresEspeciales+=","+i+"-"+especiales[i-33];
		}
	}
	
	public char [] getNumerico() {
		return numerico;
	}
	
	public char [] getAbecedario() {
		return abc;
	}
	
	public char [] getEspeciales() {
		return especiales;
	}
}
