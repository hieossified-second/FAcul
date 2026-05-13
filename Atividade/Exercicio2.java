//Nome: Kevin da Silva Lima

import java.util.Scanner;


public class Exercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[10];

      
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o número " + (i + 1));
            numeros[i] = entrada.nextInt();
        }

        
        System.out.println("Números pares:");

        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }

       
        System.out.println("Números ímpares:");

        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.println(numeros[i]);
            }
        }

        entrada.close();
    }
}