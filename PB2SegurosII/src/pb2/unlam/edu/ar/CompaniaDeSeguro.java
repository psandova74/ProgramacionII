package pb2.unlam.edu.ar;

import java.util.HashSet;
import java.util.Set;

public class CompaniaDeSeguro {
	private String nombre;
	private Set<Poliza> polizasDeSeguro;

	public CompaniaDeSeguro(String nombre) {
		this.nombre = nombre;
		this.polizasDeSeguro=new HashSet<Poliza>();
	}

	public void agregarPoliza(Poliza polizaDeAuto) throws PolizaInexistente {
		if (getPoliza(polizaDeAuto.getNumeroDePoliza())==null)
			polizasDeSeguro.add(polizaDeAuto);
	}

	public Integer obtenerLaCantidadDePolizasEmitidas() {
		return polizasDeSeguro.size();
	}

	
	public void denunciarSiniestro(Integer id) throws PolizaInexistente{
		Poliza seguro=null;
		if (getPoliza(id)!=null) {
			seguro=getPoliza(id);
			seguro.setSiniestro(true);
		}
			
		

			
	}

	public Poliza getPoliza(Integer id) throws PolizaInexistente{
		for(Poliza seguro : polizasDeSeguro){
            if(seguro.getNumeroDePoliza().equals(id))
            	return seguro;
        }
		return null;
	}


}
