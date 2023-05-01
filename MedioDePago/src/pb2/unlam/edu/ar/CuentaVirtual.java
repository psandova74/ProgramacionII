package pb2.unlam.edu.ar;

public class CuentaVirtual extends MedioDePago implements Transferible{
	private String cbu;
	private String entidad;
	private Double saldo;
	
	public CuentaVirtual(String cbu, String entidad,String titular) throws CVUInvalidoException{
		super(titular);
		if (cbu.length()!=23) {
			throw new CVUInvalidoException("El numero del CBU debe ser de 23 digitos");
		}
		this.cbu = cbu;
		this.entidad = entidad;
		this.saldo=0.0;
	}

	protected String getCbu() {
		return cbu;
	}

	protected void setCbu(String cbu) {
		this.cbu = cbu;
	}

	protected String getEntidad() {
		return entidad;
	}

	protected void setEntidad(String entidad) {
		this.entidad = entidad;
	}
	
	protected void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((cbu == null) ? 0 : cbu.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CuentaVirtual other = (CuentaVirtual) obj;
		if (cbu == null) {
			if (other.cbu != null)
				return false;
		} else if (!cbu.equals(other.cbu))
			return false;
		return true;
	}


	@Override
	public Boolean extraer(Double importe) {
		if (this.saldo>= importe) {
			this.saldo-=importe;
			return true;
		}
		return false;
	}

	@Override
	public Boolean depositar(Double importe) {
		this.saldo+=importe;
		return true;
	}

	@Override
	public Double getSaldo() {
		return saldo;
	}
	
	
	
}
