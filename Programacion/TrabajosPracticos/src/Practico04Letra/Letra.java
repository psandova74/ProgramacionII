package Practico04Letra;

public class Letra {
	private char letra;

	public Letra(char letra) {
		this.letra=letra;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}
	
	public boolean esVocal() {
		return (letra=='a'||letra=='e'||letra=='i'||letra=='o'||letra=='u'||letra=='A'||letra=='E'||letra=='I'||letra=='O'||letra=='U');
	}

}
