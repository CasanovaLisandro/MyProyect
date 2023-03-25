/**
 *
 * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10
 * y se muestre su equivalente en romano.
 *
 */
package guiaTeorica;

import java.util.Scanner;

public class Actiidad4Extra {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] numR = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        System.out.println("Ingresar  un número: ");
        int num = teclado.nextInt();
        if ((num >= 1) && (num <= 10)) {
            System.out.println(num+" es en romano: "+numR[num]);
        } 
    }
}
