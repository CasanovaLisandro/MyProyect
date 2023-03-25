/**
 * Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
 * es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla
 * que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
 * Nota: investigar la función Substring y equals() de Java.
 */
package guia2;
import java.util.Scanner;
public class Actividad4 {
    public static void main(String[] args) {
        String frase;
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Ingresar una frase: ");
            frase = teclado.nextLine();
        }
        if ("a".equalsIgnoreCase(frase.substring(0, 1))) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }

    }

}
