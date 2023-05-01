package pb2.unlam.edu.ar;

import java.util.Comparator;

public class OrdenDeFiguritas implements Comparator<Figurita> {

	@Override
	public int compare(Figurita o1, Figurita o2) {
		if(o1.getGrupo().compareTo(o2.getGrupo())==0) {
			if(o1.getSeleccion().compareTo(o2.getSeleccion())==0) {
				return o1.getId().compareTo(o2.getId());
			}
			return o1.getSeleccion().compareTo(o2.getSeleccion());
		}	
		return o1.getGrupo().compareTo(o2.getGrupo());

	}
}
