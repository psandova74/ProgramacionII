package pb2.unlam.edu.ar;

import java.util.Comparator;

public class OrdenEquipoNombreDescendente implements Comparator <Equipo> {

	@Override
	public int compare(Equipo equipo1, Equipo equipo2) {
	
		return equipo2.getNombre().compareTo(equipo1.getNombre());
	}

}
