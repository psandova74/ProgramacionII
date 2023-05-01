package Practico02Coche;

public class Auto { 
	private String marca; 
	private float precio; 
	public Auto(String marca, float precio) { 
		this.marca=marca; 
		this.precio=precio; 
	} 
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
} 