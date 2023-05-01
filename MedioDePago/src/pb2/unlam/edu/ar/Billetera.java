package pb2.unlam.edu.ar;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Billetera {
	private String nombre;
	 Set<Consumidor> consumidores;
	 Set<Comercio> comercios;
	 Set<MedioDePago> mediosDePago;
	 List<Compra> compras;

	

	public Billetera(String nombre) {
		this.nombre=nombre;
		this.comercios =new HashSet<Comercio>();
		this.consumidores =new HashSet<Consumidor>();
		this.mediosDePago =new HashSet<MedioDePago>();
		this.compras =new ArrayList<Compra>();
	}


	protected String getNombre() {
		return nombre;
	}


	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void agregarComercio(Comercio comercio) {
		this.comercios.add(comercio);
		
	}

	public Integer getCantidadDeComercios() {
		return this.comercios.size();
	}


	public void agregarConsumidor(Consumidor consumidor) {
		this.consumidores.add(consumidor);
		
	}
	
	public Integer agregarConsumidor() {
		return this.consumidores.size();
		
	}
	
	public void agregarCompra(Compra compra) {
		this.compras.add(compra);	
	}
	
	public Integer getCantidadDeCompras() {
		return this.compras.size();
	}
	
	public void agregarMedioDePago(MedioDePago nuevoMedioPago) {
		this.mediosDePago.add(nuevoMedioPago);
	}
	
	public Integer getCantidadDeConsumidor() {
		return this.consumidores.size();
	}

	public Consumidor buscarConsumidor(Integer idConsumidor) {
			for (Consumidor consumidor : consumidores) 
				if ((consumidor.getDni().equals(idConsumidor))) 
					return consumidor;
			return null;
	}
	
	public Integer buscarCantidadMediosPagoPorConsumidor(String nombre) {
		Integer contadorMedioPago=0;
		for (MedioDePago buscoPago : mediosDePago) 
			if ((buscoPago.getTitular().equals(nombre))) 
				contadorMedioPago++;
		return contadorMedioPago;
	}
	
	
	
	public void agregarMedioDePagoAUnConsumidor(Integer idConsumidor, MedioDePago medioDePago) {
		
		this.agregarMedioDePago(medioDePago);
	}



	public Compra generarCodigoQR(Comercio comercio, double precioAPagar) {
		Compra nuevaCompra=new Compra(comercio,precioAPagar);
		compras.add(nuevaCompra);
		return nuevaCompra;
	}

	
	public Boolean pagar(Compra codigoQR, Pagadora medioPagador) throws ExcedeLimiteDeCompraException, SaldoInsuficienteException {
		if(!codigoQR.getPagada()) {
			return medioPagador.pagar(codigoQR);
		} 
		return false;
	}

	public Comercio buscarComercio(long cuitComercio) {
		for (Comercio comercio : comercios) 
			if ((comercio.getCuit().equals(cuitComercio))) 
				return comercio;
		return null;
	}

	public Boolean transferir(Transferible cuentaOrigen, Transferible cuentaDestino, Double importe) throws SaldoInsuficienteException {
		if (cuentaOrigen.extraer(importe)) {
			cuentaDestino.depositar(importe);
			return true;
		} throw new SaldoInsuficienteException();
	}

}
