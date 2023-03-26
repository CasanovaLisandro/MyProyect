/**
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un mensaje de
 * Correcto, sino mostrará un mensaje de Incorrecto.
 * Nota: investigar la función equals() en Java.
 */
package guia2;

import java.util.Scanner;

public class Actividad2 {

    public static void main(String[] args) {
        String frase;
        Scanner leerTeclado = new Scanner(System.in) {
        System.out.println("Igrese una frase: ");
        frase = leerTeclado.nextLine();
        System.out.println("Su frase es "+frase);
        }
        if ("eureka".equalsIgnoreCase(frase)){
            System.out.println("La frase es correcta");
        }else{
            System.out.println("La frase es incorrecta");
        }
        leerTeclado.close;

    }

}
