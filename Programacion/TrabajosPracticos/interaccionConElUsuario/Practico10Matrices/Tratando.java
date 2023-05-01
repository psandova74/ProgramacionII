package Practico10Matrices;

import java.util.Random;
public class Tratando {
 
    public static void GeneradorAleatorio() {
 
        int matriz[][];
        int fila = 1, columna, intentos, valor;
        matriz = PrimeraFila();
        do {
            columna = 0;
            intentos = 0;
            do {
                valor  = SeleccionarValorAzar(matriz, fila, columna);
                if (valor > 0) {
                    matriz[fila][columna] = valor;
                    columna++;
                }else{
                    for (int i = 0; i < columna; i++) {
                        matriz[fila][i] = 0;
                    }
                    intentos++;
                    if (intentos == 5) {
                        System.out.println("intentos: " + intentos);
                        if (fila>0) {
                            fila = fila-1;
                            for (int i = 0; i < 9; i++) {
                                matriz[fila][i] = 0;
                            }
                        }
                        intentos = 0;
                    }
                    columna = 0;
                }
            } while (columna < 9);
            fila++;
        } while (fila < 9);
 
        for (int k = 0; k < 9; k++) {
            System.out.println("");
            for (int h = 0; h < 9; h++) {
                System.out.print(matriz[k][h] + "\t");
            }
        }
    }
 
    public static int [][] PrimeraFila() {
 
        int matriz[][] = new int[9][9];
        Random ran = new Random();
        int fila = 0;
        int numero;
        int em=0;
        int cont=0,j;
        int i = 0;
        while (i < 9) {
            numero = 1 + ran.nextInt(9);
            if (em == 0) {
                matriz[fila][i] = numero;
                em++;
            }else{
                cont = 0;
                j = 0;
                while (j < i) {
                    if (numero == matriz[fila][j]) {
                        cont++;
                        break;
                    }else{
                        matriz[fila][i] = numero;
                    }
                    j++;
                }
            }
            if (cont==0) {
                i++;
            }
        }
 
        return matriz;
    }
 
    public static int [] GetFila(int matriz[][], int fila) {
 
        int filas[] = new int[9];
        System.arraycopy(matriz[fila], 0, filas, 0, 9);
        return filas;
    }
 
    public static int [] GetColumna(int matriz [][], int columna) {
        int columnas[] = new int[9];
        for (int i = 0; i < 9; i++) {
            columnas[i] = matriz[i][columna];
        }
        return columnas;
    }
 
    public static int [] GetCaja(int matriz[][], int filas, int columnas) {
 
        int minfila = 0, maxfila = 0;
        int mincolum = 0, maxcolum = 0;
 
        if (filas >= 0 && filas < 3) {
            minfila = 0;
            maxfila = 2;
        } else if (filas >= 3 && filas < 6) {
            minfila = 3;
            maxfila = 5;
        } else if (filas >= 7 && filas < 9){
            minfila = 6;
            maxfila = 8;
        }
 
        if (columnas >= 0 && columnas < 3) {
            mincolum = 0;
            maxcolum = 2;
        } else if (columnas >= 3 && columnas < 6) {
            mincolum = 3;
            maxcolum = 5;
        } else if (columnas >= 7 && columnas < 9){
            mincolum = 6;
            maxcolum = 8;
        }
 
        int caja[] = new int[9];
        int k = 0;
 
        for (int i = minfila; i <= maxfila; i++) {
            for (int j = mincolum; j <= maxcolum; j++) {
                caja[k] = matriz[i][j];
                k++;
            }
        }
        return caja;
    }
 
    public static int[] unificarArray (int filas[], int columnas[], int caja[]) {
 
        int unificado[] = new int[10];
 
        for (int i = 0; i < 9; i++) {
            if (filas[i]>0) {
                unificado[filas[i]] += 1;
            }
            if (columnas[i]>0) {
                unificado[columnas[i]] += 1;
            }
            if (caja[i]>0) {
                unificado[caja[i]] += 1;
            }
        }
        unificado[0] = 0;
 
        for (int i = 1; i < 10; i++) {
            if (unificado[i] > 0) {
                unificado[i] = i;
            }
        }
        return unificado;
    }
 
    public static int [] TomarAusentes (int unificado[]){
        int cont = 0;
        for (int i = 1; i < 10; i++) {
            if (unificado[i] == 0) {
                cont++;
            }
        }
 
        int ausentes[] = new int [cont];
 
        int k=0;
        for (int j = 1; j < 10; j++) {
            if (unificado[j] == 0) {
                ausentes[k] = j;
                k++;
            }
        }
 
        return ausentes;
    }
 
    public static int [] GetArrayAusentes (int matriz [][], int x, int y){
        int tempfila[] = GetFila(matriz, x);
        int tempcolum[] = GetColumna(matriz, y);
        int tempcaja [] = GetCaja(matriz, x, y);
 
        int temp [] = unificarArray(tempfila, tempcolum, tempcaja);
 
        return TomarAusentes(temp);
    }
 
    public static int SeleccionarValorAzar (int matriz [][], int x, int y){
        int n;
        int temp[] = GetArrayAusentes(matriz, x, y);
 
        for (int i = 0; i < temp.length; i++) {
            System.out.print("\n"+temp[i]+"\t");
        }
 
        Random rand = new Random();
        n = rand.nextInt(temp.length-1);
 
        System.out.println(":" + temp[n]);
        return temp[n];
    }
 
    public static void main(String[] args) {
        GeneradorAleatorio();
    }
}
