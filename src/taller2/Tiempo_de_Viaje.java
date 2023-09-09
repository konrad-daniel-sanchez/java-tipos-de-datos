package taller2;
import java.util.Scanner;
public class Tiempo_de_Viaje {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int totalMinutos = 0;
// Iniciamos un bucle infinito para pedir al usuario los minutos de cada tramo del viaje.
        while (true) {
            System.out.print("Duracion tramo: ");//  Introduce los minutos de un tramo.
            int tramo = input.nextInt();

            if (tramo == 0) {// Comprobamos si el tramo no es un 0
                break;
            }
            totalMinutos += tramo;
        }

        int horas = totalMinutos / 60;
        int minutos = totalMinutos % 60;

        System.out.println("Tiempo total de viaje: " + horas + ":" + minutos);

        input.close();
    }
}
