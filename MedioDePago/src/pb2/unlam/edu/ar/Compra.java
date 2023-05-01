package pb2.unlam.edu.ar;

public class Compra {
	private Long numeroFactura;
	private Comercio comercio;
	private Double precioPagar;
	private Boolean pagada;
	
	static Long numeracion =1L;
	
	public Compra(Comercio comercio, Double precioPagar) {
		this.numeroFactura = numeracion++;
		this.comercio = comercio;
		this.precioPagar = precioPagar;
		this.pagada=false;
	}

	protected Long getNumeroFactura() {
		return numeroFactura;
	}

	protected void setNumeroFactura(Long numeroFactura) {
		this.numeroFactura = numeroFactura;
	}

	protected Comercio getComercio() {
		return comercio;
	}

	protected void setComercio(Comercio comercio) {
		this.comercio = comercio;
	}

	protected Double getPrecioPagar() {
		return precioPagar;
	}

	protected void setPrecioPagar(Double precioPagar) {
		this.precioPagar = precioPagar;
	}

	protected Boolean getPagada() {
		return pagada;
	}

	protected void setPagada(Boolean pagada) {
		this.pagada = pagada;
	}
	
	
	
	


}
