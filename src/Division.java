
import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el número 1");
        int numero1 = lector.nextInt();
        System.out.println("Ingrese el número 2");
        int numero2 = lector.nextInt();

        int cociente = numero1/numero2;
        int residuo =  numero1 % numero2;
        System.out.println("• La división es " + residuo);

        if (residuo==0){
            System.out.println("• La división es exacta");
        }else{
            System.out.println("• La división no es exacta");
        }
        System.out.println("Cociente: "+cociente);
        System.out.println("Residuo: "+residuo);
    }
}