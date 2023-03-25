/**
 * sopa de letras
 *
 */
package Guia4extra;

import java.util.Scanner;

public class Actiidad6_extras {

    static final int TAMANIO = 20;

    public static void main(String[] args) {
        char[][] sopa = new char[TAMANIO][TAMANIO];
        cargarSopa(sopa);
        imprimirMatriz(sopa);
    }

    private static void cargarSopa(char[][] sopa) {
        inicializarSopa(sopa);
        cargarPalabras(sopa);

    }

    private static void cargarPalabras(char[][] sopa) {
        Scanner leer = new Scanner(System.in);
        String palabra;
        int random;
        int ingreso = 0;
        for (int i = 0; i < sopa.length; i += (int) (Math.random() * 4) + 1) {
            if (ingreso < 5) {
                System.out.println("Ingrese una palabra");
                palabra = leer.next();
                while ((palabra.length() < 3) || (palabra.length() > 5)) {
                    System.out.println("La palabra debe tener entre 3 y 5 caracteres");
                    palabra = leer.next();
                }
                random = (int) (Math.random() * 14) + 1;
                for (int j = 0; j < palabra.length(); j++) {
                    sopa[i][random + j] = palabra.toLowerCase().charAt(j);

                }
                ingreso++;
            }
        }
    }

    private static void inicializarSopa(char[][] sopa) {
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[0].length; j++) {
                sopa[i][j] = String.valueOf((Math.random() * 9)).charAt(0);

            }

        }
    }

    public static void imprimirMatriz(char[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }

    }

}
