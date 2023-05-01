package pb2.unlam.edu.ar;

import java.util.HashMap;
import java.util.Map;

public class PolizaAccidentesPersonales extends SegurosDeVida implements InterfaseBeneficiario {
	private Map<Persona,TipoDeBeneficiario> beneficiarios; 

	public PolizaAccidentesPersonales(Integer numeroPoliza, Persona asegurado, Double sumaAsegurada, Double prima) {
		super(numeroPoliza, asegurado, sumaAsegurada, prima);
		this.beneficiarios = new HashMap<Persona,TipoDeBeneficiario>();
		
	}

	@Override
	public void agregarBeneficiario(Persona nuevaPersona, TipoDeBeneficiario tipoBeneficiario) {
		this.beneficiarios.put(nuevaPersona,tipoBeneficiario);
		
	}

	@Override
	public Integer obtenerCantidadDeBeneficiario() {
		return this.beneficiarios.size();
	}

	protected void setAccidente(Boolean accidente) {
		this.setAccidente(true);
	}
	
	protected Boolean getAccidente() {
		return this.getAccidente();
	}

}
