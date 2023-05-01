package pb2.unlam.edu.ar;

public class MedioDePago {
	private String titular;

	public MedioDePago(String titular) {
		this.titular = titular;
	}

	protected String getTitular() {
		return titular;
	}

	protected void setTitular(String titular) {
		this.titular = titular;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((titular == null) ? 0 : titular.hashCode());
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
		MedioDePago other = (MedioDePago) obj;
		if (titular == null) {
			if (other.titular != null)
				return false;
		} else if (!titular.equals(other.titular))
			return false;
		return true;
	}
	
	
}
