package taller2;
import java.util.Scanner;
public class Histograma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Positivo = 0;
        int Negativo = 0;

        System.out.println("Ingrese varios valores, termine con cero:");

        while(true) {
            int num = sc.nextInt();

            // Si el número es cero, termina la entrada
            if(num == 0) {
                break;
            }

            // positivos, si el número es mayor a cero
            if(num > 0) {
                Positivo++;
            }

            //  negativos, si el número es menor a cero
            if(num < 0) {
                Negativo++;
            }
        }
        // Imprime el histograma para los números positivos
        System.out.print("Positivos: ");
        for(int i=0; i<Positivo; i++) {
            System.out.print("*");
        }

        System.out.println();

        // Imprime el histograma para los números negativos
        System.out.print("Negativos: ");
        for(int i=0; i<Negativo; i++) {
            System.out.print("*");
        }

    }
}
