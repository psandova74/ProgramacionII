package pb2.unlam.edu.ar;

import java.util.Comparator;

public class PorEdadComparador implements Comparator<Cliente> {

	@Override
	public int compare(Cliente c1, Cliente c2) {
		return c1.getEdad().compareTo(c2.getEdad());
	}

}
