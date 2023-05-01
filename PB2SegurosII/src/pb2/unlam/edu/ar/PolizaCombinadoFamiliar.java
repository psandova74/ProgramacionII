package pb2.unlam.edu.ar;

import java.util.HashMap;
import java.util.Map;

public class PolizaCombinadoFamiliar extends Poliza implements InterfaseBeneficiario, InteraseCasa{
	private Vivienda casa;
	private Map<Persona,TipoDeBeneficiario> beneficiarios; 
	
	public PolizaCombinadoFamiliar(Integer numeroDePoliza, Persona asegurado, Double sumaAsegurada, Double prima) {
		super(numeroDePoliza, asegurado, sumaAsegurada, prima);
		this.beneficiarios = new HashMap<Persona,TipoDeBeneficiario>();
	}

	
	protected Vivienda getCasa() {
		return casa;
	}


	protected void setCasa(Vivienda casa) {
		this.casa = casa;
	}


	@Override
	public void agregarBeneficiario(Persona nuevaPersona, TipoDeBeneficiario tipoBeneficiario) {
		this.beneficiarios.put(nuevaPersona,tipoBeneficiario);
		
	}
	
	@Override
	public void agregarBienAsegurado(Vivienda casa) {
		this.casa=casa;
		
	}

	@Override
	public Integer obtenerCantidadDeBeneficiario() {
		return this.beneficiarios.size();
	}



}
