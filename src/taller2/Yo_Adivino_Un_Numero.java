package taller2;
import java.util.Random;
import java.util.Scanner;

public class Yo_Adivino_Un_Numero {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // Se genera un número aleatorio entre 1 y 100

        System.out.println("Adivine el numero.");

        Scanner scanner = new Scanner(System.in);
        int attemptNumber = 0;
        // Se inicia un bucle infinito para que el usuario continúe adivinando hasta que acierte
        while (true) {
            attemptNumber++;
            System.out.println("Intento " + attemptNumber + ":");
            int userGuess = scanner.nextInt();

            // Compara la suposición del usuario con el número aleatorio y le da una pista
            if (userGuess < randomNumber) { // Si su suposición es menor, le indica que el número es mayor
                System.out.println("Es mayor que " + userGuess);
            } else if (userGuess > randomNumber) {// Si su suposición es mayor, le indica que el número es menor
                System.out.println("Es menor que " + userGuess);
            } else {
                System.out.println("Correcto. Adivinaste en " + attemptNumber + " intentos.");
                break;
            }
        }
        scanner.close();
    }
}