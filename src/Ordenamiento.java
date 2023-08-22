import java.util.Arrays;
import java.util.Scanner;

public class Ordenamiento {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int[] numeros = new int[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Ingrese el numero: ");
            numeros[i] = lector.nextInt();
        }


        int n = numeros.length;
        for (int i = 1; i < n; i++) {
            int valorActual = numeros[i];
            int j = i - 1;

            while (j >= 0 && numeros[j] > valorActual) {
                numeros[j + 1] = numeros[j];
                j--;
            }
            numeros[j + 1] = valorActual;
        }

        System.out.print("Números ordenados: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}