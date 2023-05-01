package pb2.unlam.edu.ar;

public class Jugador extends Miembro {
	private Integer numeroCamiseta;
	private String posicion;
	public Jugador(String nombre, String equipo, String apellido, Integer dni,Integer numeroCamiseta,String posicion) {
		super(nombre, equipo, apellido, dni);
		this.numeroCamiseta=numeroCamiseta;
		this.posicion=posicion;

	}

	public Integer getNumeroCamiseta() {
		return numeroCamiseta;
	}



	public void setNumeroCamiseta(Integer numeroCamiseta) {
		this.numeroCamiseta = numeroCamiseta;
	}



	public String getPosicion() {
		return posicion;
	}



	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}



	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "Jugador";
	}
	
	

}
