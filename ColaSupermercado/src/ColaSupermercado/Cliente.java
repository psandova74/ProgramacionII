package ColaSupermercado;

public class Cliente {
	private Integer ubicacion;
	private Integer cantidadDeProductos;
	public Cliente(Integer ubicacion, Integer cantidadDeProductos) {
		this.ubicacion=ubicacion;
		this.cantidadDeProductos=cantidadDeProductos;
	}
	public Integer getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(Integer ubicacion) {
		this.ubicacion = ubicacion;
	}
	public Integer getCantidadDeProductos() {
		return cantidadDeProductos;
	}
	public void setCantidadDeProductos(Integer cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}
	

}
