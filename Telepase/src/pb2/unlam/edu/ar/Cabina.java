package pb2.unlam.edu.ar;

import java.util.HashMap;

import java.util.Map;

public class Cabina {
	private Integer numero;
	private Map <String, Integer> contadorDeVehiculos;
	private Map <String, Double> recaudacionDeVehiculos;
	private Double tarifaCoche;
	private Double tarifaMoto;
	private Double tarifaAutoBus;


	/* recaudacion total de todos los vehiculos que pasaron por dicha cabina*/
	private Double recaudacion;
	
	public Cabina(Integer numero) {
		this.numero=numero;
		this.recaudacion=0.0;
		this.tarifaAutoBus=200.0;
		this.tarifaCoche=100.0;
		this.tarifaMoto=50.0;
		contadorDeVehiculos= new HashMap<String, Integer>();
		contadorDeVehiculos.put("Moto", 0);
		contadorDeVehiculos.put("AutoBus", 0);
		contadorDeVehiculos.put("Coche", 0);
		
		recaudacionDeVehiculos= new HashMap<String, Double>();
		recaudacionDeVehiculos.put("Moto", 0.0);
		recaudacionDeVehiculos.put("AutoBus", 0.0);
		recaudacionDeVehiculos.put("Coche", 0.0);
	
	
		
	}

	
	
	/*
	 * Este metodo realiza el cobro y acumula la recaudacion de la cabina en funcion al tipo de auto
	 * Tambien contabiliza la cantidad de vehiculo ejemplo si es moto aumenta en uno el contador de moto
	 */
	public  void pagar (Vehiculo vehiculo)  {
		this.contarVehiculo(vehiculo);
		switch (vehiculo.getTipo()){
			case "Moto":
				this.recaudacionDeVehiculos.put(vehiculo.getTipo(), this.recaudacionDeVehiculos.get(vehiculo.getTipo()+ this.tarifaMoto));
				break;
			case "Coche":
				this.recaudacionDeVehiculos.put(vehiculo.getTipo(), this.recaudacionDeVehiculos.get(vehiculo.getTipo()+ this.tarifaCoche));
				break;
			case "AutoBus":
				this.recaudacionDeVehiculos.put(vehiculo.getTipo(), this.recaudacionDeVehiculos.get(vehiculo.getTipo()+ this.tarifaAutoBus));
				break;
		}
		 

	}		
	

	
	/*
	 * incrementa el contadorDeVehiculo 
	 */
	private  void  contarVehiculo (Vehiculo vehiculo) {
		this.contadorDeVehiculos.put(vehiculo.getTipo(), this.contadorDeVehiculos.get(vehiculo.getTipo()+1));
		
	}
	
}
