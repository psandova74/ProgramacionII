package Practico02Calculadora;

public class Calculadora {
	//Definir los atributos
	private double operador1;
	private double operador2;
	private int potencia;

	public Calculadora() {
		operador1=0.0;
		operador2=0.0;
	}
	
	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public Calculadora(double operador1, double operador2) {
		this.operador1=operador1;
		this.operador2=operador2;
	}
	
	public void setOperador1(double operador1) {
		this.operador1=operador1;
	}
	
	public void setOperador2(double operador2) {
		this.operador2=operador2;
	}
	
	public double getOperador1() {
		return operador1;
	}
	
	public double getOperador2() {
		return operador2;
	}
	
	public double sumar() {
		return operador1+operador2;
	}
	
	public double sumar(double operador1,double operador2) {
		return operador1+operador2;
	}

	public double restar() {
		return operador1-operador2;
	}
	
	public double restar(double operador1,double operador2) {
		return operador1-operador2;
	}

	public double multiplicar() {
		return operador1*operador2;
	}
	
	public double multiplicar(double operador1,double operador2) {
		return operador1*operador2;
	}	

	public double dividir() {
		double resultado=0.0;
		if (operador2 != 0.0) 
			resultado =  operador1/operador2;
		return resultado;
	}
	
	public double dividir(double operador1,double operador2) {
		double resultado=0.0;
		if (operador2 != 0.0) 
			resultado =  operador1/operador2;
		return resultado;
	}
	
	public boolean isPositivo(double valor) {
		return valor>=0;
	}

	public String toString () {
		return ("Operador 1= "+this.operador1+" Operador 2= "+this.operador2);
	}
	
	//Practica 5 ejercicio 2  utilizando operador1 de la clase.
	public double potencia() {
		double resultado=1.0;
		for (int i=0;i<this.potencia;i++)
			resultado*=this.operador1;
		return resultado;
	}
	
	//Practica 5 ejercicio 2 de enteros
	public int potencia(int operador,int potencia) {
		int resultado=1;
		for (int i=0;i<potencia;i++)
			resultado*=operador;
		return resultado;
	}
	
	//Practica 5 ejercicio 3
	public int sumatoria(int limite) {
		int resultado=0;
		for (int i=1;i<=limite;i++)
			resultado+=i;
		return resultado;
	}
	
	//Practica 5 ejercicio 4
	public int sumatoria(int limiteInferior ,int limiteSuperior) {
		int resultado=0;
		for (int i=limiteInferior;i<=limiteSuperior;i++)
			resultado+=i;
		return resultado;
	}
	
	//Practica 5 Factorial
	public int factorial(int valor) {
		int resultado=1;
		int i=valor;
	/*
		for (int i=valor;i>0;i--)
			resultado*=i;*/
	//Modificacion Practica 7;
		do {
			resultado*=i;
			i--;
		} while (i>0);
		return resultado;
	}
	
	//Practica 5 ejercicio 7
	public String  contarDivisores(int valor) {
		String divisores="";
		for (int i=valor-1;i>1;i--) {
			if (divisores=="") 
				divisores+=","+i;
			else 
				divisores+=i;	
		}
		return divisores;
	}
}
