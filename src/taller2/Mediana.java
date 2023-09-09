package taller2;

        import java.util.ArrayList;
        import java.util.Collections;
        import java.util.Scanner;

public class Mediana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> listaNumeros = new ArrayList<Double>();
        String valorIngresado  = "";

        System.out.println("Ingresar números ordenados. Ingresar '.' para detener.");

        // Este while continuará pidiendo entradas al usuario hasta que ingrese "."
        while (!valorIngresado.equals(".")) {
            valorIngresado  = scanner.next();
            // Antes de añadir a la lista, comprobaremos que no es el carácter final "."
            if (!valorIngresado.equals(".")) {
                // Convertimos el valor ingresado a Double y lo añadimos a la lista
                listaNumeros.add(Double.parseDouble(valorIngresado ));
            }
        }

        // Obtenemos el tamaño de la lista para saber si la cantidad de números es par o impar
        int tamanoLista = listaNumeros.size();
        if (tamanoLista % 2 == 0) {
            // Si la cantidad de números es par, se calcula la mediana como el promedio de los dos números en medio
            double mediana = (listaNumeros.get(tamanoLista / 2 - 1) + listaNumeros.get(tamanoLista / 2)) / 2;
            System.out.println("La mediana de los números ingresados es: " + mediana);
        } else {
            //Si la cantidad de números es impar, la mediana es el número que se encuentra en el medio de la lista
            double mediana = listaNumeros.get(tamanoLista / 2);
            System.out.println("La mediana de los números ingresados es: " + mediana);
        }
    }
}