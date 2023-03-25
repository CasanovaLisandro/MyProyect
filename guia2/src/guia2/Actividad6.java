/**
 *
 * Realizar un programa que pida dos números enteros positivos por teclado
 * y muestre por pantalla el siguiente menú:
 *
 *               ************************
 *               *    MENU:             *
 *               *    1. Sumar          *
 *               *    2. Restar         *
 *               *    3. Multiplicar    *
 *               *    4. Diidir         *
 *               *    5. Salir          *
 *               *    Elija una opción: *
 *               ************************
 *
 * El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
 * y luego volver al menú.
 * El programa deberá ejecutarse hasta que se elija la opción 5.
 * Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente,
 * se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)?
 * Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 */
package guia2;

import java.util.Scanner;

public class Actividad6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int número1, número2, opción, resultado=0;
        String mensaje;
        System.out.println("Ingrese un número: ");
        número1 = teclado.nextInt();
        System.out.println("Ingrese un nuevo número: ");
        número2 = teclado.nextInt();
        System.out.println(" ");
        System.out.println("Los números ingresados son " + número1 + " y " + número2);
        System.out.println(" ");
        System.out.println("Ingresar la opción del siguiente menú con la operación a realizar"
                + " Y a continuación precione Enter");
        System.out.println("         ************************\n"
                + "         *     MENÚ:            *\n"
                + "         *    1. Sumar          *\n"
                + "         *    2. Restar         *\n"
                + "         *    3. Multiplicar    *\n"
                + "         *    4. Dividir        *\n"
                + "         *    5. Salir          *\n"
                + "         ************************");
        opción = teclado.nextInt();
        
        switch (opción) {
            case 1:
                resultado = número1 + número2;
                System.out.println("El resultado de sumar " + número1 + " + " + número2 + " es: " + resultado);
                break;
            case 2:
                resultado = número1 - número2;
                System.out.println("El resultado de restar " + número1 + " - " + número2 + " es: " + resultado);
                break;
            case 3:
                resultado = número1 * número2;
                System.out.println("El resultado de multiplicar " + número1 + " * " + número2 + " es: " + resultado);
                break;
            case 4:
                resultado = número1 / número2;
                System.out.println("El resultado de dividir " + número1 + " / " + número2 + " es: " + resultado);
                break;
            case 5:
                System.out.println("Mensaje de confirmación:"
                        + "¿Está seguro que desea salir del programa (S/N)?");
                mensaje = teclado.nextLine();
                if ("N".equalsIgnoreCase(mensaje)) {
                    if ("S".equalsIgnoreCase(mensaje)) {
                        break;
                    }
                }
            default:
                System.out.println("La opción selecciona no coincide con el menú."
                        + " Elija una opción validad (ingrese un número del 1 al 5)");
        }
    }
}
