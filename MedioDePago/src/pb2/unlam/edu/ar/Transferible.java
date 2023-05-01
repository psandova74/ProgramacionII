package pb2.unlam.edu.ar;

public interface Transferible {
	public Boolean extraer(Double importe) throws SaldoInsuficienteException;
	public Boolean depositar(Double importe);
	public Double getSaldo();
	
}
