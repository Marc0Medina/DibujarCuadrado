import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;

        do {
            System.out.print("Ingresa un número para el tamaño del cuadrado: ");
            n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("El tamaño debe ser entero positivo.");
            } else {
                if (CuadradoAsteriscos.visible) {
                    CuadradoAsteriscos.dibujarCuadrado(n);
                } else {
                    System.out.println("El cuadrado es invisible.");
                }
            }

            System.out.print("¿Quieres cambiar el tamaño (s/n)? ");
            char yn = scanner.next().charAt(0);

            if (yn == 'n') {
                System.out.println("¡Listo, papi!");
                break;
            }

            System.out.print("¿Quieres hacerlo visible o invisible (v/i)? ");
            char vi = scanner.next().charAt(0);
            CuadradoAsteriscos.visible = (vi == 'v');

        } while (true);
        scanner.close();
    }
}