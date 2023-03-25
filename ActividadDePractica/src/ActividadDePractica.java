/**
 *
 * Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas
 * por teclado e indique si son mayores o menores de edad. Después de cada persona, el programa debe preguntarle
 * al usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 *---------------------------------FALTA TERMINAR--------------------------------------------------
 */
import java.util.Scanner;

public class ActividadDePractica {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String información = "";
        System.out.println("Ingrese el total de personas: ");
        int personas = teclado.nextInt();
        System.out.println("Ingrese el nombre de la persona: ");
        String nombreDepersona = teclado.nextLine();
        System.out.println("Ingrese la edad de persona: ");
        int edadeDepersona = teclado.nextInt();
        while (true) {
            información += NombreYedad();
            System.out.println("¿Desea continuar? Si/No");
            String respuesta = teclado.nextLine();
            if ("no".equalsIgnoreCase(respuesta)) {
                
                

            } else {
            }

        }

    }

    public static String NombreYedad() {
        Scanner teclado = new Scanner(System.in);
        String legalidad;
        System.out.println("Igresar el nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("Igresar la edad: ");
        int edad = teclado.nextInt();
        if (edad >= 18) {
            legalidad = "mayor";
        } else {
            legalidad = "menor";
        }
        return ("nombre: " + nombre + " edadad: " + edad + " la persona es " + legalidad + "\n");
    }
}
