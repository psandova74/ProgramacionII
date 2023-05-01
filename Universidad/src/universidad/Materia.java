package universidad;

public class Materia {
	private Integer idMateria;
	private String descripcion;
	
	public Materia(Integer idMateria, String descripcion) {
		this.idMateria = idMateria;
		this.descripcion = descripcion;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idMateria == null) ? 0 : idMateria.hashCode());
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
		Materia other = (Materia) obj;
		if (idMateria == null) {
			if (other.idMateria != null)
				return false;
		} else if (!idMateria.equals(other.idMateria))
			return false;
		return true;
	}


	protected Integer getIdMateria() {
		return idMateria;
	}

	protected void setIdMateria(Integer idMateria) {
		this.idMateria = idMateria;
	}

	protected String getDescripcion() {
		return descripcion;
	}

	protected void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
