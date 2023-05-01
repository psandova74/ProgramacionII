package pb2.unlam.edu.ar;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EstacionDePeaje {

	private List<Cabina> cabinas;

	private Integer cantidadDeCabinas;

	/*
	 * Al momento de la creacion de la estacion de peajes se deben crear todas las cabianas
	 * donde en la posicion 0 hay una cabina de Telepase y el resto de las cabinas son comunes 
	 */
	public EstacionDePeaje(Integer cantidadDeCabinas) {	
		this.cantidadDeCabinas=cantidadDeCabinas;
	}

	
	protected Integer getCantidadDeCabinas() {
		return cantidadDeCabinas;
	}


	protected void setCantidadDeCabinas(Integer cantidadDeCabinas) {
		this.cantidadDeCabinas = cantidadDeCabinas;
	}


	//Metodo que agrega todas las cabinas (No Obligatorio)
	private void agregarCabinas() {
		
		for (int i=0; i<cantidadDeCabinas;i++) {
			Cabina nuevaCabina=new Cabina(i+1);
			cabinas.add(nuevaCabina);
			
		}
		
		
		

	}

	/*
	 * obtiene todas un listado de cabinas ordenas por importe recaudado en forma descendete
	 */
	public Set<Cabina> otenerCabinasOrdenadaImporteDescendente(Orden orden) {

		return null;
	}

}
