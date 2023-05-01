package Practico02DiscoRigido;

public class DiscoRigido {
	private double tamanio; // TB
	private final double TAMANIO_BLUERAY=15.0/1024; 
	private final double TAMANIO_DVD=4.5/1024; 

	public double getTamanio() {
		return tamanio;
	}

	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}
	
	public int equivalenteCantidadDVD() {
		return  (int)  Math.round(tamanio / TAMANIO_BLUERAY);
	}
	
	public int equivalenteCantidadBlueRay() {
		return (int) Math.round(tamanio / TAMANIO_DVD);
	}
}
