import java.util.Scanner;

public class Años_bisiestos {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese un año: ");
        int anno = lector.nextInt();

        if ((anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0)) {
            System.out.println(anno + " es un año bisiesto.");
        } else {
            System.out.println(anno + " no es un año bisiesto.");
        }
    }
}