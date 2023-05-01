package ReproductorDeMusica;

public class Persona {
	private Integer DNI;
	private String apellido;
	private String nombre;
	private final Integer MAX_CANTIDAD_LISTA=50;
	private Cancion listaCanciones[];
	
	public Persona(Integer DNI,String apellido,String nombre) {
		this.DNI=DNI;
		this.apellido=apellido;
		this.nombre=nombre;
		listaCanciones=new Cancion[MAX_CANTIDAD_LISTA];	
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DNI == null) ? 0 : DNI.hashCode());
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
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
		Persona other = (Persona) obj;
		if (DNI == null) {
			if (other.DNI != null)
				return false;
		} else if (!DNI.equals(other.DNI))
			return false;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	public Integer getDNI() {
		return DNI;
	}

	public void setDNI(Integer dNI) {
		DNI = dNI;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Cancion[] getListaCanciones() {
		return listaCanciones;
	}
	
	public Boolean cargarCancionListaReproduccion(Cancion nuevaCancion) {
		for (int i=0;i<listaCanciones.length;i++) {
			if(listaCanciones[i]==null) {
				listaCanciones[i]=nuevaCancion;
				return true;
			}
			if (listaCanciones[i].equals(nuevaCancion)) {
				return false;
			}
		}
		return false;
	}
	
}
