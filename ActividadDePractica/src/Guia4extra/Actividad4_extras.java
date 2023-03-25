/**
actiidad 4 extra 
 */
package Guia4extra;

public class Actividad4_extras {

    static final int FILAS = 10;
    static final int COLUMNAS = 15;

    public static void main(String[] args) {
        int[][] matriz1 = new int[FILAS][COLUMNAS];
        cargarMatriz(matriz1);
        System.out.println("La suma de todos los elementos "
                + "de la matriz es de: " + sumaDeElementos(matriz1));
        imprimirMatriz(matriz1);
    }

    public static void cargarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 9) + 1;
            }
        }
    }

    public static long sumaDeElementos(int[][] matriz) {
        long total = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                total += matriz[i][j];
            }
        }
        return total;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz[0].length; i++) {
            System.out.print(String.format("%4d", i));
        }
        System.out.println("");

        for (int i = 0; i < matriz.length; i++) {
            System.out.print(i);
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("[" + String.format("%2d", matriz[i][j]) + "]");
            }
            System.out.println("");
        }

    }
}
