package Sistema;

public class Usuario {
	private String usuario;
	private String contrasenia;
	private String nombre;
	private String apellido;
	private Integer dni;
	private Integer edad;
	private Boolean claveBloqueada;
	private Integer  intentosFallidos;
	
	public Usuario(String usuario, String contrasenia, String nombre, String apellido, Integer dni, Integer edad) {
		this.usuario = usuario;
		this.contrasenia = contrasenia;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
		this.claveBloqueada=false;
		this.intentosFallidos=0;
	}
	
	public Usuario(String usuario, String contrasenia) {
		this.usuario = usuario;
		this.contrasenia = contrasenia;
		this.nombre = "";
		this.apellido = "";
		this.dni = 0;
		this.edad = 0;
		this.claveBloqueada=false;
		this.intentosFallidos=0;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
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
		Usuario other = (Usuario) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Boolean getClaveBloqueada() {
		return claveBloqueada;
	}

	public void setClaveBloqueada(Boolean claveBloqueada) {
		this.claveBloqueada = claveBloqueada;
	}

	public Integer getIntentosFallidos() {
		return intentosFallidos;
	}

	public void setIntentosFallidos(Integer intentosFallidos) {
		this.intentosFallidos = intentosFallidos;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public boolean login(String usuario, String contrasenia) {
		if (this.getClaveBloqueada()) {	
			return false;
		} else {
			if ( this.usuario.equals(usuario) && this.contrasenia.equals(contrasenia)) {
				return true;
			} else {
				this.intentosFallidos++;
				if (this.intentosFallidos==3) {
					this.claveBloqueada=true;
				}
				return false;
			}
		}
		
	}
	
	
}
