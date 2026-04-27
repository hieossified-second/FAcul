import java.util.Scanner;

public class vetor {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] numeros = new int[10];

            System.out.println("Digite 10 numeros");

            for(int i = 0; i < 10; i++){
                System.out.println("Numero 1: " + (i + 1) + " ");
                numeros[i] = sc.nextInt();
            }

            for (int i = 0; i < 10; i++) {
                System.out.println("NUMERO DIGITADO: " + (i + 1) + numeros[i]);
            }
            
    }
}
