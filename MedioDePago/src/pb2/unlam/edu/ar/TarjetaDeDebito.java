package pb2.unlam.edu.ar;

public class TarjetaDeDebito extends MedioDePago implements Pagadora {
	private Long numeroDeTarjeta;
	private String fechaVencimiento;
	private Integer codigoSeguridad;
	private Double saldo;
	
	public TarjetaDeDebito(Long numeroDeTarjeta, String titular, String fechaVencimiento, Integer codigoSeguridad) throws NumeroDeTarjetaInvalidoException{
		super(titular);
		if(Long.toString(numeroDeTarjeta).length()!=16) {
			throw new NumeroDeTarjetaInvalidoException("El numero de tarjeta debe ser de 16 digitos");
		}
		this.numeroDeTarjeta = numeroDeTarjeta;
		this.fechaVencimiento = fechaVencimiento;
		this.codigoSeguridad = codigoSeguridad;
		this.saldo = 0.0;
	}
	
	public Long getNumero() {
		return numeroDeTarjeta;
	}

	protected void setNumeroDeTarjeta(Long numeroDeTarjeta) {
		this.numeroDeTarjeta = numeroDeTarjeta;
	}

	protected String getFechaVencimiento() {
		return fechaVencimiento;
	}

	protected void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	protected Integer getCodigoSeguridad() {
		return codigoSeguridad;
	}

	protected void setCodigoSeguridad(Integer codigoSeguridad) {
		this.codigoSeguridad = codigoSeguridad;
	}

	protected Double getSaldo() {
		return saldo;
	}

	protected void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((numeroDeTarjeta == null) ? 0 : numeroDeTarjeta.hashCode());
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
		TarjetaDeDebito other = (TarjetaDeDebito) obj;
		if (numeroDeTarjeta == null) {
			if (other.numeroDeTarjeta != null)
				return false;
		} else if (!numeroDeTarjeta.equals(other.numeroDeTarjeta))
			return false;
		return true;
	}

	@Override
	public Boolean pagar(Compra compra) throws SaldoInsuficienteException {
		if(compra.getPrecioPagar()<=this.saldo) {
			compra.setPagada(true);
			saldo-=saldo-compra.getPrecioPagar();
			return true;
		}
		throw new SaldoInsuficienteException();
	}

	@Override
	public Boolean validadFactibilidad(Compra Compra) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
