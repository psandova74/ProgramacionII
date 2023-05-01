package pb2.unlam.edu.ar;

public class Cliente implements Comparable<Cliente> {

	private String nombre;
	private Integer edad;

	public Cliente(String nombre, Integer edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public Cliente(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int compareTo(Cliente o) {
		return this.nombre.compareTo(o.nombre);
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		Cliente other = (Cliente) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected Integer getEdad() {
		return edad;
	}

	
	
	//como soy due�o puedo acceder a sus atributos

	// para movernos entre clases de Set debe ser compatible compareTo con Equals
	// para que el criterio sea el mismo
	
	
	//Para definir otros criterios de ordenamiento
	//COMPARATOR
	//
}
