package pb2.unlam.edu.ar;

import java.util.LinkedList;


public class ServicioMecanico {
	private String nombre;
	private LinkedList <Cliente> colaEnEspera;
	private LinkedList <Cliente> colaAtendidos;
	
	public ServicioMecanico(String nombre) {
		this.nombre = nombre;
		colaEnEspera= new LinkedList<Cliente>();
		colaAtendidos= new LinkedList<Cliente>();
		
	}
	
	public void ingresarClienteEspera(Cliente cliente,Long horaIngreso) {
		if(!colaEnEspera.contains(cliente)) {
			cliente.setEntradaColaEspera(horaIngreso);
			colaEnEspera.add(cliente);
		}	
	}
	
	public Integer cantidadColaEspera() {
		return colaEnEspera.size();
	}

	public void atenderUnCliente(Long horaIngreso) throws NoHayClienteParaAtenderException {
		if(cantidadColaEspera()==0) {
			throw new NoHayClienteParaAtenderException("No hay clientes en la cola");
		}
		Cliente clienteAtender=colaEnEspera.removeFirst();
		clienteAtender.setEntradaColaAtendido(horaIngreso);
		colaAtendidos.add(clienteAtender);
	}
	
	public Integer cantidadColaAtendidos() {
		return colaAtendidos.size();
	}
	

	public Long tiempoPromedioDeEspera(Long horaActual) {
		Long sumatoriaTiempoEspera=0L;
		if(cantidadColaEspera()==0) 
			return 0L;
		for(Cliente actual: colaEnEspera) 
			sumatoriaTiempoEspera+=(horaActual - actual.getEntradaColaEspera());
		return sumatoriaTiempoEspera/cantidadColaEspera();
	}

	public Long tiempoPromedioDeEsperaDeAtendidos() {
		Long sumatoriaTiempoEspera=0L;
		if(colaAtendidos.size()==0) 
			return 0L;
		for(Cliente actual: colaEnEspera) 
			sumatoriaTiempoEspera+=(actual.getEntradaColaAtendido()-actual.getEntradaColaEspera());
		return sumatoriaTiempoEspera/colaAtendidos.size();
	}
	
	
	 
	 
}
