package montacarga;

public class Carga {
	private String descrpcion;
	private Double pesoDeLaCarga;

	public Carga(String descripcion,Double pesoDeLaCarga) {
		this.descrpcion=descripcion;
		this.pesoDeLaCarga = pesoDeLaCarga;
	}

	protected Double obtengoPesoDeLaCarga() {
		return pesoDeLaCarga;
	}

	protected void setPesoDeLaCarga(Double pesoDeLaCarga) {
		this.pesoDeLaCarga = pesoDeLaCarga;
	}

	protected String getDescrpcion() {
		return descrpcion;
	}

	protected void setDescrpcion(String descrpcion) {
		this.descrpcion = descrpcion;
	}
	

	
	

}
