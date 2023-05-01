package login;

public class Usuario {
	private String usuario;
	private String mail;
	private String password;
	private Integer edad;
	public Usuario(String usuario, String mail, String password, Integer edad) {
		this.usuario = usuario;
		this.mail = mail;
		this.password = password;
		this.edad = edad;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mail == null) ? 0 : mail.hashCode());
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
		if (mail == null) {
			if (other.mail != null)
				return false;
		} else if (!mail.equals(other.mail))
			return false;
		return true;
	}

	protected String getUsuario() {
		return usuario;
	}
	protected void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	protected String getMail() {
		return mail;
	}
	protected void setMail(String mail) {
		this.mail = mail;
	}
	protected String getPassword() {
		return password;
	}
	protected void setPassword(String password) {
		this.password = password;
	}
	protected Integer getEdad() {
		return edad;
	}
	protected void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	

}
