package transporte;

public class Persona {
	private Integer idPersona;
	private String nombreApellido;
	private TipoPersona tipoPersona;
	
	public Persona(Integer idPersona, String nombreApellido, TipoPersona tipoPersona) {
		this.idPersona = idPersona;
		this.nombreApellido = nombreApellido;
		this.tipoPersona = tipoPersona;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idPersona == null) ? 0 : idPersona.hashCode());
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
		Persona other = (Persona) obj;
		if (idPersona == null) {
			if (other.idPersona != null)
				return false;
		} else if (!idPersona.equals(other.idPersona))
			return false;
		return true;
	}

	protected Integer getIdPersona() {
		return idPersona;
	}

	protected void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	protected String getNombreApellido() {
		return nombreApellido;
	}

	protected void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}

	protected TipoPersona getTipoPersona() {
		return tipoPersona;
	}

	protected void setTipoPersona(TipoPersona tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

	
	
}
