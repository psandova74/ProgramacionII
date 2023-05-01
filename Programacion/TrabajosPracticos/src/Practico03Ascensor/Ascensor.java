package Practico03Ascensor;
import Practico02Persona.Persona;
public class Ascensor {
	private final int PISO_MAXIMO;
	private final int PISO_MINIMO;
	private final double PESO_MINIMO;
	private final double PESO_MAXIMO;
	private final int CAPACIDAD_MAXIMO;
	private boolean puertaAbierta;
	private long pisoActual;
	private double pesoActual;
	private int capacidadActualDePersonas;
	//private Persona ocupantes[];
	
	

	public Ascensor(int capacidadMaxima, double pesoMaximo) {
		this.PISO_MINIMO=0;
		this.PISO_MAXIMO=10;	
		this.PESO_MINIMO=0;
		this.PESO_MAXIMO= pesoMaximo;
		this.CAPACIDAD_MAXIMO=capacidadMaxima;
		this.puertaAbierta=true;
		this.pesoActual=0.0;
		this.pisoActual=this.PISO_MINIMO;
		this.capacidadActualDePersonas=0;
	}
	
	public Ascensor(int pisoMinimo, int pisoMaximo,double pesoMaximo) {
		this.PISO_MINIMO=pisoMaximo;
		this.PISO_MAXIMO=pisoMinimo;
		this.PESO_MINIMO=0.0;
		this.PESO_MAXIMO= pesoMaximo;
		this.CAPACIDAD_MAXIMO=5;
		this.puertaAbierta=true;
		this.pesoActual=0.0;
		this.pisoActual=this.PISO_MINIMO;
		this.capacidadActualDePersonas=0;		
	}
	
	public boolean sobreCarga() {
		boolean estado=false;
		if(this.pesoActual>PESO_MAXIMO) 
			estado=true;
		return estado;
	}
	
	public boolean ingresar(int cantidadDePersonas,double pesoDePersonas) {
		boolean respuesta=false;
		if(pesoDePersonas+this.pesoActual<= PESO_MAXIMO && cantidadDePersonas+this.capacidadActualDePersonas<=this.CAPACIDAD_MAXIMO) {
			this.pesoActual+=pesoDePersonas;
			this.capacidadActualDePersonas+=cantidadDePersonas;
			respuesta=true;
		}	
		return respuesta;
	}
	
	public boolean ingresar(Persona elQueSube) {
		boolean respuesta=false;
		if(elQueSube.getPeso()+this.pesoActual<= PESO_MAXIMO && this.capacidadActualDePersonas +1 <=this.CAPACIDAD_MAXIMO) {
			this.pesoActual+=elQueSube.getPeso();
			this.capacidadActualDePersonas++;
			respuesta=true;
		}		
		return respuesta;
	}

	public void salir(Persona elQueBaja) {
		if(elQueBaja.getPeso()<=this.pesoActual && this.capacidadActualDePersonas>0) {
			this.pesoActual-=elQueBaja.getPeso();
			this.capacidadActualDePersonas--;
		}
	}
	
	public void salir(double peso) {
		if(peso<=this.pesoActual) {
			this.pesoActual-=peso;
			this.capacidadActualDePersonas--;
		}
	}
	
	public long  getPisoActual() {
		return this.pisoActual;
	}
	
	public void irAlPiso(long nuevoPiso) {
		if (nuevoPiso>=this.PISO_MINIMO  && nuevoPiso<=this.PISO_MAXIMO) {
			if (this.pisoActual!=nuevoPiso) {
				if(this.pisoActual<nuevoPiso) { // Quiero subir de piso
					while (this.pisoActual<nuevoPiso)
						this.subir();
				} else {
					while (this.pisoActual>nuevoPiso)
						this.bajar();
				}
			}
		}
	}
	
	public void abrirPuerta() {
		puertaAbierta=true;
	}
	
	public void cerrarPuerta() {
		if (!sobreCarga())
			puertaAbierta=false;
	}
	
	public boolean isPuertaAbierta() {
		return this.puertaAbierta;
	}
	
	//+subir(): void
	public boolean subir() {
		boolean respuesta=false;
		if (puertaAbierta)
			this.cerrarPuerta();
		if (this.pisoActual< this.PISO_MAXIMO && !sobreCarga()) {
			
			this.pisoActual++;
			respuesta=true;
		}
		return respuesta;
	}
	
	//+bajar(): boolean
	public boolean bajar() {
		boolean respuesta=false;
		if (puertaAbierta)
			this.cerrarPuerta();
		if (this.pisoActual> this.PISO_MINIMO && !sobreCarga()) {
			this.pisoActual--;
			respuesta=true;
		}
		return respuesta;
	}
	
}
