package ar.edu.unlam.pb2.eva03;

public class Vehiculo {
	private String nombre;
	private Integer identificador;
	private Boolean presentaBatalla;
		
	public Vehiculo(Integer identificador, String nombre) {
		this.identificador=identificador;
		this.nombre=nombre;
	}

	public Vehiculo(String identificador, String nombre) {
		Integer nuevoIdentificador= Integer.parseInt(identificador);
		this.identificador=nuevoIdentificador;
		this.nombre=nombre;
		this.presentaBatalla=false;
	}
	
	
	protected Boolean getPresentaBatalla() {
		return presentaBatalla;
	}

	protected void setPresentaBatalla(Boolean presentaBatalla) {
		this.presentaBatalla = presentaBatalla;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected Integer getIdentificador() {
		return identificador;
	}

	protected void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}
	
	public Double getAltura() {
		return null;
	}
	public Double getVelocidad() {
		return null;
	}
	public Double getProfundidad() {
		return null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((identificador == null) ? 0 : identificador.hashCode());
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
		Vehiculo other = (Vehiculo) obj;
		if (identificador == null) {
			if (other.identificador != null)
				return false;
		} else if (!identificador.equals(other.identificador))
			return false;
		return true;
	}

	
}
