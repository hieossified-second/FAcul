//Nome: Kevin da Silva Lima

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[5];

       
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o valor de A[" + i + "]");
            A[i] = entrada.nextInt();
        }

       
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o valor de B[" + i + "]");
            B[i] = entrada.nextInt();
        }

        
        for (int i = 0; i < 5; i++) {
            C[i] = A[i] - B[i];
        }

       
        System.out.println("Elementos do vetor C:");

        for (int i = 0; i < 5; i++) {
            System.out.println(C[i]);
        }

        entrada.close();
    }
}