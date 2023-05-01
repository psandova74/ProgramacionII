package pb2.unlam.edu.ar;

import java.util.TreeSet;

public class Administrador extends Usuario implements Administrar{
	private TreeSet<Figurita> figuritasExistentes;

	public Administrador(String nombre) {
		super(nombre);
		figuritasExistentes= new TreeSet<>(new OrdenDeFiguritas()); 
	}

	@Override
	public void agregarUnaFigurita(Figurita figurita) throws CodigoExistenteException {
		
		if (!figuritasExistentes.add(figurita)){
			throw new CodigoExistenteException("El codigo de Figurita ya fue cargado");
		}
	}

	@Override
	public Integer cantidadFiguritasExistentes() {
		return figuritasExistentes.size();
	}

	@Override
	public Figurita obtenerFiguritaExistentePorPosicion(Integer posicion){
		Integer buscarPosicion=0;
		for(Figurita i : figuritasExistentes) {
			buscarPosicion++;
			if (buscarPosicion.equals(posicion))
				return i;
		}
		return null;	
	}

	@Override
	public Boolean containsFiguritaExistentes(Figurita figurita) {
		return figuritasExistentes.contains(figurita);
	}
	


	
	

	
}
