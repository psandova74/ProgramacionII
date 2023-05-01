package Callcenter;


public class Empresa {
	private Integer zonasDeCobertura[];
	private String nombreEmpresa;
	private Contacto contactos[];
	
	private final Integer CANTIDAD_MAXIMA_DE_ZONAS_DE_COBERTURA=100;
	private final Integer CANTIDAD_MAXIMA_DE_CONTACTOS=100;

	public Empresa(String nombreEmpresa) {
		this.nombreEmpresa=nombreEmpresa;
		zonasDeCobertura=new Integer[CANTIDAD_MAXIMA_DE_ZONAS_DE_COBERTURA];
		contactos=new Contacto[CANTIDAD_MAXIMA_DE_CONTACTOS];
	}
		
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombre(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	
	public Boolean agregarNuevoContacto(Contacto nuevo) {
		/*
		 * Incorpora un nuevo contacto a la empresa
		 */
		for(int i=0;i<contactos.length;i++) {
			if(contactos[i]==null) {
				contactos[i]=nuevo;
				return true;
			}
			if(contactos[i].equals(nuevo)) {
				return false;
			}
		}
		return false;
	}
	
	public Boolean agregarNuevaZonaDeCobertura(Integer codigoPostal) {
		/*
		 * Incorpora una nueva zona de cobertura 
		 * (Las zonas de cobertura se identifican por el codigo postal)
		 */
		for (int i=0;i<zonasDeCobertura.length;i++) {
			if (zonasDeCobertura[i]==null) {
				zonasDeCobertura[i]=codigoPostal;
				return true;
			}
			if(zonasDeCobertura[i].equals(codigoPostal)) {
				return false;
			}
		}
		return false;
	}	
	
	public Boolean elCodigoPostalEstaDentroDeLaZonaDeCobertura(Integer codigoPostal) {
		/*
		 * Determina si un c�digo postal est� dentro de la zona de cobertura
		 */
		for (int i=0;i<zonasDeCobertura.length;i++) {
			if (zonasDeCobertura[i]!=null && zonasDeCobertura[i].equals(codigoPostal)) {
				return true;
			}
		}
		return false;
	}
	
	public Contacto buscarPorNombre(String nombreABuscar) {
		for (int i=0;i<contactos.length;i++) {
			if(contactos[i]!=null && contactos[i].getNombreYapellido().equalsIgnoreCase(nombreABuscar)) {
				return contactos[i];
			}
		}
		return null;
	}
	
	public Contacto buscarCandidato() {
		/*
		 * Para determinar qu� contacto el sistema debe mostrar, se debe realizar la siguiente b�squeda:
		 * 1.	El contacto NO debe ser cliente a�n.
		 * 2.	El contacto desea ser llamado o al menos no inform� lo contrario.
		 * 3.	El c�digo postal del contacto debe existir en las zonas de cobertura existente.
		 * 4.	Del conjunto de contactos resultante se debe seleccionar aleatoriamente el pr�ximo llamado.
		 */
		Boolean tieneCobertura;
		Integer codigoPostal;
		for (int i=0;i<contactos.length;i++) {
			if(contactos[i]!=null && contactos[i].getDeseaSerLlamadoNuevamente()  && !contactos[i].getEsCliente() && elCodigoPostalEstaDentroDeLaZonaDeCobertura(contactos[i].getCodigoPostal())) {
				return contactos[i];
			}
		}
		return null;
	}
}
