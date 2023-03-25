/**
 * Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo.
 * Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje
 * por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
 * Nota: investigar la función Lenght() en Java.
 */
package guia2;

import java.util.Scanner;

public class Actividad3 {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase;
        System.out.println("Ingresar frases o palabras con un máximo de 8 caracteres ");
        frase = teclado.nextLine();
        if(frase.length() == 8){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
        
    }

}
