package Practico09Vectores;

import java.util.Scanner;
public class PruebaVector {

	  public static void main(String[] args) {
	        int ResultadoSumatoria=0;
	        int valorMayor, valorMenor;
	        int valorAuxiliar=0;
	        Scanner teclado=new Scanner(System.in);
	        //Instanciar
	        int VectorSumatoria[]=new int[10];
	        
	        //Limpiarlo
	        for (int i=0;i<VectorSumatoria.length;i++) 
	            VectorSumatoria[i]=0;
	        
	        //Cargarl
	        for (int i=0;i<VectorSumatoria.length;i++) {
	            System.out.println("Ingresar valor entro en la posicion: " + (i+1));
	            VectorSumatoria[i]=teclado.nextInt();
	        }
	        
	        //Realizar sumatoria
	        for (int i=0;i<VectorSumatoria.length;i++) 
	             ResultadoSumatoria+=VectorSumatoria[i];
	        
	        //Mostrar valores y Sumatoria. Practica 9 Ejercicio 1
	        for (int i=0;i<VectorSumatoria.length;i++) 
	            System.out.println("El valor de la posision: " + (i+1) +" es: "+VectorSumatoria[i]);
	        System.out.println("La sumatoria del Vector es: " + ResultadoSumatoria);
	        
	        //Buscar el valor mayor
	        valorMayor=VectorSumatoria[0];
	        for (int i=1;i<VectorSumatoria.length;i++) {
	        	if (valorMayor<VectorSumatoria[i])
	        		valorMayor=VectorSumatoria[i];
	        }
	        System.out.println("El mayor valor es: " + valorMayor);
	        
	        //Buscar el valor menor
	        valorMenor=VectorSumatoria[0];
	        for (int i=1;i<VectorSumatoria.length;i++) {
	        	if (valorMenor>VectorSumatoria[i])
	        		valorMenor=VectorSumatoria[i];
	        }
	        System.out.println("El menor valor es: " + valorMenor);
	        
	        //Ordenamiento de Menor a Mayor
	        for (int i=0;i<VectorSumatoria.length;i++) {
	        	for (int j=0;j<VectorSumatoria.length-1;j++) {
	        		if(VectorSumatoria[j]>VectorSumatoria[j+1]) {
	        			valorAuxiliar=VectorSumatoria[j+1];
	        			VectorSumatoria[j+1]=VectorSumatoria[j];
	        			VectorSumatoria[j]=valorAuxiliar;
	        		}
	        	}
	        }
	        //Mostrarlo ordenado
	        System.out.println("Vector ordenado");
	        for (int i=0;i<VectorSumatoria.length;i++) 
	            System.out.println("El valor de la posision: " + (i+1) +" es: "+VectorSumatoria[i]);
	        
	        teclado.close();

	    }
}
