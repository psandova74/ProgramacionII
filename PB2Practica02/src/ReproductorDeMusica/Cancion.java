package ReproductorDeMusica;

public class Cancion {
	private String nombreTema;
	private String autoTema;
	private Genero genero;
	private Double duracion;
	
	private Cancion(String nombreTema,String autoTema, Genero genero,Double duracion) {
		this.nombreTema=nombreTema;
		this.autoTema=autoTema;
		this.genero=genero;
		this.duracion=duracion;	
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autoTema == null) ? 0 : autoTema.hashCode());
		result = prime * result + ((duracion == null) ? 0 : duracion.hashCode());
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + ((nombreTema == null) ? 0 : nombreTema.hashCode());
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
		Cancion other = (Cancion) obj;
		if (autoTema == null) {
			if (other.autoTema != null)
				return false;
		} else if (!autoTema.equals(other.autoTema))
			return false;
		if (duracion == null) {
			if (other.duracion != null)
				return false;
		} else if (!duracion.equals(other.duracion))
			return false;
		if (genero != other.genero)
			return false;
		if (nombreTema == null) {
			if (other.nombreTema != null)
				return false;
		} else if (!nombreTema.equals(other.nombreTema))
			return false;
		return true;
	}

	public String getNombreTema() {
		return nombreTema;
	}

	public void setNombreTema(String nombreTema) {
		this.nombreTema = nombreTema;
	}

	public String getAutoTema() {
		return autoTema;
	}

	public void setAutoTema(String autoTema) {
		this.autoTema = autoTema;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Double getDuracion() {
		return duracion;
	}

	public void setDuracion(Double duracion) {
		this.duracion = duracion;
	}
	
}
