package pb2.unlam.edu.ar;

public class AsignacionEquipoGrupo implements Comparable<AsignacionEquipoGrupo> {
	private String id;
	private Equipo equipo;
	public AsignacionEquipoGrupo(String id, Equipo equipo) {
		this.id = id;
		this.equipo = equipo;
	}
	protected String getId() {
		return id;
	}
	protected void setId(String id) {
		this.id = id;
	}
	protected Equipo getEquipo() {
		return equipo;
	}
	protected void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
	
	@Override
	public int compareTo(AsignacionEquipoGrupo o) {
		if(this.getId().compareTo(o.getId())==0)
			return this.getEquipo().compareTo(o.getEquipo());
		return this.getId().compareTo(o.getId());
	}
	

}
