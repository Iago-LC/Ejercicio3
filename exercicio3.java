package boletín.pkg2;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
        int alto;
        int ancho;
        Scanner sc = new Scanner(System.in);

	System.out.println("Cánto quere que mida de alto? ");
        alto = sc.nextInt();
	System.out.println("Cánto quere que mida de ancho? ");
        ancho = sc.nextInt();

	for (int i = 0; i < ancho; i++) {
            System.out.print("*");
        }
        System.out.println("");
        for (int i = 0; i < alto - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < ancho - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        for (int i = 0; i < ancho; i++) {
            System.out.print("*");            
        }
        System.out.println("");
    }

}

