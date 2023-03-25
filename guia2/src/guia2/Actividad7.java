/**
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo
 * lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato fijo:
 *                                      ******
 *              tienen que ser de un máximo de 5 caracteres de largo,
 *              el primer carácter tiene que ser X y el último tiene que ser una O.
 *                                      ******
 * Las secuencias leídas que respeten el formato se consideran correctas,
 *                                      *******
 * la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE),
 * y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
 *                                      *****
 *
 * Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas
 * recibidas.
 *
 * Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java
 * Substring(), Length(), equals().
 *
 */
package guia2;

import java.util.Scanner;

public class Actividad7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contCorrecta = 0, contIncorrecta = 0;
        String frase;
        System.out.println("ingresar una frase: ");
        frase = teclado.next();
        while (!("&&&&&".equals(frase))) {
            if (frase.length() == 5) {
                if (("x".equalsIgnoreCase(frase.substring(0, 1))) && ("o".equalsIgnoreCase(frase.substring(4, 5)))) {
                    contCorrecta++;
                    System.out.println("La frase es CORRECTA");
                } else {
                    contIncorrecta++;
                    System.out.println("La frase es INCORRECTA");
                }
            } else {
                contIncorrecta++;
                System.out.println("La frase es INCORRECTA");
            }
            System.out.println("Ingresar una frase: ");
            frase = teclado.next();
        }
        teclado.close();
        System.out.println("La catidad de frases CORRECTA es " + contCorrecta + " y la cantidad de INCORRECTAS es " + contIncorrecta);
    }
}