package Callcenter;

public class Contacto {
	private String nombreYapellido;
	private String celular;
	private String email;
	private String direccion;
	private Integer codigoPostal;
	private String localidad;
	private Provincia provincia;
	private Boolean esCliente;
	private Boolean deseaSerLlamadoNuevamente;
	private final Integer CANTIDAD_MAXIMA_DE_LLAMADOS_POR_CONTACTOS=10;
	private Llamada llamadasRecibidas[];

	public Contacto(String nombreYapellido, String celular, String email, String direccion,Integer codigoPostal, String localidad, Provincia provincia) {
		this.nombreYapellido= nombreYapellido;
		this.celular= celular;
		this.email=email;
		this.direccion= direccion;
		this.codigoPostal= codigoPostal;
		this.localidad= localidad;
		this.provincia= provincia;
		this.esCliente=false;
		this.deseaSerLlamadoNuevamente=true;
		this.llamadasRecibidas=new Llamada[CANTIDAD_MAXIMA_DE_LLAMADOS_POR_CONTACTOS];
	}
		

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((celular == null) ? 0 : celular.hashCode());
		result = prime * result + ((codigoPostal == null) ? 0 : codigoPostal.hashCode());
		result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((localidad == null) ? 0 : localidad.hashCode());
		result = prime * result + ((nombreYapellido == null) ? 0 : nombreYapellido.hashCode());
		result = prime * result + ((provincia == null) ? 0 : provincia.hashCode());
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
		Contacto other = (Contacto) obj;
		if (celular == null) {
			if (other.celular != null)
				return false;
		} else if (!celular.equals(other.celular))
			return false;
		if (codigoPostal == null) {
			if (other.codigoPostal != null)
				return false;
		} else if (!codigoPostal.equals(other.codigoPostal))
			return false;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (localidad == null) {
			if (other.localidad != null)
				return false;
		} else if (!localidad.equals(other.localidad))
			return false;
		if (nombreYapellido == null) {
			if (other.nombreYapellido != null)
				return false;
		} else if (!nombreYapellido.equals(other.nombreYapellido))
			return false;
		if (provincia != other.provincia)
			return false;
		return true;
	}





	public String getNombreYapellido() {
		return nombreYapellido;
	}


	public void setNombreYapellido(String nombreYapellido) {
		this.nombreYapellido = nombreYapellido;
	}



	public String getCelular() {
		return celular;
	}



	public void setCelular(String celular) {
		this.celular = celular;
	}



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (esEmailValido(email)) {
			this.email = email;
		}
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public Integer getCodigoPostal() {
		return codigoPostal;
	}



	public void setCodigoPostal(Integer codigoPostal) {
		this.codigoPostal = codigoPostal;
	}



	public String getLocalidad() {
		return localidad;
	}



	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}



	public Provincia getProvincia() {
		return provincia;
	}


	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}


	public Boolean getEsCliente() {
		return esCliente;
	}





	public void setEsCliente(Boolean esCliente) {
		this.esCliente = esCliente;
	}





	public Boolean getDeseaSerLlamadoNuevamente() {
		return deseaSerLlamadoNuevamente;
	}





	public void setDeseaSerLlamadoNuevamente(Boolean deseaSerLlamadoNuevamente) {
		this.deseaSerLlamadoNuevamente = deseaSerLlamadoNuevamente;
	}


	public  Boolean esEmailValido(String eMail) {
		  if  (eMail.contains("@") && eMail.contains(".")) {
			  return true;
		  }
		  return false;
	}
	
	
	public Boolean registrarNuevaLlamada(Llamada nueva) {
		/*
		 * Registra una nueva llamada asociada al contacto actual.
		 */
		for (int i=0;i<llamadasRecibidas.length;i++) {
			if (llamadasRecibidas[i]==null) {
				llamadasRecibidas[i]=nueva;
				return true;
			}
		}
		//Se llego a la cantidad maxima de llamados, por eso lo marcamos para no ser llamado.
		this.deseaSerLlamadoNuevamente=false;
		return false;
	}
	

}
