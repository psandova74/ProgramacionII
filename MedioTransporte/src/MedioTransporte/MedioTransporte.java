package MedioTransporte;

public class MedioTransporte {
	private Double latitud;
	private Double longitud;
	
	
	public MedioTransporte(Double latitud, Double longitud) {
		this.latitud = latitud;
		this.longitud = longitud;
	}
	protected Double getLatitud() {
		return latitud;
	}
	protected void setLatitud(Double latitud) {
		this.latitud = latitud;
	}
	protected Double getLongitud() {
		return longitud;
	}
	protected void setLongitud(Double longitud) {
		this.longitud = longitud;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((latitud == null) ? 0 : latitud.hashCode());
		result = prime * result + ((longitud == null) ? 0 : longitud.hashCode());
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
		MedioTransporte other = (MedioTransporte) obj;
		if (latitud == null) {
			if (other.latitud != null)
				return false;
		} else if (!latitud.equals(other.latitud))
			return false;
		if (longitud == null) {
			if (other.longitud != null)
				return false;
		} else if (!longitud.equals(other.longitud))
			return false;
		return true;
	}
	
	
	

}
