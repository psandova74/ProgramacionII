package pb2.unlam.edu.ar;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Mundial {
	private String nombre;
	private Set<Equipo> equipos;
	private List<AsignacionEquipoGrupo> asignacionEquipoGrupo;
	
	public Mundial(String nombre) {
		this.nombre=nombre;
		this.equipos=new HashSet<>();
		this.asignacionEquipoGrupo=new ArrayList<>();
	}



	public Boolean agregarEquipo(Equipo nuevoEquipo) {
		this.equipos.add(nuevoEquipo);
		return true;
	}



	public Boolean AsignacionEquipoPorGrupo(AsignacionEquipoGrupo asignacion) {
		boolean pudoAgregar=false;
		if(buscarEquipoEnAsignacion(asignacion)==null) {
			this.asignacionEquipoGrupo.add(asignacion);	
			pudoAgregar=true;
		}
		return pudoAgregar;
			
	}



	public Equipo buscarEquipoEnAsignacion(AsignacionEquipoGrupo asignacion) {
		for(AsignacionEquipoGrupo asignacionEquipoGrupo : asignacionEquipoGrupo) {
			if(asignacionEquipoGrupo.getEquipo().equals(asignacion.getEquipo()))
				return asignacionEquipoGrupo.getEquipo();
		}
		return null;
	}



	public TreeSet<Equipo> obtenerEquipoDeUnGrupo(String id) {
		TreeSet<Equipo> equipos = new TreeSet<>();
		for(AsignacionEquipoGrupo asignacionEquipoGrupo : this.asignacionEquipoGrupo) {
			if(asignacionEquipoGrupo.getId().equals(id))
				equipos.add(asignacionEquipoGrupo.getEquipo());
		}	
		return equipos;
	}



	public TreeSet<Equipo> obtenerEquipoDeUnGrupoOrdenadoOrdenDescendente(String id) {
		TreeSet<Equipo> equipos = new TreeSet<>(new OrdenEquipoNombreDescendente());
		for(AsignacionEquipoGrupo asignacionEquipoGrupo : this.asignacionEquipoGrupo) {
			if(asignacionEquipoGrupo.getId().equals(id))
				equipos.add(asignacionEquipoGrupo.getEquipo());
		}	
		return equipos;
	}
	
	public TreeSet<AsignacionEquipoGrupo> obtenerAsignacionPorGrupoOrdenadaPorId(){
		TreeSet<AsignacionEquipoGrupo> ordenada = new TreeSet <>();
		ordenada.addAll(asignacionEquipoGrupo);
		
		return ordenada;
	}
}
