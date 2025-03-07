import java.util.Scanner;

public class CuadradoAsteriscos {

    public static boolean visible = true; // Atributo para controlar la visibilidad



    public static void dibujarCuadrado(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
