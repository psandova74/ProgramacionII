package pb2.unlam.edu.ar;



public abstract class Vehiculo {
	
	
	private String Patente;
	public Vehiculo(String patente) {
		
		Patente = patente;
	}
	

	public abstract String getTipo();


	protected String getPatente() {
		return Patente;
	}


	protected void setPatente(String patente) {
		Patente = patente;
	}
	
	

	

}
