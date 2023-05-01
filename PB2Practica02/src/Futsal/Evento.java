package Futsal;

public class Evento {
	private Integer minuto;
	private Jugador autor;
	private TipoDeEvento tipo;
	
	public Evento(Integer minuto, Jugador autor, TipoDeEvento tipo) {
		this.minuto = minuto;
		this.autor = autor;
		this.tipo = tipo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((minuto == null) ? 0 : minuto.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
		Evento other = (Evento) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (minuto == null) {
			if (other.minuto != null)
				return false;
		} else if (!minuto.equals(other.minuto))
			return false;
		if (tipo != other.tipo)
			return false;
		return true;
	}

	public Integer getMinuto() {
		return minuto;
	}

	public void setMinuto(Integer minuto) {
		this.minuto = minuto;
	}

	public Jugador getAutor() {
		return autor;
	}

	public void setAutor(Jugador autor) {
		this.autor = autor;
	}

	public TipoDeEvento getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeEvento tipo) {
		this.tipo = tipo;
	}
	
	

}
