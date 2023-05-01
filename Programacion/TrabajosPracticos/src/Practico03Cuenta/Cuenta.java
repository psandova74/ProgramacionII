package Practico03Cuenta;

public class Cuenta {
	private String titular;
	private double saldo;
	
	public Cuenta(String titular) {
		this.titular=titular;
		this.saldo=0.0;
	}
	public Cuenta() {
		this.titular="";
		this.saldo=0.0;
	}
	public Cuenta(String titular, double saldoInicial) {
		this.titular=titular;
		this.saldo=saldoInicial;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double saldo) {
		this.saldo += saldo;
	}

	public void retirar(double saldo) {
		if (this.saldo>= saldo)
			this.saldo -= saldo;
	}
	
	/*public String toString () {
		return ("Titular= "+this.titular+" Saldo= "+this.saldo);
	}
	*/

}
