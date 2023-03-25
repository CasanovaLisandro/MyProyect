/**
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
 * solicite números al usuario hasta que la suma de los números introducidos supere el límite
 * inicial.
 */
package guia2;
import java.util.Scanner;
public class Actividad5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numMax, numero, suma = 0;
        System.out.println("Ingresar el límite máximo: ");
        numMax = teclado.nextInt();
        while (suma < numMax) {
            System.out.println("Igrese un número: ");
            numero = teclado.nextInt();
            suma = suma + numero;
        }
        teclado.close();
    }
}
