/**
 * Realizar un algoritmo que llene un vector con los 100 primeros números enteros y
 * los muestre por pantalla en orden descendente.
 */
package Actividades;

public class Actividad1a {

    public static void main(String[] args) {
        int dimension = 100;
        long[] vector = new long[dimension];
        vector=llenadoVector(dimension);
        mostrarVector(vector);
    }
    private static long[] llenadoVector(int dimension) {
        long[] vector2 = new long[dimension];
        for (int i = 0; i < vector2.length; i++) {
            vector2[i] = i + 1;
        }
        return vector2;
    }
    public static void mostrarVector(long[] vector) {
        System.out.print("vector: \n{");
        for (int i = vector.length - 1; i >= 0; i--) {
            System.out.print(vector[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
