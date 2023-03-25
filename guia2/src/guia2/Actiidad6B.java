/**
 * Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla
 * el siguiente menú:El usuario deberá elegir una opción y el programa deberá mostrar el resultado
 * por pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
 * Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente,
 * se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)?
 * Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 *
 */
package guia2;

import java.util.Scanner;

public class Actiidad6B {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double num1, num2;
        int opcion;
        String opcion5;
        System.out.println("Ingrese un número: ");
        num1 = teclado.nextInt();
        boolean van = true;
        System.out.println("Ingrese un segundo número: ");
        num2 = teclado.nextInt();
        do {
            System.out.println("MENÚ\n1.SUMA\n2.RESTA\n3.MULTIPLICACIÓN\n4.DIVISIÓN\n5.SALIR\n");
            System.out.println("Elejir una opción del 1 al 5");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("suma: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("resta: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("multiplicació: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("divisíon: " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    opcion5 = teclado.next();
                    if (opcion5.equalsIgnoreCase("s")) {
                        van = false;
                    }
                    break;
            }
        } while (van);
    }
}
