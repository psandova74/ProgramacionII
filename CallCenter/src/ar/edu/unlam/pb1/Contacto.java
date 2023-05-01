package ar.edu.unlam.pb1;

public class Contacto {
	
	/*
	 * Se deben incorporar los atributos necesarios.
	 * 
	 * �	Nombre y Apellido: No se aceptan n�meros.
	 * �	Celular: Compuesto del c�digo de pa�s + c�digo de �rea + n�mero de celular.
	 * �	E-Mail: Debe contener al menos el s�mbolo �@� y el caracter �.�.
	 * �	Direcci�n: Valor alfanum�rico.
	 * �	C�digo Postal: Valor num�rico.
	 * �	Localidad: Valor alfanum�rico.
	 * �	Provincia. Enumerador que contenga las 23 provincias argentinas.
	 * �	Es cliente (Si o No): Inicialmente se carga en �No�.
	 * �	Desea ser llamado nuevamente (Si o No): Inicialmente se carga en �Si�.
	 */
	private String nombreYApellido;
	private String celular;
	private String eMail;
	private String direccion;
	private int codigoPostal;
	private String localidad;
	private Provincia provincia;
	private boolean esCliente;
	private boolean deseaSerLlamadoNuevamente;
	private final int CANTIDAD_MAXIMA_DE_LLAMADOS_POR_CONTACTOS=10;
	private Llamada llamadasRecibidas[];
	
	public Contacto(String nombreYApellido, String celular, String eMail, String direccion, int codigoPostal, String localidad, Provincia provincia) {
		this.nombreYApellido=nombreYApellido;
		this.celular=celular;
		this.eMail=eMail;
		this.direccion=direccion;
		this.codigoPostal=codigoPostal;
		this.localidad=localidad;
		this.provincia=provincia;
		this.esCliente=false;
		this.deseaSerLlamadoNuevamente=true;
		llamadasRecibidas=new Llamada[CANTIDAD_MAXIMA_DE_LLAMADOS_POR_CONTACTOS];
	}
	
	public Contacto() {
		this.nombreYApellido="";
		this.celular="";
		this.eMail="";
		this.direccion="";
		this.codigoPostal=0;
		this.localidad="";
		this.provincia=Provincia.BUENOS_AIRES;
		this.esCliente=false;
		this.deseaSerLlamadoNuevamente=true;
		llamadasRecibidas=new Llamada[CANTIDAD_MAXIMA_DE_LLAMADOS_POR_CONTACTOS];
	}
	
	
	public String getLocalidad() {
		return localidad;
	}


	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}


	public String getNombreYApellido() {
		return nombreYApellido;
	}


	public void setNombreYApellido(String nombreYApellido) {
		this.nombreYApellido = nombreYApellido;
	}


	public String getCelular() {
		return celular;
	}


	public void setCelular(String celular) {
		this.celular = celular;
	}


	public String geteMail() {
		return eMail;
	}


	public void seteMail(String eMail) {
		this.eMail = eMail;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public int getCodigoPostal() {
		return codigoPostal;
	}


	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}


	public Provincia getProvincia() {
		return provincia;
	}


	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}


	public boolean isEsCliente() {
		return esCliente;
	}


	public void setEsCliente(boolean esCliente) {
		this.esCliente = esCliente;
	}


	public boolean isDeseaSerLlamadoNuevamente() {
		return deseaSerLlamadoNuevamente;
	}


	public void setDeseaSerLlamadoNuevamente(boolean deseaSerLlamadoNuevamente) {
		this.deseaSerLlamadoNuevamente = deseaSerLlamadoNuevamente;
	}


	public Llamada[] getLlamadasRecibidas() {
		return llamadasRecibidas;
	}


	public void setLlamadasRecibidas(Llamada[] llamadasRecibidas) {
		this.llamadasRecibidas = llamadasRecibidas;
	}


	public int getCANTIDAD_MAXIMA_DE_LLAMADOS_POR_CONTACTOS() {
		return CANTIDAD_MAXIMA_DE_LLAMADOS_POR_CONTACTOS;
	}


	public static boolean esEmailValido(String eMail) {
		/*
		 * Eval�a si un String determinado puede ser almacenado como E-MAIL.
		 */
		boolean tieneArroba=false,tienePunto=false;
		char eMailPropuesto[]=eMail.toCharArray();
		for (int i=0;i<eMailPropuesto.length;i++) {
			if(eMailPropuesto[i]=='@') {
				tieneArroba=true;
			}
			if(eMailPropuesto[i]=='.') {
				tienePunto=true;
			}
		}
		if (tieneArroba && tienePunto) {
			return true;
		}else {
			return false;
		}
		
		 /* Otra forma de hacerlo.
		  * 
		  * if  (eMail.contains("@") && eMail.contains(".")) {
			  
		  }*/
	}
	
	public boolean registrarNuevaLlamada(Llamada nueva) {
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
	
	public String toString() {
		/*
		 * Muestra los datos de un contacto, entre los que se debe incluir el registro de las llamadas realizadas.
		 */
		String resultado=""; 
		resultado=this.nombreYApellido+"\n"+this.celular;
		for (int i=0;i<llamadasRecibidas.length;i++) {
			if (llamadasRecibidas[i]!=null) {
				resultado+="\n"+llamadasRecibidas[i].getObservaciones();
			}
		}
		return resultado;
	}
	
}
