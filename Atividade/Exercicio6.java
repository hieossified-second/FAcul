//Nome: Kevin da Silva Lima

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] A = new int[4];
        int[] B = new int[7];
        int[] C = new int[11];

     
        for (int i = 0; i < 4; i++) {
            System.out.println("Digite o valor de A[" + i + "]");
            A[i] = entrada.nextInt();
        }

        
        for (int i = 0; i < 7; i++) {
            System.out.println("Digite o valor de B[" + i + "]");
            B[i] = entrada.nextInt();
        }

        
        for (int i = 0; i < 4; i++) {
            C[i] = A[i];
        }

        
        for (int i = 0; i < 7; i++) {
            C[i + 4] = B[i];
        }

        
        System.out.println("Elementos do vetor C:");

        for (int i = 0; i < 11; i++) {
            System.out.println(C[i]);
        }

        entrada.close();
    }
}
