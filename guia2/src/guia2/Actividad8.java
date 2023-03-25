/**
 * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
 * Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
 *
 *           * * * *
 *           *     *
 *           *     *
 *           * * * *
 *
 */
package guia2;

import java.util.Scanner;

public class Actividad8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroDeElementos, i, j;
        System.out.println("Ingrese el número de elemetos (*) de cada lado: ");
        numeroDeElementos = teclado.nextInt();
        if (numeroDeElementos > 0) {
            for (i = 0; i <= numeroDeElementos - 1; i++) {
                for (j = 0; j <= numeroDeElementos - 1; j++) {
                    if ((i == 0) || (i == numeroDeElementos - 1) || (j == 0) || (j == numeroDeElementos - 1)) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                }
                System.out.println("");
            }
        } else {
            System.out.println("¡FIN DEL PROGRAMA, ! No hay cuadrado sin elementos");
        }
        teclado.close();
    }
}
