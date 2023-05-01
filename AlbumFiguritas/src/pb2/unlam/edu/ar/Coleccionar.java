package pb2.unlam.edu.ar;

import java.util.LinkedList;

public interface Coleccionar {
	public void agregarUnaFiguritaStock(Administrar usuarioAdm, Figurita figurita) throws FiguritaInexistenteException;
	public Integer cantidadFiguritasStock();
	public void agregarFiguritaAlAlbum(Figurita figurita) throws FiguritaNoDisponibleException, FiguritaRepetidaException;
	public Integer cantidadFiguritasAlbum();
	public void intercambioFiguritaTo(Administrar usuarioAdm,Figurita figurita1, Coleccionar usuarioFinal2, Figurita figurita) throws FiguritaNoDisponibleException, FiguritaInexistenteException;
	public void quitarFiguritaStock(Figurita figurita);
	public Boolean containsFiguritaStock(Figurita figurita);
	
	// Esta solo se crea para mostrar valor en el test
	public Figurita devolverPrimerFigurita();
}
