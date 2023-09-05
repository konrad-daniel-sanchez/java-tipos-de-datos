package taller1;

import java.util.Scanner;

public class Letra_Numero {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print ("Inserte un caracter: ");
        char caracter = lector.next().charAt(0);

        if ((caracter >= 'A' && caracter <= 'Z') || (caracter >= 'a' && caracter <= 'z')) {
            if (caracter >= 'A' && caracter <= 'Z') {
                System.out.println("Es letra mayúscula");
            } else {
                System.out.println("Es letra minúscula");
            }
        } else if (caracter >= '0' && caracter <= '9') {
            System.out.println("Es número");
        } else {
            System.out.println("No es letra ni número");
        }
    }
}