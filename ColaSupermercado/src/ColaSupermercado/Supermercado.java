package ColaSupermercado;

import java.util.LinkedList;

public class Supermercado {
	 private LinkedList <Cliente> cola= new LinkedList<Cliente>();
	 private LinkedList <Cliente> colaRapida= new LinkedList<Cliente>();

	public Supermercado() {
		
	}
	
	public Integer cantidadDeClientesEnCola() {
		return this.cola.size();
	}
	
	public Integer cantidadDeClientesEnColaRapida() {
		return this.colaRapida.size();
	}
	
	
	public void agregarClienteALaCola(Cliente cliente) {
		this.cola.add(cliente);
	}
	
	public void agregarClienteALaColaRapida(Cliente cliente) {
		this.colaRapida.add(cliente);
	}
	
	
	public void aperturaColaRapida() {
		// Recorro la cola buscando los que tienen 5 o menos productos
		// Los quito de cola, y los agrego a cola rapida

		int i = 0;
        while (i < cola.size()) {
			if (cola.get(i).getCantidadDeProductos()<5) {
				agregarClienteALaColaRapida(cola.get(i));
				cola.remove(i);
			}
			else {
				i++;
			}
        }
	}
}
