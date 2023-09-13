import java.util.Random;
import java.util.Scanner;

public class MapaAleatorio {
    public static void main(String[] args) {
        int filas = 10;
        int columnas = 30;
        char[][] mapa = new char[filas][columnas];

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i == 0 || i == filas - 1 || j == 0 || j == columnas - 1) {
                    mapa[i][j] = '#'; // Bordes
                } else if (rand.nextDouble() < 0.3) {
                    mapa[i][j] = '#'; // Pared (30% de probabilidad)
                } else {
                    mapa[i][j] = '.'; // Espacio en blanco (70% de probabilidad)
                }
            }
        }
        int objetosRestantes = 0;
        while (objetosRestantes < 5) {
            int fila = rand.nextInt(filas);
            int columna = rand.nextInt(columnas);

            if (mapa[fila][columna] == '.') {
                mapa[fila][columna] = '■';
                objetosRestantes++;
            }
        }

        int jugadorFila = filas / 2;
        int jugadorColumna = columnas / 2;
        mapa[jugadorFila][jugadorColumna] = '☻';

        while (true) {
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    System.out.print(mapa[i][j]);
                }
                System.out.println();
            }

            System.out.println("Direccion: 1: Derecha | 2: Izquierda | 3: Arriba | 4: Abajo | 0: Salir");
            int movimiento = scanner.nextInt();

            if (movimiento == 0) {
                break;
            }

            int nuevaFila = jugadorFila;
            int nuevaColumna = jugadorColumna;

            switch (movimiento) {
                case 1:
                    nuevaColumna++;
                    break;
                case 2:
                    nuevaColumna--;
                    break;
                case 3:
                    nuevaFila--;
                    break;
                case 4:
                    nuevaFila++;
                    break;
                default:
                    System.out.println("Movimiento no válido.");
                    continue;
            }

            if (nuevaFila >= 0 && nuevaFila < filas && nuevaColumna >= 0 && nuevaColumna < columnas && mapa[nuevaFila][nuevaColumna] != '#') {
                if (mapa[nuevaFila][nuevaColumna] == '■') {
                    objetosRestantes--;
                }

                mapa[jugadorFila][jugadorColumna] = '.';
                mapa[nuevaFila][nuevaColumna] = '☻';
                jugadorFila = nuevaFila;
                jugadorColumna = nuevaColumna;

                if (objetosRestantes == 0) {
                    System.out.println("¡Has recogido todos los objetos! Ganaste.");
                    break;
                }
            } else {
                System.out.println("Movimiento inválido.");
            }
        }

        System.out.println("¡Juego terminado!");
    }
}