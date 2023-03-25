/**
 * Crear un programa que dado un número determine si es par o impar.
 */
package guia2;
import java.util.Scanner;
public class Actiidad1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar un numero: ");
        int numero;
        numero = teclado.nextInt();
        if (numero % 2 == 0) {
            System.out.println("el número es par ");
        } else {
            System.out.println("el númro es impar ");
        }
    }

}
