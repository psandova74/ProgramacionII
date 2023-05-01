package pb2.unlam.edu.ar;

public class Equipo implements Comparable<Equipo>{
	private Integer id;
	private String nombre;
	
	public Equipo(Integer id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


	protected Integer getId() {
		return id;
	}
	protected void setId(Integer id) {
		this.id = id;
	}
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public int compareTo(Equipo equipo) {
		return this.nombre.compareTo(equipo.nombre);
	}
	
}
