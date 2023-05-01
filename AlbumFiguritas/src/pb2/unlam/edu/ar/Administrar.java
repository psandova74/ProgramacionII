package pb2.unlam.edu.ar;

public interface Administrar {
	public void agregarUnaFigurita(Figurita figurita) throws CodigoExistenteException;
	public Integer cantidadFiguritasExistentes();
	public Boolean containsFiguritaExistentes(Figurita figurita);
	
	// Esta se creo para poder mostrar el valor en el test
	public Figurita obtenerFiguritaExistentePorPosicion(Integer posicion);
}
