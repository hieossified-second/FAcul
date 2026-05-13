//Nome: Kevin da Silva Lima

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        int[] numeros = new int[10];

        Scanner entrada = new Scanner(System.in);

        
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o número " + (i + 1));
            numeros[i] = entrada.nextInt();
        }

       
        for (int i = 0; i < 10; i++) {
            System.out.println("Número: " + (i + 1) + " = " + numeros[i]);
        }

        entrada.close();
    }
}