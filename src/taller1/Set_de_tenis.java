package taller1;

import java.util.Scanner;

public class Set_de_tenis {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el número de juegos ganados por el jugador A:");
        int m = lector.nextInt();
        System.out.println("Ingrese el número de juegos ganados por el jugador B:");
        int n = lector.nextInt();

        if (Math.abs(m - n)>2) {
            System.out.println("Resultado inválido");
        } else if ( m < 6 && n < 6) {
            System.out.println("El set todavía no termina");
        } else if (m == 6 && n == 6) {
            System.out.println("Empate");
        } else if ( m >= 6 && (m - n) >= 2) {
            System.out.println("El jugador A ganó el set");
        } else if ( n >= 6 && (n - m) >= 2) {
            System.out.println("El jugador B ganó el set");
        } else {
            System.out.println("El set todavía no termina");
        }
    }
}
