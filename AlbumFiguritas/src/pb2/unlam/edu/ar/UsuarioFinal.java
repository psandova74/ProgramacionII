package pb2.unlam.edu.ar;

import java.util.LinkedList;
import java.util.TreeSet;

public class UsuarioFinal extends Usuario implements Coleccionar {
	private TreeSet<Figurita> figuritasAlbum;
	private LinkedList<Figurita> figuritasStock;
	
	public UsuarioFinal(String nombre) {
		super(nombre);
		figuritasAlbum=new TreeSet<>(new OrdenDeFiguritas());
		figuritasStock= new LinkedList<>();
	}
	
	

	protected TreeSet<Figurita> getFiguritasAlbum() {
		return figuritasAlbum;
	}



	protected void setFiguritasAlbum(TreeSet<Figurita> figuritasAlbum) {
		this.figuritasAlbum = figuritasAlbum;
	}

	@Override
	public void agregarUnaFiguritaStock(Administrar usuarioAdm,Figurita figurita) throws FiguritaInexistenteException {
		if(!usuarioAdm.containsFiguritaExistentes(figurita)) {
			throw new FiguritaInexistenteException("La figurita no fue registrada por el Administrador");
		}
		figuritasStock.add(figurita);
	}

	@Override
	public Integer cantidadFiguritasStock() {
		return figuritasStock.size();
	}

	@Override
	public void agregarFiguritaAlAlbum(Figurita figurita) throws FiguritaNoDisponibleException, FiguritaRepetidaException {
		if(!figuritasStock.contains(figurita)) {
			throw new FiguritaNoDisponibleException("La figurita no esta en Stock");
		}
		if(figuritasAlbum.contains(figurita)) {
			throw new FiguritaRepetidaException("La figurita esta repetida");
		}
		figuritasStock.remove(figurita);
		figuritasAlbum.add(figurita);
	}

	@Override
	public Integer cantidadFiguritasAlbum() {
		return figuritasAlbum.size();
	}

	
	@Override
	public void intercambioFiguritaTo(Administrar usuarioAdm,Figurita figurita1, Coleccionar usuarioFinal2, Figurita figurita2)
			throws FiguritaNoDisponibleException, FiguritaInexistenteException {
		
		if(!this.containsFiguritaStock(figurita1)) {
			throw new FiguritaNoDisponibleException("La figurita no esta en Stock del usuario 1");
		}
		
		if(!usuarioFinal2.containsFiguritaStock(figurita2)) {
			throw new FiguritaNoDisponibleException("La figurita no esta en Stock del usuario 2");
		}
		this.quitarFiguritaStock(figurita1);
		usuarioFinal2.agregarUnaFiguritaStock(usuarioAdm,figurita1);
		
		usuarioFinal2.quitarFiguritaStock(figurita2);
		this.agregarUnaFiguritaStock(usuarioAdm,figurita2);
	}

	@Override
	public Figurita devolverPrimerFigurita() {
		return figuritasStock.getFirst();
	}
	
	@Override
	public Boolean containsFiguritaStock(Figurita figurita) {
		return figuritasStock.contains(figurita);
	}
	
	@Override
	public void quitarFiguritaStock(Figurita figurita) {
		figuritasStock.remove(figurita);
	}

}
