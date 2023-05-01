package pb2.unlam.edu.ar;

public class Consumidor {
	private Integer dni;
	private String nombre;

	
	public Consumidor(Integer dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}


	protected Integer getDni() {
		return dni;
	}


	protected void setDni(Integer dni) {
		this.dni = dni;
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
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
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
		Consumidor other = (Consumidor) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}
	
	

}
