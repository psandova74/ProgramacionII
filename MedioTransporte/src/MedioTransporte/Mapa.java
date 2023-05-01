package MedioTransporte;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Mapa {
	private String ciudad;
	private Set<MedioTransporte> mediosTransporte;
	public Boolean coalicion;
	

	public Mapa(String ciudad) {
		this.ciudad = ciudad;
		mediosTransporte = new HashSet<MedioTransporte>();
		coalicion=false;
	}

	public Boolean hayCoalicion() {
		return coalicion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public void agregarVehiculo(MedioTransporte vehiculo) throws CollitionException {
		if(mediosTransporte.contains(vehiculo)) {
			coalicion=true;
			throw new CollitionException("Se genero una colision");
		}
		mediosTransporte.add(vehiculo);
	}

	
	public Integer getCantidadDeVehiculos() {
		return mediosTransporte.size();
	}

	public void actualizarCoordenadas(MedioTransporte changeVehiculo, Double latitud, Double longitud) {
		System.out.println(mediosTransporte.contains(changeVehiculo));
			mediosTransporte.remove(changeVehiculo);
			System.out.println(mediosTransporte.contains(changeVehiculo));
			changeVehiculo.setLatitud(latitud);
			changeVehiculo.setLongitud(longitud);
			System.out.println(changeVehiculo.getLatitud() +"  " + changeVehiculo.getLongitud() + " " + mediosTransporte.contains(changeVehiculo));
			try {
				agregarVehiculo(changeVehiculo);
			} 
			catch (Exception CollitionException) {
				coalicion=true;
			}
			
			 
	}

}
