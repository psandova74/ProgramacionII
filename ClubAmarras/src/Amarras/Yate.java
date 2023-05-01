package Amarras;

public abstract class Yate{
	private static Integer PRECIO_ESTOLA_20M=2000;
	private static Integer PRECIO_ESTOLA_MAYOR_20M=3000;
	private String nombre;
	private String duenio;
	private Double manga;
	private Double calado;
	private Double stola;
	private Integer tripulacion;
	
	public Yate(String nombre, String duenio, Double manga, Double calado, Double stola, Integer tripulacion) {
		this.nombre = nombre;
		this.duenio = duenio;
		this.manga = manga;
		this.calado = calado;
		this.stola = stola;
		this.tripulacion = tripulacion;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((calado == null) ? 0 : calado.hashCode());
		result = prime * result + ((duenio == null) ? 0 : duenio.hashCode());
		result = prime * result + ((manga == null) ? 0 : manga.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((stola == null) ? 0 : stola.hashCode());
		result = prime * result + ((tripulacion == null) ? 0 : tripulacion.hashCode());
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
		Yate other = (Yate) obj;
		if (calado == null) {
			if (other.calado != null)
				return false;
		} else if (!calado.equals(other.calado))
			return false;
		if (duenio == null) {
			if (other.duenio != null)
				return false;
		} else if (!duenio.equals(other.duenio))
			return false;
		if (manga == null) {
			if (other.manga != null)
				return false;
		} else if (!manga.equals(other.manga))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (stola == null) {
			if (other.stola != null)
				return false;
		} else if (!stola.equals(other.stola))
			return false;
		if (tripulacion == null) {
			if (other.tripulacion != null)
				return false;
		} else if (!tripulacion.equals(other.tripulacion))
			return false;
		return true;
	}


	protected static Integer getPRECIO_ESTOLA_20M() {
		return PRECIO_ESTOLA_20M;
	}


	protected static void setPRECIO_ESTOLA_20M(Integer pRECIO_ESTOLA_20M) {
		PRECIO_ESTOLA_20M = pRECIO_ESTOLA_20M;
	}


	protected static Integer getPRECIO_ESTOLA_MAYOR_20M() {
		return PRECIO_ESTOLA_MAYOR_20M;
	}


	protected static void setPRECIO_ESTOLA_MAYOR_20M(Integer pRECIO_ESTOLA_MAYOR_20M) {
		PRECIO_ESTOLA_MAYOR_20M = pRECIO_ESTOLA_MAYOR_20M;
	}


	protected String getNombre() {
		return nombre;
	}


	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}


	protected String getDuenio() {
		return duenio;
	}


	protected void setDuenio(String duenio) {
		this.duenio = duenio;
	}


	protected Double getManga() {
		return manga;
	}


	protected void setManga(Double manga) {
		this.manga = manga;
	}


	protected Double getCalado() {
		return calado;
	}


	protected void setCalado(Double calado) {
		this.calado = calado;
	}


	protected Double getStola() {
		return stola;
	}


	protected void setStola(Double stola) {
		this.stola = stola;
	}


	protected Integer getTripulacion() {
		return tripulacion;
	}


	protected void setTripulacion(Integer tripulacion) {
		this.tripulacion = tripulacion;
	}


	public abstract Double obtenerPrecioDeAmarre();
	
}
