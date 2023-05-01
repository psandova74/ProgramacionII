package pb2.unlam.edu.ar;
/* 
 * Dispositivo para pasar por el telepase 
 */
public class Tag {
	
	private Integer id;
	private Double saldo;
		
	public Tag(Integer id) {
		
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public int compareTo(Tag otroTag) {
		return this.id.compareTo(otroTag.id);
	}

}
