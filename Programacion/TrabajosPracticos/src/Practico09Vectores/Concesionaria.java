package Practico09Vectores;

import Practico02Coche.Auto;

public class Concesionaria {
	private Auto flota[];
	
	public Concesionaria() {
		flota=new Auto[100];
	}
	
	public int cantidadAutos() {
		int cantidadAutos=0;
		for (int i=0;i<flota.length;i++) {
			if (flota[i]!=null)
				cantidadAutos++;
		}
		return cantidadAutos;
	}
	
	public int cantidadMaxima() {
		return flota.length;
	}
	
	public boolean agregarAuto(Auto nuevoAuto) {
		for (int i=0;i<flota.length;i++) {
			if (flota[i]==null) {
				flota[i]=nuevoAuto;
				return true;
			}
		}
		return false;
	}
	
	public Auto getAuto(int indice) {
		return flota[indice];
	}
	
	public float getPrecioAuto(int indice) {
		return flota[indice].getPrecio();
	}
	public String getMarcaAuto(int indice) {
		return flota[indice].getMarca();
	}
}
