package Practico09Vectores;

import Practico02Persona.Persona;
public class EstadisticasDePersonas {
	double pesoPromedio;
	int personasBajoPeso;
	int personasPesoNormal;
	int personasSobrepeso;
	int promedioEdadBajoPeso;
	int promedioEdadSobrePeso;
	int cuentaPersonasTotal;
	Persona poblacion[];
	
	public EstadisticasDePersonas() {
		pesoPromedio=0;
		personasBajoPeso=0;
		personasPesoNormal=0;
		personasSobrepeso=0;
		promedioEdadBajoPeso=0;
		promedioEdadSobrePeso=0;
		poblacion=new Persona[5];
	}
	
	public boolean cargaPoblacion(Persona nuevaPersona) {
		boolean respuesta=false;
		for(int i=0; i<5;i++) {
			if (this.poblacion[i]==null) {
				this.poblacion[i]=nuevaPersona;
				
			}
		}
		return respuesta;
		
	}
	public void estadisticas() {
		int sumatoriaEdadBajoPeso=0;
		int sumatoriaEdadSobePeso=0;
		double sumatoriaPesos=0.0;

		for (int i=0;i<poblacion.length;i++) {
			sumatoriaPesos+=poblacion[i].getPeso();
			cuentaPersonasTotal++;
			switch (poblacion[i].calcularIMC()){
			case BAJO_PESO:
				personasBajoPeso++;
				sumatoriaEdadBajoPeso+=poblacion[i].getEdad();
				
				break;
			case NORMO_PESO:
				personasPesoNormal++;
				break;
			case SOBRE_PESO:
				personasSobrepeso++;
				sumatoriaEdadSobePeso+=poblacion[i].getEdad();
				break;					
			}
		}
		promedioEdadBajoPeso=sumatoriaEdadBajoPeso/personasBajoPeso;
		promedioEdadSobrePeso=sumatoriaEdadSobePeso/personasSobrepeso;
		pesoPromedio=sumatoriaPesos/cuentaPersonasTotal;
		
	}

	public double getPesoPromedio() {
		return pesoPromedio;
	}

	public int getPersonasBajoPeso() {
		return personasBajoPeso;
	}

	public int getPersonasPesoNormal() {
		return personasPesoNormal;
	}

	public int getPersonasSobrepeso() {
		return personasSobrepeso;
	}

	public double getPromedioEdadBajoPeso() {
		return promedioEdadBajoPeso;
	}

	public double getPromedioEdadSobrePeso() {
		return promedioEdadSobrePeso;
	}

}
