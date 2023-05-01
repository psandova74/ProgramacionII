package pb2.unlam.edu.ar;

public class Figurita {
	private Integer id;
	private Character grupo;
	private String seleccion;
	private String nombre;
	private Double valor;
	
	public Figurita(Integer id, Character letra, String seleccion, String nombre, Double valor) {
		this.id = id;
		this.grupo = letra;
		this.seleccion = seleccion;
		this.nombre = nombre;
		this.valor = valor;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Character getGrupo() {
		return grupo;
	}
	public void setGrupo(Character grupo) {
		this.grupo = grupo;
	}
	public String getSeleccion() {
		return seleccion;
	}
	public void setSeleccion(String seleccion) {
		this.seleccion = seleccion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Figurita other = (Figurita) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
