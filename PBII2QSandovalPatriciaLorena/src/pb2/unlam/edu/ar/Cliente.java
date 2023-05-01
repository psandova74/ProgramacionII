package pb2.unlam.edu.ar;

public class Cliente {
	private Integer codigo;
	private String nombre;
	private String telefono;
	private Long entradaColaEspera;
	private Long entradaColaAtendido;
	
	
	public Cliente(Integer codigo, String nombre, String telefono) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.telefono = telefono;
		entradaColaEspera=0L;
		entradaColaAtendido=0L;
	}
	protected Integer getCodigo() {
		return codigo;
	}
	protected void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected String getTelefono() {
		return telefono;
	}
	protected void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	protected Long getEntradaColaEspera() {
		return entradaColaEspera;
	}
	protected void setEntradaColaEspera(Long entradaColaEspera) {
		this.entradaColaEspera = entradaColaEspera;
	}
	protected Long getEntradaColaAtendido() {
		return entradaColaAtendido;
	}
	protected void setEntradaColaAtendido(Long entradaColaAtendido) {
		this.entradaColaAtendido = entradaColaAtendido;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		Cliente other = (Cliente) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	
	
}
