package ar.edu.unlam.basica2.clase05;


// Herencia
public class Playera extends Bicicleta{
	
	public Playera(){
		// Primer instrucci�n llama al contructor del padre
		super();
	}

	public void frenar(){
		// El ciclista frena a trav�s de los pedales
	}
	
	// Sobreescribo frenar del padre
	public void frenar(Integer decremento){
		// El ciclista frena a trav�s de los pedales
		
	}
	
	// Sobrecargo frenar (cambia la firma)
	public void frenar(Double decremento){
		// El ciclista frena a trav�s de los pedales
		
	}
}
