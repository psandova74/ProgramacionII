package ar.edu.unlam.basica2;

public class Omnivoro extends Mamifero {
	
	public Omnivoro(String cabeza, String tronco, String extremidades){
		super(cabeza, tronco, extremidades);
	}

	@Override
	public void comer() {
		System.out.println("Omnivoro. Comer cualquier cosa");
	}

	public String toString(){
		return ("Omnivoro con cabeza " + super.getCabeza() + ", tronco " + super.getTronco() + " y extremdidades " + super.getExtremidades());
	}
}
