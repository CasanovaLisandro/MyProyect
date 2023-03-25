/**
 *
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
 * pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
 * la función equals() en Java.
 */
package guia2;

import java.util.Scanner;

public class Activid2B {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase;
        System.out.println("Ingresar una frase: ");
        frase = teclado.nextLine();
        if ("eureca".equalsIgnoreCase(frase)) {
            System.out.println("La frase es CORRECTA");
        } else {
            System.out.println("La frase es INCORRECTA");
        }
        teclado.close();
    }
}
