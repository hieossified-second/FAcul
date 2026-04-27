import java.util.Scanner;

public class vetores {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] entrada = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero " + (i + 1));
            entrada[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Numero: " + (i + 1) + " = " + entrada[i]);

        }

    }
}
