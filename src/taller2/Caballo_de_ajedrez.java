import java.util.Scanner;

public class Caballo_de_ajedrez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int TAMANO_TABLERO = 8;
        char SIMBOLO_CABALLO = '♞';

        //Ingresa las coordenadas del caballo
        System.out.println("Ingrese la fila (1-8) donde se encuentra el caballo:");
        int fila = scanner.nextInt();
        System.out.println("Ingrese la columna (1-8) donde se encuentra el caballo:");
        int columna = scanner.nextInt();

        //Tablero de ajedrez y ubicación del caballo
        char[][] tablero = new char[TAMANO_TABLERO][TAMANO_TABLERO];
        tablero[fila - 1][columna - 1] = SIMBOLO_CABALLO; // se adapta a la notación del ajedrez (1-8)

        System.out.println("Ubicación actual del caballo:");

        // Imprimir el tablero directamente
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println(); // Esto agrega un salto de línea para la siguiente fila del tablero
        }

        // Posibles moviminetos del caballo 8 por cada movimiento (fila/columna)
        System.out.println("El caballo puede saltar desde " + fila + "-" + columna + " a las siguientes posiciones:");

        int[] filasMovimiento = {-2, -1, 1, 2, -2, -1, 1, 2};
        int[] columnasMovimiento = {-1, -2, -2, -1, 1, 2, 2, 1};

        for (int i = 0; i < 8; i++) {//Ejecutará las ocho direcciones posibles en las que un caballo puede moverse en forma de l.
            int nuevaFila = fila + filasMovimiento[i];//Nuevas coordenadas de fila
            int nuevaColumna = columna + columnasMovimiento[i];//Nuevas coordenadas de columna

            // Verificar si el movimiento está dentro del tablero (8x8)
            if (nuevaFila >= 1 && nuevaFila <= 8 && nuevaColumna >= 1 && nuevaColumna <= 8) {
                System.out.println(nuevaFila + "-" + nuevaColumna);
            }
        }
    }
}