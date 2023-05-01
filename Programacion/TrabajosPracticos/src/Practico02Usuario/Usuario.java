package Practico02Usuario;

public class Usuario {
	private String usuario;
	private String contrasenia;
	private String nombre;
	private String apellido;
	private int dni;
	private int edad;
	private boolean claveBloqueada;
	private int intentosFallidos;
	
	public Usuario(String usuario, String contrasenia, String nombre, String apellido, int dni, int edad) {
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
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasenia() {
		return  "***********";
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
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
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public boolean isClaveBloqueada() {
		return claveBloqueada;
	}

	public int getIntentosFallidos() {
		return intentosFallidos;
	}


	public boolean login(String usuario, String contrasenia) {
		if (this.isClaveBloqueada()) {	
			return false;
		} else {
			//if ( this.usuario.compareTo(usuario)==0 && this.contrasenia.compareTo(contrasenia)==0) {
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
