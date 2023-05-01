package Practico10Matrices;
import java.util.Random;
public class Metodos {
	    static Random ran = new Random();
	    static int matriz [][] = new int [9][9];

	    public static void main(String[] args) {
	        generadorAleatorio();
	    }
	    
	    public static void generadorAleatorio (){
	        int i=0,j;
	        
	        while (i < 9){
	            System.out.println("fila:  " + i);
	            j = 0;
	            while (j < 9){
	                System.out.println("Columna" + j);
	                int numero = 1 + ran.nextInt(9);
	                System.out.println(numero);
	                System.out.println(busquedaFilas(numero, i));
	                if (busquedaFilas(numero, i).equalsIgnoreCase("no")) {
	                    
	                    System.out.println(busquedaColumnas(numero, j));
	                    if (busquedaColumnas(numero, j).equalsIgnoreCase("no")) {
	                        
	                        System.out.println(busquedaCaja(numero, i, j));
	                        if (busquedaCaja(numero, i, j).equalsIgnoreCase("no")) {
	                            
	                            matriz[i][j] = numero;
	                            System.out.println(numero + "Valido");
	                            j++;
	                        }
	                    }
	                }
	            }
	            i++;
	        }
	        for (int k = 0; k < 9; k++) {
	            System.out.println("");
	            for (int l = 0; l < 9; l++) {
	                System.out.print(matriz[k][l] + "\t");
	            }
	        }
	        
	    }
	    
	    public static String busquedaFilas (int valor, int filas) {
	        
	        String resultado = "no";
	        for (int i = 0; i < 9; i++) {
	            if (valor == matriz[filas][i]) {
	                resultado = "si";
	                break;
	            }
	        }
	        return resultado;
	    }
	    
	    public static String busquedaColumnas (int valor, int columnas) {
	        
	        String resultado = "no";
	        for (int i = 0; i < 9; i++) {
	            if (valor == matriz[i][columnas]) {
	                resultado = "si";
	                break;
	            }
	        }
	        return resultado;
	    }
	    
	    public static String busquedaCaja (int valor, int filas, int columnas) {
	        
	        int minfila, maxfila;
	        int mincolum, maxcolum;
	        
	        if (filas >= 0 && filas < 3) {
	            minfila = 0;
	            maxfila = 2;
	        }else if (filas >= 3 && filas < 6) {
	            minfila = 3;
	            maxfila = 5;
	        }else {
	            minfila = 6;
	            maxfila = 8;
	        }    
	        
	        if (columnas >= 0 && columnas < 3) {
	            mincolum = 0;
	            maxcolum = 2;
	        }else if (columnas >=3 && columnas <6) {
	            mincolum = 3;
	            maxcolum = 5;
	        }else{
	            mincolum = 6;
	            maxcolum = 8;
	        }
	              
	        String resultado = "no";
	        
	        for (int i = minfila; i <= maxfila ; i++) {
	            for (int j = mincolum; j <= maxcolum; j++) {
	                if (valor == matriz[i][j]) {
	                    resultado = "si";
	                    break;
	                }
	            }
	        }
	        return resultado;
	    }
	}
