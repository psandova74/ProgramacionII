package pb2.unlam.edu.ar;

public class Comercio {
	private Long cuit;
	private String nombre;

	
	public Comercio(Long cuit, String nombre) {
		this.cuit = cuit;
		this.nombre = nombre;
	}


	protected Long getCuit() {
		return cuit;
	}


	protected void setCuit(Long cuit) {
		this.cuit = cuit;
	}


	protected String getNombre() {
		return nombre;
	}


	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cuit == null) ? 0 : cuit.hashCode());
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
		Comercio other = (Comercio) obj;
		if (cuit == null) {
			if (other.cuit != null)
				return false;
		} else if (!cuit.equals(other.cuit))
			return false;
		return true;
	}
	
	
}
