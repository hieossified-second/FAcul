//Nome: Kevin da Silva Lima

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] A = new int[5];
        int[] B = new int[5];

       
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o valor de A[" + i + "]");
            A[i] = entrada.nextInt();
        }

        
        for (int i = 0; i < 5; i++) {
            B[i] = A[i] * 3;
        }

       
        System.out.println("Elementos do vetor B:");

        for (int i = 0; i < 5; i++) {
            System.out.println(B[i]);
        }

        entrada.close();
    }
}