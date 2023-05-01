package pb2.unlam.edu.ar;

import java.util.Set;
import java.util.TreeSet;

public class Bar {
	private Integer cantidadClientes;
	private Set<Cliente> clientes = new TreeSet<Cliente>();
	// Comparable: Interfaz que define m�todo para comparar objetos que no son
	// comparables entre si naturalmente (integer/string)

	// No admite clientes dulicados (SET) 
	// LINKED >> si se ordenan por inserci�n
	// HASHSET >> si no me importa el orden
	//SORTED SET >> si debo garantizar orden 
	
	// TREESET >> si yo defino el orden

	public void ingresarCliente(Cliente cliente) {
		this.clientes.add(cliente);

	}

	public Object clientesActuales() {
		return clientes.size();
	}
	
	public TreeSet<Cliente> presentarClientes(){
		return (TreeSet<Cliente>) clientes;
	}
	
	public TreeSet<Cliente> presentarClientesOrdenadasPorEdad(){
		TreeSet<Cliente> porEdad = new TreeSet<Cliente>(new PorEdadComparador());
		porEdad.addAll(clientes);
		return porEdad;
	}
	
}
