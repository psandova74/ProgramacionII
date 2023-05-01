package pb2.unlam.edu.ar;

public class Persona {
	private String nombre;
	private Integer dni;
	private Integer edad;
	
	public Persona(String nombre, Integer dni, Integer edad) {
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected Integer getDni() {
		return dni;
	}

	protected void setDni(Integer dni) {
		this.dni = dni;
	}

	protected Integer getEdad() {
		return edad;
	}

	protected void setEdad(Integer edad) {
		this.edad = edad;
	}
	
}
