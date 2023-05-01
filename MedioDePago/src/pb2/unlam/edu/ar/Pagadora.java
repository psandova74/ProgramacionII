package pb2.unlam.edu.ar;

public interface Pagadora {
	public Boolean validadFactibilidad(Compra Compra);
	public Boolean pagar(Compra codigoQR) throws ExcedeLimiteDeCompraException,SaldoInsuficienteException;
	

}
