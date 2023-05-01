package Practico02Coche;

public class Coche {
	//Declaracion de atributos
	
	
	private final boolean CERO_KM;
	private final int ANIO_ACTUAL;
	private final int ANIO_DE_FABRICACION;
	private static int  cantidadCoches=0;	
	private String marca;
	private String modelo;
	private int kilometrosActuales;
	private double precio;

	
	//Declaracion de metodos
	public Coche(String marca, String modelo, double precio) {
		this.ANIO_ACTUAL=2022;
		this.CERO_KM=false;
		this.ANIO_DE_FABRICACION=this.ANIO_ACTUAL;
		this.marca=marca;
		this.modelo=modelo;
		this.precio=precio;	
		this.kilometrosActuales=0;
		Coche.cantidadCoches++;
	}
	
	public Coche() {
		this.ANIO_ACTUAL=2022;
		this.CERO_KM=true;
		this.ANIO_DE_FABRICACION=this.ANIO_ACTUAL;
		this.marca="";
		this.modelo="";
		this.precio=0.0;	
		this.kilometrosActuales=0;
		Coche.cantidadCoches++;		
		
	}

	public Coche(String marca, String modelo, int kilometros,int anio, double precio) {
		this.ANIO_ACTUAL=2022;
		this.CERO_KM=false;
		this.ANIO_DE_FABRICACION=anio;
		this.marca=marca;
		this.modelo=modelo;
		this.kilometrosActuales=kilometros;		
		this.precio=precio;
		Coche.cantidadCoches++;
	}
	
	public int getCantidadCoches() {
		return Coche.cantidadCoches;
	}
	
	public void setKilometrosActuales(int Kilometros) {
		this.kilometrosActuales=Kilometros;
	}
	
	public void setPrecio(double precio) {
		this.precio=precio;
	}

	public double getPrecio() {
		return precio;
	}
	
	public int calcularAntiguedad() {
		return (this.ANIO_ACTUAL - this.ANIO_DE_FABRICACION);
	}
	
	public int getKilometros() {
		return this.kilometrosActuales;
	}
	
	public String  getMarca() {
		return this.marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public boolean isCeroKilometro() {
		return this.CERO_KM;
		
	}
}
