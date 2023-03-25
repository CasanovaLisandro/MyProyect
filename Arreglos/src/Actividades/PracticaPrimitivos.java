/*
 * practica strin nombre y int edad
 */
package Actividades;
import java.util.Scanner;
public class PracticaPrimitivos {

    public static void main(String[] args) {
        int edad = 20;
        String nombre = "camilo";
        System.out.println("nombre " + nombre + " edad es:" + edad);
        cambiarDatos(edad, nombre);
        System.out.println("nombre " + nombre + " edad es:" + edad);
        nombre = cambiarNombre();
        edad = cambiarEdad();
        System.out.println("nombre " + nombre + " edad es:" + edad);
    }
    //por valor (si nun
    private static void cambiarDatos(int edad, String nombre) {
        edad = 40;
        nombre = "camila";
    }
    // cambiamos los valores usamos otra variable  
    private static String cambiarNombre() {
        Scanner teclado =new Scanner(System.in);
        System.out.println("Ingrese el nombre a cambiar: ");
        String datosIngresados= teclado.nextLine();
        return datosIngresados;
    }
    private static int cambiarEdad() {
        Scanner teclado =new Scanner(System.in);
        System.out.println("Ingrese la edad a cambiar: ");
        int datosIngresados= teclado.nextInt();
        return datosIngresados;
    }
}
